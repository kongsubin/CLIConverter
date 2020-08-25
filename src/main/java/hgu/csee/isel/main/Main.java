package hgu.csee.isel.main;

import hgu.csee.isel.CLI.command.Task;
import picocli.CommandLine;

public class Main {
	public static void main(String[] args) {
		// 1. Input
		Task task = new Task();
		CommandLine cmd = new CommandLine(task);
		cmd.run(task, args);
		
	
	}

}