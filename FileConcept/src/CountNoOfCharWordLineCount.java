import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountNoOfCharWordLineCount {

	public static void main(String[] args) {
	
		
		BufferedReader reader = null; 
		int charcount =0;
		int wordcount=0;
		int linecount=0;
		try {
			 reader = new BufferedReader(new FileReader("/Users/a0c0cfw/Desktop/epfonumber.txt"));
			 String currentLine = reader.readLine();
			while (currentLine != null) {
				linecount++;
				String[] words = currentLine.split("\\.");
				wordcount =wordcount+words.length;
				
				for (String word :words) {
					charcount =charcount+word.length();
				}
				currentLine = reader.readLine();
			}
			System.out.println("no of words in a file "+ wordcount);
			System.out.println("no of character in a file "+ charcount);
			System.out.println("no of line in a file "+ linecount);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (reader != null) {
					reader.close();
				}
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}

	}

}
