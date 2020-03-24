package csce247.assignments.command;

/**
 * SaveCommand class to be used by the InputHandler class
 * that allows the input handler to call a document's 
 * save() command indirectly
 * @author WingDings
 *
 */
public class SaveCommand implements Command {
	
	private Document document;
	
	/**
	 *  SaveCommand constructor, sets given doc to private document
	 *  @param doc
	 */
	public SaveCommand(Document doc) {
		this.document = doc;
	}
	
	/**
	 * execute() method that calls to documents save method
	 */
	public void execute() {
		document.save();
	}
}
