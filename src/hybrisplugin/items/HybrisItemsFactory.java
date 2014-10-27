package hybrisplugin.items;

import com.intellij.lang.StdLanguages;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.OpenFileDescriptor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.xml.XmlFile;
import com.intellij.psi.xml.XmlTag;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.content.impl.ContentImpl;
import hybrisplugin.items.xml.tree.XmlTree;
import hybrisplugin.items.xml.tree.XmlTreeModel;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

/**
 * @author Paweł Łabuda
 */
public class HybrisItemsFactory implements ToolWindowFactory
{
   @Override
   public void createToolWindowContent(final Project project, final ToolWindow toolWindow)
   {
      final XmlFile opocoreItems = (XmlFile)FilenameIndex.getFilesByName(project, "opocore-items.xml", GlobalSearchScope.allScope(project))[0].getViewProvider().getPsi(StdLanguages.XML);

      XmlTreeModel xmlTreeModel = new XmlTreeModel(opocoreItems.getRootTag());
      XmlTree xmlTree = new XmlTree(xmlTreeModel);

      xmlTree.addTreeSelectionListener(new TreeSelectionListener()
      {
         @Override
         public void valueChanged(TreeSelectionEvent e)
         {
            XmlTag currentXmlTag = (XmlTag) e.getPath().getLastPathComponent();

            OpenFileDescriptor descriptor = new OpenFileDescriptor(project, opocoreItems.getVirtualFile(), currentXmlTag.getTextOffset());
            FileEditorManager.getInstance(project).openTextEditor(descriptor, true);
         }
      });

      toolWindow.getContentManager().addContent(new ContentImpl(new JBScrollPane(xmlTree), "Items", false));
   }

}
