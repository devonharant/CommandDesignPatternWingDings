package csce247.assignments.command;

public class Document {
	
	/**
	 * Documented named ... is created
	 * @param name
	 */
	public Document(String name) {
		this.name = name;
	}
	
	/**
	 * document ... is loaded into view
	 * 
	 */
	public void load() {
		System.out.println("document" + name + "is loaded into view");
	}
	
	/**
	 * document ... is being checked for spelling errors
	 * 
	 */
	public void spell() {
		System.out.println("document" + name + "is being checked for spelling errors");
	}
	
	/**
	 *document ... is being saved...
	 * 
	 */
	public void save() {
		System.out.println("document" + name + "is being saved");
	}
	
	/**
	 *  document ... is printing...
	 * 
	 */
	public void print() {
		System.our.println("document" + name "is printing");
	}
}
