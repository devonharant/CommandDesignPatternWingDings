package csce247.assignments.command;

/**
 * *INSERT CLASS NAME AND DESC HERE*
 *
 * @author WingDings
 *
 */
public class Document {

  public String name;

  /**
   * Documented named ... is created
   *
   * @param name
   */

  public Document(String name) {
    this.name = name;
    System.out.println("Document named " + name + " is created");
  }

  /**
   * load method that simulates loading
   *
   * @return document ... is loaded into view
   */
  public void load() {
    System.out.println("Document " + name + " is loaded into view");
  }

  /**
   * spell method that simulates spelling
   *
   * @return document ... is being checked for spelling errors
   */
  public void spell() {
    System.out.println("Document " + name + " is being checked for spelling errors");
  }

  /**
   * save method that simulates saving
   *
   * @return document ... is being saved...
   */
  public void save() {
    System.out.println("Document " + name + " is being saved");
  }

  /**
   * print method that simulates printing
   *
   * @return document ... is printing...
   */
  public void print() {
    System.out.println("Document " + name + " is printing");
  }
}
