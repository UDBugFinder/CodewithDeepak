package Assigments;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Filehandling1 {
	
	public static void readlines(File f) throws IOException
	{
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line;
		int n=0;
		while((line=br.readLine())!=null) {
			System.out.println(line);
			n++;
			
		}
		
		System.out.println("Number of lines in this file: " + n);
		br.close();
		fr.close();
		
	}
	public static void main(String[] args) {
		File f=new File("../Code with Deepak/Read Data for Project.txt");
			try {
				readlines(f);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}

