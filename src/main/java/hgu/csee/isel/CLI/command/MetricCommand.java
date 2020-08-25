package hgu.csee.isel.CLI.command;

import hgu.csee.isel.CLI.Input;
import hgu.csee.isel.CLI.Input.TaskType;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
		  name = "metric",
		  description = "collect metrics from all changes and making the arff file.",
		  usageHelpAutoWidth = true,
		  usageHelpWidth = 200,
		  sortOptions = false,
		  headerHeading = "Usage:%n%n",
	      synopsisHeading = "%n",
	      descriptionHeading = "%nDescription:%n%n",
	      optionListHeading = "%nOptions:%n"
		)
public class MetricCommand implements Runnable{
	@Option(names = "-i", required = true, description = "--input <URI or URL> \ninput type:URL(https://github.com/user/project_name \noption must be used in this program.") 
	private static String inputGitURL;
	@Option(names = "-o", required = true, description = "--result <directory> \nDirectory will have result file. \noption must be used in this program.") 
	private static String outputPath;
	@Option(names = "-bp", required = true, description = "--BugIntroducingChange csv file path <BIC csv file path> \nPath of csv file.") 
	private String bicPath;
	

	@Option(names = "-s", description = "--startdate <Start date> \nStart date for collecting training data. \nFormat:\"yyyy-MM-dd HH:mm:ss\".") 
	private String startDate;
	@Option(names = "-e", description = "--enddate <End date> \nEnd date for collecting test data. \nFormat:\"yyyy-MM-dd HH:mm:ss\".") 
	private String endDate;
	
	@Option(names = "-p", description = "--percent <percent of developer> \nPercent of developer. Range : 2 ~ 9. (default:5)") 
	private int percent = 5;
	
	@Override
    public void run() {
		Input.taskType = TaskType.METRIC;
        Input.gitURL = inputGitURL;
        Input.outPath = outputPath;
        Input.BICpath = bicPath;
        
        if(startDate != null )
        	Input.startDate = startDate;
        if(endDate != null )
        	Input.endDate = endDate;
        
        if(percent > 1 && percent < 10) {
            Input.percent = percent;
		}else {
			Input.percent = 5;
		}
	}

}
