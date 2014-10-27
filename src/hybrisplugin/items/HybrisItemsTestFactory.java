package hybrisplugin.items;

import com.intellij.lang.StdLanguages;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.OpenFileDescriptor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.psi.XmlElementFactory;
import com.intellij.psi.XmlElementVisitor;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.xml.XmlFile;
import com.intellij.psi.xml.XmlTag;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.content.impl.ContentImpl;
import hybrisplugin.items.xml.testtree.XmlTree;
import hybrisplugin.items.xml.testtree.XmlTreeModel;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Paweł Łabuda
 */
public class HybrisItemsTestFactory implements ToolWindowFactory
{
   @Override
   public void createToolWindowContent(final Project project, final ToolWindow toolWindow)
   {
      XmlTag firstModule = XmlElementFactory.getInstance(project).createTagFromText("first module");
      XmlTag secondModule = XmlElementFactory.getInstance(project).createTagFromText("second module");
      List<XmlTag> itemtypes = getOpocoreItems(project);
      HashMap<XmlTag, List<XmlTag>> treeStructureData = new HashMap<XmlTag, List<XmlTag>>();
      treeStructureData.put(firstModule, itemtypes);
      treeStructureData.put(secondModule, itemtypes);

      XmlTreeModel xmlTreeModel = new XmlTreeModel(project, treeStructureData);
      XmlTree xmlTree = new XmlTree(xmlTreeModel);
      xmlTree.setRootVisible(true);

      final XmlFile opocoreItems = (XmlFile)FilenameIndex.getFilesByName(project, "opocore-items.xml", GlobalSearchScope.allScope(project))[0].getViewProvider().getPsi(StdLanguages.XML);

      xmlTree.addTreeSelectionListener(new TreeSelectionListener()
      {
         @Override
         public void valueChanged(TreeSelectionEvent e)
         {
            XmlTag currentXmlTag = (XmlTag) e.getPath().getLastPathComponent();

            if("itemtypes".equals(currentXmlTag.getName())){

               OpenFileDescriptor descriptor = new OpenFileDescriptor(project, opocoreItems.getVirtualFile(), currentXmlTag.getTextOffset());
               FileEditorManager.getInstance(project).openTextEditor(descriptor, true);
            }
         }
      });

//      SimpleToolWindowPanel toolWindowPanel = new SimpleToolWindowPanel(true);
//      toolWindowPanel.setToolbar(new SearchTextField());

      toolWindow.getContentManager().addContent(new ContentImpl(new JBScrollPane(xmlTree), "Items", false));
   }

   private List<XmlTag> getOpocoreItems(Project project)
   {
      final XmlFile opocoreItems = (XmlFile)FilenameIndex.getFilesByName(project, "opocore-items.xml", GlobalSearchScope.allScope(project))[0].getViewProvider().getPsi(StdLanguages.XML);
      final List<XmlTag> items = new ArrayList<XmlTag>();
      opocoreItems.accept(new XmlElementVisitor()
      {
         @Override
         public void visitXmlTag(XmlTag tag)
         {
            if("itemtype".equals(tag.getName()))
            {
               items.add(tag);
            }
         }
      });
      return items;
   }

}
