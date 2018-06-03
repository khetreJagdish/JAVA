package setinterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListUtil
{
	public static void main(String[] args)
	{
		List<String> colors = new ArrayList<>(
				Arrays.asList("RED", null, "BLUE", null, "GREEN"));
		
		
		while (colors.remove(null)) {
			
		}

		System.out.println(colors);
	}
}