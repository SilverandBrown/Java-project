package project;

import javax.swing.*;

public class ToDo_App extends JFrame{
	private static final long serialVersionUID = 1L;
	MainPanel panel;
	
	public ToDo_App(){ // Frame
		setTitle("To-do List");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new MainPanel(this);
		add(panel);
		pack();
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
            ToDo_App app= new ToDo_App();
            app.setVisible(true);
        });
	}
}
