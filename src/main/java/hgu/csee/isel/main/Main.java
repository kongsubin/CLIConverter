package hgu.csee.isel.main;

import hgu.csee.isel.CLI.CLIConverter;
import hgu.csee.isel.CLI.Input;
import hgu.csee.isel.CLI.InputConverter;

public class Main {
	public static void main(String[] args) {
		// 1. Input
		InputConverter inputConverter = new CLIConverter();
		Input input = inputConverter.getInputFrom(args);
	}

}
