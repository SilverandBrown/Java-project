package project;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FileManagement {
	File txt;
	ArrayList<String> list;
	
	FileManagement(String FileName){
		list=new ArrayList<>();
		txt=new File(FileName);
		try{
			if(!txt.exists()) { // If the file does not already exist
				txt.createNewFile();
				for(int i = 0; i < 12; ++i) { // set text
					list.add("");
				}
				for(int i = 0; i < 12; ++i) { // set character number
					list.add("0");
				}
				FileWriter w=new FileWriter(txt);
				for(String line: list)
					w.write(line+"\n"); // write text file
				w.close();
			}
			else if(txt.exists()) { // If the file already exists
				Scanner r=new Scanner(txt);
				for(int i = 0; i < 24; ++i){
					list.add(r.nextLine());
				}
				r.close();
			}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e); // error
		}
	}
	
	public void write(int i, String w) { //Modify text file content (re-create)
		list.set(i, w); // modify list
		try {
			FileWriter rew=new FileWriter(txt); // re-write
			for(String line: list)
				rew.write(line+"\n");
			rew.close();
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	public String print(int i) { // return file content
		return list.get(i);
	}
}
