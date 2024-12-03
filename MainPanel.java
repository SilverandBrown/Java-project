package project;

import java.util.*;
import java.util.Timer;
import java.awt.*;
import java.io.File;
import javax.swing.*;
import java.time.LocalTime;

interface BaseMain{
	public void MidNight();
	public void initPanel();
	public void DeleteFile();
}

public class MainPanel extends JPanel implements BaseMain {
	static final long serialVersionUID = 1L;
	ArrayList<Date_panel> date=new ArrayList<>(14);
	Calendar calendar;
	public CardLayout Panel;
	ToDo_App frame;
	private boolean Run = false;
	
	public MainPanel(ToDo_App frame){ // On startup, basic panel settings
		this.frame = frame;
		Panel =new CardLayout(); // Using cardLayout for panel replacement
		setLayout(Panel);
		
		for(int i = 0; i < 14; ++i) {
			date.add(i, new Date_panel(this, i));
			add(date.get(i), date.get(i).Panelname());
		}
		
		calendar=new Calendar(this);
		add(calendar, "calendar");
		
		add(new Temporary(), "Temporary"); // Temporary panel - at midnight
		
		DeleteFile(); // Delete unnecessary files
		
		Panel.show(this, date.get(3).Panelname()); // today panel
		MidNight(); // check time
	}
	
	public void initPanel() { // Panel Initialization Method
		Panel.show(this, "Temporary");
		
		remove(calendar);
		remove(date.get(0));
		
		date.remove(0);
		calendar = null;
		calendar = new Calendar(this);
		
		for(int i = 0; i < 13; ++i)
			date.get(i).changeIdx(i);
		date.add(13, new Date_panel(this, 13));
		add(date.get(13), date.get(13).Panelname()+"o");
		add(calendar, "calendar");
		
		DeleteFile();
		
		Panel.show(this, date.get(3).Panelname());
	}
	
	public void MidNight() { // check time method
		Timer timer=new Timer(true);

        timer.scheduleAtFixedRate(new TimerTask() {
        	@Override
            public void run() {
                if (LocalTime.now().getHour() == 0 && LocalTime.now().getMinute() == 0 && Run != true) {
                	initPanel(); // at midnight, execute initPanel method 
                	Run = true;
                }
                else if(LocalTime.now().getMinute() != 0)
                	Run = false;
            }
        }, 0, 1000); // Check every second
	}
	
	public void DeleteFile() { // Delete unnecessary files method
		File folder=new File("storage");
		File [] files = folder.listFiles(); // all File
		
		for(File file:files) {
			int count = 0;
			for(int i = 0; i < 14; ++i) {
				if(date.get(i).FileName.equals(file.getName())) //check file name
					break;
				else
					count++;
			}
			if (count == 14)
				file.delete(); // Delete unnecessary files
		}
	}
}
