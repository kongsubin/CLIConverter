package hgu.csee.isel.CLI.command;

import static picocli.CommandLine.*;
import picocli.CommandLine;
import picocli.CommandLine.Model.CommandSpec;


@Command(
		  subcommands = {
		      BICCommand.class,
		      PatchCommand.class,
		      MetricCommand.class,
		      DeveloperMetricCommand.class
		  },
		  mixinStandardHelpOptions = true,
		  usageHelpAutoWidth = true,
		  sortOptions = false
		)

public class Task implements Runnable {

	@Spec CommandSpec spec;
	
	@Override
    public void run() {
		new CommandLine(spec).usage(System.out);
    }
}
