package project;

import javax.swing.JPanel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface BaseMethod{
	void ChangePanel(String name);
	void resizeFrame();
	String Day(int idx);
}

public class BasePanel extends JPanel implements BaseMethod{ // parent class, provide basic method
	static final long serialVersionUID = 1L;
	protected MainPanel main;
	
	public BasePanel(MainPanel main) {
		this.main = main;
		setLayout(null);
	}
	
	public void ChangePanel(String name) { // change Panel method
		main.Panel.show(main, name);
		main.frame.pack();
	}
	
	public void resizeFrame() { // resize Frame method, only calendar panel
		main.frame.setSize(582, 340);
	}
	
	public String Day(int idx) {  // check real time Day
		LocalDate today = LocalDate.now();
		LocalDate idx_day;
		DateTimeFormatter Returnvalue;
		String ReturnDay;
		
		if(idx >= 3) { // After today
			idx_day=today.plusDays(idx-3);
			Returnvalue = DateTimeFormatter.ofPattern("MM/dd");
			ReturnDay = idx_day.format(Returnvalue);
		}
		else { // before today
			idx_day=today.minusDays(3 - idx);
			Returnvalue = DateTimeFormatter.ofPattern("MM/dd");
			ReturnDay = idx_day.format(Returnvalue);
		}
		
		return ReturnDay;
	}
}
