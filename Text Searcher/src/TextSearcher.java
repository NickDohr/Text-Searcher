import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class TextSearcher
	{
		static int counter;
		public static void main(String[] args) throws IOException
		{
			Scanner myFile = new Scanner(new File("SearchText.txt"));
			while(myFile.hasNext())
				{
					String sentence = myFile.nextLine();
					int index = sentence.indexOf("v");
					System.out.println(index/2);
				}
			
			
		}
	}
