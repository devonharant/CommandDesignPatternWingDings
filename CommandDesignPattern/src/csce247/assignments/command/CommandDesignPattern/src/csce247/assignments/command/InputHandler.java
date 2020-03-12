package csce247.assignments.command;

import java.util.*;

public class InputHandler {
	
	/**
	 * Holds a hashmap for the commands, and their input keys
	It is initialized in the constructor
	key -> value
	"load"-> LoadCommand
	"save" -> SaveCommand
	"spell" -> SpellCheckCommand
	"print" -> PrintCommand
	 */
	private HashMap<String, Command> commands;
	
	
	public InputHandler(Document document) {
		//Todo 
	}
	
	/**
	 * When this method is called you will call the appropriate command that's key matches the data parameter.
	 * @param data
	 */
	public void inputEntered(String data) {
		//Todo
	}
}
