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
   *
   * @input
   */
  public InputHandler(Document document) {
    commands = new HashMap<String, Command>();
  }

  /**
   * intputEntered method that will call the appropriate command that's key matches the data
   * parameter.
   *
   * @param data
   */
  public void inputEntered(String data) {
    //commands<data>.execute();
  }
}
