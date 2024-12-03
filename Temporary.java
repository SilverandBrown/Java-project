package project;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Temporary extends JPanel { // Temporary Panel, Only used at midnight

	private static final long serialVersionUID = 1L;

	public Temporary() {
		setPreferredSize(new Dimension(600, 750));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please wait. .");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(100, 200, 400, 100);
		add(lblNewLabel);
		
		JLabel lblWorkingOnPanel = new JLabel("Working on panel initialization.");
		lblWorkingOnPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblWorkingOnPanel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblWorkingOnPanel.setBounds(100, 310, 400, 100);
		add(lblWorkingOnPanel);
	}
}
