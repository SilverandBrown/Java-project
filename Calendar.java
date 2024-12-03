package project;

import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calendar extends BasePanel {

	private static final long serialVersionUID = 1L;

	public Calendar(MainPanel main) {
		super(main);
		setBackground(Color.CYAN);
		setLayout(null);
		setPreferredSize(new Dimension(570, 300));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 10, 70, 130);
		add(panel_1);
		panel_1.setLayout(null);
		
		JButton btn_1 = new JButton(Day(0));
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(btn_1.getText()); // change panel that day
			}
		});
		btn_1.setBounds(5, 5, 60, 120);
		btn_1.setMargin(new Insets(1, 3, 1, 3));
		panel_1.add(btn_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(90, 10, 70, 130);
		add(panel_2);
		
		JButton btn_2 = new JButton(Day(1));
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(btn_2.getText());
			}
		});
		btn_2.setMargin(new Insets(1, 3, 1, 3));
		btn_2.setBounds(5, 5, 60, 120);
		panel_2.add(btn_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(170, 10, 70, 130);
		add(panel_3);
		
		JButton btn_3 = new JButton(Day(2));
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(btn_3.getText());
			}
		});
		btn_3.setMargin(new Insets(1, 3, 1, 3));
		btn_3.setBounds(5, 5, 60, 120);
		panel_3.add(btn_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(250, 10, 70, 130);
		add(panel_4);
		
		JButton btn_4 = new JButton(String.format("<html>&nbsp;%s<br>Today<html>", Day(3)));
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(btn_4.getText());
			}
		});
		btn_4.setMargin(new Insets(1, 3, 1, 3));
		btn_4.setBounds(5, 5, 60, 120);
		panel_4.add(btn_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(330, 10, 70, 130);
		add(panel_5);
		
		JButton btn_5 = new JButton(Day(4));
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(btn_5.getText());
			}
		});
		btn_5.setMargin(new Insets(1, 3, 1, 3));
		btn_5.setBounds(5, 5, 60, 120);
		panel_5.add(btn_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(410, 10, 70, 130);
		add(panel_6);
		
		JButton btn_6 = new JButton(Day(5));
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(btn_6.getText());
			}
		});
		btn_6.setMargin(new Insets(1, 3, 1, 3));
		btn_6.setBounds(5, 5, 60, 120);
		panel_6.add(btn_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(490, 10, 70, 130);
		add(panel_7);
		
		JButton btn_7 = new JButton(Day(6));
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(btn_7.getText());
			}
		});
		btn_7.setMargin(new Insets(1, 3, 1, 3));
		btn_7.setBounds(5, 5, 60, 120);
		panel_7.add(btn_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(10, 160, 70, 130);
		add(panel_8);
		
		JButton btn_8 = new JButton(Day(7));
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(btn_8.getText());
			}
		});
		btn_8.setMargin(new Insets(1, 3, 1, 3));
		btn_8.setBounds(5, 5, 60, 120);
		panel_8.add(btn_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(90, 160, 70, 130);
		add(panel_9);
		
		JButton btn_9 = new JButton(Day(8));
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(btn_9.getText());
			}
		});
		btn_9.setMargin(new Insets(1, 3, 1, 3));
		btn_9.setBounds(5, 5, 60, 120);
		panel_9.add(btn_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(170, 160, 70, 130);
		add(panel_10);
		
		JButton btn_10 = new JButton(Day(9));
		btn_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(btn_10.getText());
			}
		});
		btn_10.setMargin(new Insets(1, 3, 1, 3));
		btn_10.setBounds(5, 5, 60, 120);
		panel_10.add(btn_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(250, 160, 70, 130);
		add(panel_11);
		
		JButton btn_11 = new JButton(Day(10));
		btn_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(btn_11.getText());
			}
		});
		btn_11.setMargin(new Insets(1, 3, 1, 3));
		btn_11.setBounds(5, 5, 60, 120);
		panel_11.add(btn_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(330, 160, 70, 130);
		add(panel_12);
		
		JButton btn_12 = new JButton(Day(11));
		btn_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(btn_12.getText());
			}
		});
		btn_12.setMargin(new Insets(1, 3, 1, 3));
		btn_12.setBounds(5, 5, 60, 120);
		panel_12.add(btn_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(410, 160, 70, 130);
		add(panel_13);
		
		JButton btn_13 = new JButton(Day(12));
		btn_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(btn_13.getText());
			}
		});
		btn_13.setMargin(new Insets(1, 3, 1, 3));
		btn_13.setBounds(5, 5, 60, 120);
		panel_13.add(btn_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(490, 160, 70, 130);
		add(panel_14);
		
		JButton btn_14 = new JButton(Day(13));
		btn_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(btn_14.getText());
			}
		});
		btn_14.setMargin(new Insets(1, 3, 1, 3));
		btn_14.setBounds(5, 5, 60, 120);
		panel_14.add(btn_14);
	}
}
