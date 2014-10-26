package listener;

import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.OpenFileDescriptor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author Paweł Łabuda
 */
public class GoToLineListener implements MouseListener
{
   private Project project;

   private VirtualFile fileToOpen;

   private boolean focusEditorAfterClick;

   // Usually offset of PsiElement
   private int lineInEditor;

   public GoToLineListener(Project project, VirtualFile fileToOpen, boolean focusEditorAfterClick, int lineInEditor)
   {
      this.project = project;
      this.fileToOpen = fileToOpen;
      this.focusEditorAfterClick = focusEditorAfterClick;
      this.lineInEditor = lineInEditor;
   }

   @Override
   public void mouseClicked(MouseEvent e)
   {
      final OpenFileDescriptor openFileDescriptor = new OpenFileDescriptor(project, fileToOpen, lineInEditor);
      FileEditorManager.getInstance(project).openTextEditor(openFileDescriptor, focusEditorAfterClick);
   }

   @Override
   public void mousePressed(MouseEvent e)
   {

   }

   @Override
   public void mouseReleased(MouseEvent e)
   {

   }

   @Override
   public void mouseEntered(MouseEvent e)
   {

   }

   @Override
   public void mouseExited(MouseEvent e)
   {

   }

}
