package csce247.assignments.command;

/**
 * PrintCommand class to be used by the InputHandler class
 * that allows the input handler to call a document's 
 * print() command indirectly
 * @author WingDings
 *
 */
public class PrintCommand implements Command{
	
	private Document document;
	
	/**
	 *  PrintCommand constructor, sets given doc to private document
	 *  @param doc
	 */
	public PrintCommand(Document doc) {
		this.document = doc;
	}
	
	/**
	 * execute() method that calls to documents print method
	 */
	public void execute() {
		document.print();
	}

}
