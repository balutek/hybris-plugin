package hybrisplugin.items;

/**
 * @author Paweł Łabuda
 */
public class HybrisItemsFactory
//        implements ToolWindowFactory
{
//   @Override
//   public void createToolWindowContent(final Project project, final ToolWindow toolWindow)
//   {
//      final XmlFile opocoreItems = (XmlFile)FilenameIndex.getFilesByName(project, "opocore-items.xml", GlobalSearchScope.allScope(project))[0].getViewProvider().getPsi(StdLanguages.XML);
//
//      XmlTreeModel xmlTreeModel = new XmlTreeModel(opocoreItems.getRootTag());
//      XmlTree xmlTree = new XmlTree(xmlTreeModel);
//
//      xmlTree.addTreeSelectionListener(new TreeSelectionListener()
//      {
//         @Override
//         public void valueChanged(TreeSelectionEvent e)
//         {
//            XmlTag currentXmlTag = (XmlTag) e.getPath().getLastPathComponent();
//
//            OpenFileDescriptor descriptor = new OpenFileDescriptor(project, opocoreItems.getVirtualFile(), currentXmlTag.getTextOffset());
//            FileEditorManager.getInstance(project).openTextEditor(descriptor, true);
//         }
//      });
//
//      toolWindow.getContentManager().addContent(new ContentImpl(new JBScrollPane(xmlTree), "Items", false));
//   }

}
