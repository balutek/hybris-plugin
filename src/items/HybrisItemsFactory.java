package items;

import com.intellij.ide.actions.OpenFileAction;
import com.intellij.lang.StdLanguages;
import com.intellij.openapi.actionSystem.DataKeys;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.OpenFileDescriptor;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowAnchor;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiFile;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.xml.XmlFile;
import com.intellij.psi.xml.XmlTag;
import com.intellij.ui.components.JBList;
import com.sun.org.apache.xpath.internal.operations.Mod;
import items.cmp.HybrisExplorer;
import items.listener.GoToLineListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

      XmlFile opocoreItems = (XmlFile)FilenameIndex
              .getFilesByName(project, "opocore-items.xml", GlobalSearchScope.allScope(project))[0]
              .getViewProvider()
              .getPsi(StdLanguages.XML);

      int lineInEditor = opocoreItems.getRootTag().getSubTags()[4].getTextOffset();

      JLabel someLabel = new JLabel("Some stupid text.");
      someLabel.addMouseListener(new GoToLineListener(project, opocoreItems.getVirtualFile(), false, lineInEditor));
      toolWindow.getComponent().add(new HybrisExplorer());
   }

}
