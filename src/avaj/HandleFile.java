package avaj;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// import java.util.Vector; //List mais thread safe donc plus lent


public class HandleFile {
	public  static List<String> GetFile(String nameFile)
	{
		File file = new File(nameFile);
		List<String> tab = new ArrayList<>();
		try (Scanner reader = new Scanner(file)){
			while (reader.hasNextLine())
			{

				String data = reader.nextLine();
				tab.add(data);
				System.out.println(data); //print tout le fichier
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: readfile");
			e.printStackTrace();
		}
		return (tab);
	}
}
