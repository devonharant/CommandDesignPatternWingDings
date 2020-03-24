package csce247.assignments.command;

/**
 * SpellCommand class to be used by the InputHandler class
 * that allows the input handler to call a document's 
 * spell() command indirectly
 * @author WingDings
 *
 */
public class SpellCommand implements Command{
	
	private Document document;
	
	/**
	 *  SpellCommand constructor, sets given doc to private document
	 *  @param doc
	 */
	public SpellCommand(Document doc) {
		this.document = doc;
	}
	
	/**
	 * execute() method that calls to documents spell method
	 */
	public void execute() {
		document.spell();
	}

}
