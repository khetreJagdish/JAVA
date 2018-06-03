package langpackage;

import java.io.IOException;

public class LaunchingExternalApps
{
	public static void main(String[] args) throws IOException {
		
		Runtime runtime = Runtime.getRuntime();
		
		runtime.exec("notepad.exe");
		
	}
}