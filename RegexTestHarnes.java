//The metacharacters supported by this regex API are: <([{\^-=$!|]})?*+.>
import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTestHarnes{
	public static void main(String[] args){
		Console console=System.console();
			if (console == null){
				System.err.println("No console found!");
				System.exit(1);
			}
		while (true){
			Pattern pattern=Pattern.compile(console.readLine("%nEnter your regex: "));
			Matcher matcher=pattern.matcher(console.readLine("Enter your input: "));
			boolean found=false;

			while(matcher.find()){
				console.format("I have found the match"+"\"%s\" starting at index %d and ending at index %d",matcher.group(),matcher.start(),matcher.end());
				found=true;
			}
			if (!found)
				console.format("match not found!");
		}
	}

}
