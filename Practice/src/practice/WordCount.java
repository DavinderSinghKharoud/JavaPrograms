package practice;
import java.util.Scanner;
import java.io.File;

public class WordCount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
File f=new File("filebook.txt");
Scanner s=new Scanner(f);
int words=0;
while (s.hasNextLine()) {
	String line=s.nextLine();
	System.out.println(line.split("").length);
	words =words+ line.split("").length;
	}
System.out.println(words);
	}

}
