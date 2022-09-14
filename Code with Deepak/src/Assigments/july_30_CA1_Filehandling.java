package Assigments;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class july_30_CA1_Filehandling 
{
public static void main(String[] args) throws IOException {
	File f=new File("../Code with Deepak/Read Data for Project.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	int n=0;
	String s;
	while ((s=br.readLine())!=null)
	{
		n=n+1;
		if(n==7);
		{
		System.out.println(s);
		break;
	}
}
}}
