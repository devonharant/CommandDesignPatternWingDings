package csce247.assignments.command;

import java.util.HashMap;

/**
 * Input Handler Class This class takes the input and decides what the system will do after
 *
 * @author WingDings
 *
 */
public class InputHandler {

  /**
   * Holds a hashmap for the commands, and their input keys It is initialized in the constructor key
   * -> value "load"-> LoadCommand "save" -> SaveCommand "spell" -> SpellCheckCommand "print" ->
   * PrintCommand
   */
  private HashMap<String, Command> commands;

  /**
   * Constructs hashmap with commands
   * @input
   */
  public InputHandler(Document document) {
    commands = new HashMap<>();
    
    commands.put("load", LoadCommand);
    commands.put("print", PrintCommand);
    commands.put("save", SaveCommand);
    commands.put("spell", SpellCommand);
  }

  /**
   * intputEntered method that will call the appropriate command that's key matches the data
   * parameter.
   *
   * @param data
   */
  public void inputEntered(String data) {
	if(!data.equalsIgnoreCase("load") || !data.equalsIgnoreCase("print") || !data.equalsIgnoreCase("save") || !data.equalsIgnoreCase("spell")) {
		System.out.println("We do not recognize that command");
		return;
	}
    Command command = commands.get(data);
    command.execute();
    
  }
}
