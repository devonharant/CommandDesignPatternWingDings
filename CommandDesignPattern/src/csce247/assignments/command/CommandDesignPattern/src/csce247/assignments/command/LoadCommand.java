package csce247.assignments.command;

/**
 * LoadCommand class to be used by the InputHandler class
 * that allows the input handler to call a document's 
 * load() command indirectly
 * @author WingDings
 *
 */
public class LoadCommand implements Command{
	
	private Document document;
	
	/**
	 *  LoadCommand constructor, sets given doc to private document
	 *  @param doc
	 */
	public LoadCommand(Document doc) {
		this.document = doc;
	}
	
	/**
	 * execute() method that calls to documents load method
	 */
	public void execute() {
		document.load();
	}
}
