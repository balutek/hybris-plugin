package items;

import com.intellij.ide.actions.OpenFileAction;
import com.intellij.lang.StdLanguages;
import com.intellij.openapi.actionSystem.DataKeys;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiFile;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.xml.XmlFile;
import com.intellij.psi.xml.XmlTag;
import com.intellij.ui.components.JBList;
import com.sun.org.apache.xpath.internal.operations.Mod;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Paweł Łabuda
 */
public class HybrisItemsFactory implements ToolWindowFactory
{
   @Override
   public void createToolWindowContent(final Project project, ToolWindow toolWindow)
   {
      DefaultListModel listModel = new DefaultListModel();
      final Module[] modules = ModuleManager.getInstance(project).getModules();
      for (Module module : modules)
      {
         listModel.addElement(module);
      }

      JBList list = new JBList();
      list.setModel(listModel);
      list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//      list.setCellRenderer(new ListCellRenderer()
//      {
//         @Override
//         public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
//                                                       boolean cellHasFocus)
//         {
//            return new JLabel(((Module) value).getName() + "-items.xml");
//         }
//      });

      list.addListSelectionListener(new ListSelectionListener()
      {
         @Override
         public void valueChanged(ListSelectionEvent e)
         {
            Module module = modules[e.getFirstIndex()];
            String moduleItemsFileName = module.getName() + "-items.xml";
            System.out.println(moduleItemsFileName);
            PsiFile[] moduleItemsFiles =
                    FilenameIndex.getFilesByName(project, moduleItemsFileName, GlobalSearchScope.moduleScope(module));
            for (PsiFile moduleItemsFile : moduleItemsFiles)
            {
               OpenFileAction.openFile(moduleItemsFile.getVirtualFile(), project);
            }

         }
      });

      toolWindow.getComponent().add(list);
   }

   public void opocoreItemsFunnyStuff(Project project, ToolWindow toolWindow)
   {

      PsiFile[] opocoreItems =
              FilenameIndex.getFilesByName(project, "opocore-items.xml", GlobalSearchScope.allScope(project));
      if(opocoreItems.length < 1)
      {
         toolWindow.getComponent().add(new JLabel("No items were found."));
      }
      else
      {
         FileViewProvider fileViewProvider = opocoreItems[0].getViewProvider();
         XmlFile xmlFile = (XmlFile)fileViewProvider.getPsi(StdLanguages.XML);
         JBList list = new JBList();
         DefaultListModel listModel = new DefaultListModel();
         list.setModel(listModel);
         addChildren(listModel, xmlFile.getRootTag(), 2);
         toolWindow.getComponent().add(list);
      }
   }

   private void addChildren(DefaultListModel listModel, XmlTag rootTag, int theDeepestTreeLevel)
   {
      if(rootTag != null)
      {
         addChildrenRecursively(listModel, rootTag, theDeepestTreeLevel, 0);
      }
      else
      {
         listModel.addElement("Root tag isn't properly defined.");
      }
   }

   private void addChildrenRecursively(DefaultListModel list, XmlTag xmlTag, int theDeepestTreeLevel, int currentTreeLevel)
   {
      list.addElement(xmlTag.getName());
      if (currentTreeLevel < theDeepestTreeLevel)
      {
         XmlTag[] subTags = xmlTag.getSubTags();
         for (XmlTag subTag : subTags)
         {
            addChildrenRecursively(list, subTag, theDeepestTreeLevel, currentTreeLevel+1);
         }
      }
   }

}
