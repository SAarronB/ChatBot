package chat.controller;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Calendar;

public class IOController
{
	public static void saveText(ChatController app, String path, String textToSave) {
		
		try {
			String filename = path;
			Calendar date = Calendar.getInstance();
			filename += "/" + date.get(Calendar.MONTH) + " " + date.get(Calendar.DAY_OF_MONTH);
			filename += " chat save.txt";
			
			File savefile = new File(filename);
			Scanner textScanner = new Scanner(textToSave);
			PrintWriter saveText = new PrintWriter(savefile);
			
			while(textScanner.hasNext()) {
				
				String currentLine = textScanner.nextLine();
				saveText.println(currentLine);
				
			}
			
			textScanner.close();
			saveText.close();
			
 		}catch(IOException error){
 			
			app.handelErrors(error);
			
		}catch(Exception genericError) {
			
			app.handelErrors(genericError);
			
		}
	}
	
	public static String loadFile(ChatController app, String path) {
		String contents = "";
		
		try {
			File saveFile = new File(path);
			Scanner fileScanner;
			
			if(saveFile.exists()) {
				fileScanner = new Scanner(saveFile);
				while(fileScanner.hasNext()) {
					contents += fileScanner.nextLine() + "\n";
				}
				fileScanner.close();
			}
		}catch(IOException error) {
			app.handelErrors(error);
		}catch(Exception genericError) {
			app.handelErrors(genericError);
		}
		return contents;
	}
}
