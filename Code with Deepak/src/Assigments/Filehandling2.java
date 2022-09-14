package Assigments;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Filehandling2 {
public static void main(String[] args) throws IOException {
	File f=new File("../Code with Deepak/Read Data for Project.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	String line;
	while ((line=br.readLine())!=null)
	{
		System.out.println(line);
	}
	
}
}
