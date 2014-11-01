package cmp.tree.listener;

import cmp.HybrisExplorer;
import cmp.tree.HybrisExplorerTree;
import cmp.tree.node.ItemtypeTagNode;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.OpenFileDescriptor;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.intellij.psi.impl.file.impl.FileManager;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.xml.XmlFile;
import com.intellij.ui.DoubleClickListener;
import com.intellij.ui.treeStructure.Tree;

import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Paweł Łabuda
 */
public class NavigateToLineListener extends MouseAdapter
{
   private HybrisExplorerTree tree;

   public NavigateToLineListener(HybrisExplorerTree tree)
   {
      this.tree = tree;
   }

   @Override
   public void mouseClicked(MouseEvent e)
   {
      if(e.getClickCount() == 2)
      {
         onDoubleClick(e);
      }
   }

   protected boolean onDoubleClick(MouseEvent event)
   {
      TreePath selectedNodePath = tree.getClosestPathForLocation(event.getX(), event.getY());

      if(selectedNodePath != null)
      {
         Object selectedNode = selectedNodePath.getLastPathComponent();
         if(selectedNode instanceof ItemtypeTagNode)
         {
            ItemtypeTagNode itemtypeTagNode = (ItemtypeTagNode)selectedNode;
            int itemtypeOffset = itemtypeTagNode.getItemtypeXmlTag().getTextOffset();
            XmlFile moduleItemsXmlFile = getModuleXmlFile(itemtypeTagNode.getModule());

            OpenFileDescriptor descriptor =
                    new OpenFileDescriptor(tree.getProject(), moduleItemsXmlFile.getVirtualFile(), itemtypeOffset);
            FileEditorManager.getInstance(tree.getProject()).openTextEditor(descriptor, true);
            return true;
         }
      }

      return false;
   }

   private XmlFile getModuleXmlFile(Module module)
   {
      Project project = tree.getProject();
      PsiFile[] itemsXmlFiles = FilenameIndex.getFilesByName(project, module.getName() + "-items.xml",
           GlobalSearchScope.allScope(project));
      if(itemsXmlFiles.length > 0)
      {
         return (XmlFile)itemsXmlFiles[0];
      }
      return null;
   }
}
