package project;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Insets;

public class Date_panel extends BasePanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private int Panelidx;
	FileManagement file;
	String FileName;
	
	void changeIdx(int idx) { // change idx 
		Panelidx = idx;
	}
	
	public String Panelname() { // return Panel name
		return Day((Panelidx%14));
	}
	
	public Date_panel(MainPanel main, int idx) {
		super(main);
		setLayout(null);
		setPreferredSize(new Dimension(600, 750));
		Panelidx = (idx == 0 ? idx+14 : idx); // Use for date and label output
		FileName = Day(idx).replace("/", "_") + ".txt";
		String FileAddress = "storage\\" + FileName;
		file = new FileManagement(FileAddress);
		
		String [] shape = {"", "✔", "△", "✘"}; // Use for button characters
		int [] count=new int[12]; // Check the number of clicks
		
		JButton LeftBtn = new JButton("<");
		LeftBtn.setMargin(new Insets(1, 1, 1, 1));
		LeftBtn.setFont(new Font("굴림", Font.BOLD, 12));
		LeftBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(Day((Panelidx-1)%14)); // previous panel
			}
		});
		
		LeftBtn.setBounds(70, 30, 40, 20);
		add(LeftBtn);
		JButton RightBtn = new JButton(">");
		RightBtn.setMargin(new Insets(1, 1, 1, 1));
		RightBtn.setFont(new Font("굴림", Font.BOLD, 12));
		RightBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(Day(((Panelidx+1)%14))); // next panel
			}
		});
		RightBtn.setBounds(490, 30, 40, 20);
		add(RightBtn);
		
		JLabel Date = new JLabel("New label");
		Date.setFont(new Font("굴림", Font.BOLD, 14));
		Date.setHorizontalAlignment(SwingConstants.CENTER);
		Date.setBounds(250, 20, 100, 40);
		add(Date);
		if(idx != 3) // set Date label text
			Date.setText(Day(idx));
		else
			Date.setText("Today " + Day(idx));
		
		JPanel Text_1 = new JPanel();
		Text_1.setLayout(null);
		Text_1.setBackground(Color.WHITE);
		Text_1.setBounds(30, 70, 540, 40);
		add(Text_1);
		
		textField_1 = new JTextField(file.print(0));
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text_1 = textField_1.getText(); // get Text and write this to the file
				file.write(0, text_1);
			}
		});
		textField_1.setForeground(Color.BLACK);
		textField_1.setColumns(10);
		textField_1.setBounds(30, 5, 460, 30);
		textField_1.setBorder(null);
		Text_1.add(textField_1);
		
		JButton check_1 = new JButton(shape[Integer.valueOf(file.print(12))]);
		check_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count[0]++;
				check_1.setText(shape[count[0] % 4]); // Change characters
				file.write(12, String.valueOf(count[0]%4)); // store this character number
				}
		});
		check_1.setBounds(515, 10, 20, 20);
		check_1.setMargin(new Insets(1, 1, 1, 1));
		Text_1.add(check_1);
		
		JLabel textLabel_1 = new JLabel("1.");
		textLabel_1.setBounds(5, 5, 20, 30);
		Text_1.add(textLabel_1);
		
		JPanel Text_2 = new JPanel();
		Text_2.setLayout(null);
		Text_2.setBackground(Color.WHITE);
		Text_2.setBounds(30, 120, 540, 40);
		add(Text_2);
		
		textField_2 = new JTextField(file.print(1));
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text_2 = textField_2.getText();
				file.write(1, text_2);
			}
		});
		textField_2.setColumns(10);
		textField_2.setBounds(30, 5, 460, 30);
		textField_2.setBorder(null);
		Text_2.add(textField_2);
		
		JButton check_2 = new JButton(shape[Integer.valueOf(file.print(13))]);
		check_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count[1]++;
				check_2.setText(shape[count[1] % 4]);
				file.write(13, String.valueOf(count[1]%4));
			}
		});
		check_2.setMargin(new Insets(1, 1, 1, 1));
		check_2.setBounds(515, 10, 20, 20);
		Text_2.add(check_2);
		
		JLabel textLabel_2 = new JLabel("2.");
		textLabel_2.setBounds(5, 5, 20, 30);
		Text_2.add(textLabel_2);
		
		JPanel Text_3 = new JPanel();
		Text_3.setLayout(null);
		Text_3.setBackground(Color.WHITE);
		Text_3.setBounds(30, 170, 540, 40);
		add(Text_3);
		
		textField_3 = new JTextField(file.print(2));
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text_3 = textField_3.getText();
				file.write(2, text_3);
			}
		});
		textField_3.setColumns(10);
		textField_3.setBounds(30, 5, 460, 30);
		textField_3.setBorder(null);
		Text_3.add(textField_3);
		
		JButton check_3 = new JButton(shape[Integer.valueOf(file.print(14))]);
		check_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count[2]++;
				check_3.setText(shape[count[2] % 4]);
				file.write(14, String.valueOf(count[2]%4));
			}
		});
		check_3.setBounds(515, 10, 20, 20);
		check_3.setMargin(new Insets(1, 1, 1, 1));
		Text_3.add(check_3);
		
		JLabel textLabel_3 = new JLabel("3.");
		textLabel_3.setBounds(5, 5, 20, 30);
		Text_3.add(textLabel_3);
		
		JPanel Text_4 = new JPanel();
		Text_4.setLayout(null);
		Text_4.setBackground(Color.WHITE);
		Text_4.setBounds(30, 220, 540, 40);
		add(Text_4);
		
		textField_4 = new JTextField(file.print(3));
		textField_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text_4 = textField_4.getText();
				file.write(3, text_4);
			}
		});
		textField_4.setColumns(10);
		textField_4.setBounds(30, 5, 460, 30);
		textField_4.setBorder(null);
		Text_4.add(textField_4);
		
		JButton check_4 = new JButton(shape[Integer.valueOf(file.print(15))]);
		check_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count[3]++;
				check_4.setText(shape[count[3] % 4]);
				file.write(15, String.valueOf(count[3]%4));
			}
		});
		check_4.setBounds(515, 10, 20, 20);
		check_4.setMargin(new Insets(1, 1, 1, 1));
		Text_4.add(check_4);
		
		JLabel textLabel_4 = new JLabel("4.");
		textLabel_4.setBounds(5, 5, 20, 30);
		Text_4.add(textLabel_4);
		
		JPanel Text_5 = new JPanel();
		Text_5.setLayout(null);
		Text_5.setBackground(Color.WHITE);
		Text_5.setBounds(30, 270, 540, 40);
		add(Text_5);
		
		textField_5 = new JTextField(file.print(4));
		textField_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text_5 = textField_5.getText();
				file.write(4, text_5);
			}
		});
		textField_5.setColumns(10);
		textField_5.setBounds(30, 5, 460, 30);
		textField_5.setBorder(null);
		Text_5.add(textField_5);
		
		JButton check_5 = new JButton(shape[Integer.valueOf(file.print(16))]);
		check_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count[4]++;
				check_5.setText(shape[count[4] % 4]);
				file.write(16, String.valueOf(count[4]%4));
			}
		});
		check_5.setBounds(515, 10, 20, 20);
		check_5.setMargin(new Insets(1, 1, 1, 1));
		Text_5.add(check_5);
		
		JLabel textLabel_5 = new JLabel("5.");
		textLabel_5.setBounds(5, 5, 20, 30);
		Text_5.add(textLabel_5);
		
		JPanel Text_6 = new JPanel();
		Text_6.setLayout(null);
		Text_6.setBackground(Color.WHITE);
		Text_6.setBounds(30, 320, 540, 40);
		add(Text_6);
		
		textField_6 = new JTextField(file.print(5));
		textField_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text_6 = textField_6.getText();
				file.write(5, text_6);
			}
		});
		textField_6.setColumns(10);
		textField_6.setBounds(30, 5, 460, 30);
		textField_6.setBorder(null);
		Text_6.add(textField_6);
		
		JButton check_6 = new JButton(shape[Integer.valueOf(file.print(17))]);
		check_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count[5]++;
				check_6.setText(shape[count[5] % 4]);
				file.write(17, String.valueOf(count[5]%4));
			}
		});
		check_6.setBounds(515, 10, 20, 20);
		check_6.setMargin(new Insets(1, 1, 1, 1));
		Text_6.add(check_6);
		
		JLabel textLabel_6 = new JLabel("6.");
		textLabel_6.setBounds(5, 5, 20, 30);
		Text_6.add(textLabel_6);
		
		JPanel Text_7 = new JPanel();
		Text_7.setLayout(null);
		Text_7.setBackground(Color.WHITE);
		Text_7.setBounds(30, 370, 540, 40);
		add(Text_7);
		
		textField_7 = new JTextField(file.print(6));
		textField_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text_7 = textField_7.getText();
				file.write(6, text_7);
			}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(30, 5, 460, 30);
		textField_7.setBorder(null);
		Text_7.add(textField_7);
		
		JButton check_7 = new JButton(shape[Integer.valueOf(file.print(18))]);
		check_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count[6]++;
				check_7.setText(shape[count[6] % 4]);
				file.write(18, String.valueOf(count[6]%4));
			}
		});
		check_7.setBounds(515, 10, 20, 20);
		check_7.setMargin(new Insets(1, 1, 1, 1));
		Text_7.add(check_7);
		
		JLabel textLabel_7 = new JLabel("7.");
		textLabel_7.setBounds(5, 5, 20, 30);
		Text_7.add(textLabel_7);
		
		JPanel Text_8 = new JPanel();
		Text_8.setLayout(null);
		Text_8.setBackground(Color.WHITE);
		Text_8.setBounds(30, 420, 540, 40);
		add(Text_8);
		
		textField_8 = new JTextField(file.print(7));
		textField_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text_8 = textField_8.getText();
				file.write(7, text_8);
			}
		});
		textField_8.setColumns(10);
		textField_8.setBounds(30, 5, 460, 30);
		textField_8.setBorder(null);
		Text_8.add(textField_8);
		
		JButton check_8 = new JButton(shape[Integer.valueOf(file.print(19))]);
		check_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count[7]++;
				check_8.setText(shape[count[7] % 4]);
				file.write(19, String.valueOf(count[7]%4));
			}
		});
		check_8.setBounds(515, 10, 20, 20);
		check_8.setMargin(new Insets(1, 1, 1, 1));
		Text_8.add(check_8);
		
		JLabel textLabel_8 = new JLabel("8.");
		textLabel_8.setBounds(5, 5, 20, 30);
		Text_8.add(textLabel_8);
		
		JPanel Text_9 = new JPanel();
		Text_9.setLayout(null);
		Text_9.setBackground(Color.WHITE);
		Text_9.setBounds(30, 470, 540, 40);
		add(Text_9);
		
		textField_9 = new JTextField(file.print(8));
		textField_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text_9 = textField_9.getText();
				file.write(8, text_9);
			}
		});
		textField_9.setColumns(10);
		textField_9.setBounds(30, 5, 460, 30);
		textField_9.setBorder(null);
		Text_9.add(textField_9);
		
		JButton check_9 = new JButton(shape[Integer.valueOf(file.print(20))]);
		check_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count[8]++;
				check_9.setText(shape[count[8] % 4]);
				file.write(20, String.valueOf(count[8]%4));
			}
		});
		check_9.setBounds(515, 10, 20, 20);
		check_9.setMargin(new Insets(1, 1, 1, 1));
		Text_9.add(check_9);
		
		JLabel textLabel_9 = new JLabel("9.");
		textLabel_9.setBounds(5, 5, 20, 30);
		Text_9.add(textLabel_9);
		
		JPanel Text_10 = new JPanel();
		Text_10.setLayout(null);
		Text_10.setBackground(Color.WHITE);
		Text_10.setBounds(30, 520, 540, 40);
		add(Text_10);
		
		textField_10 = new JTextField(file.print(9));
		textField_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text_10 = textField_10.getText();
				file.write(9, text_10);
			}
		});
		textField_10.setColumns(10);
		textField_10.setBounds(30, 5, 460, 30);
		textField_10.setBorder(null);
		Text_10.add(textField_10);
		
		JButton check_10 = new JButton(shape[Integer.valueOf(file.print(21))]);
		check_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count[9]++;
				check_10.setText(shape[count[9] % 4]);
				file.write(21, String.valueOf(count[9]%4));
			}
		});
		check_10.setBounds(515, 10, 20, 20);
		check_10.setMargin(new Insets(1, 1, 1, 1));
		Text_10.add(check_10);
		
		JLabel textLabel_10 = new JLabel("10.");
		textLabel_10.setBounds(5, 5, 20, 30);
		Text_10.add(textLabel_10);
		
		JPanel Text_11 = new JPanel();
		Text_11.setLayout(null);
		Text_11.setBackground(Color.WHITE);
		Text_11.setBounds(30, 570, 540, 40);
		add(Text_11);
		
		textField_11 = new JTextField(file.print(10));
		textField_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text_11 = textField_11.getText();
				file.write(10, text_11);
			}
		});
		textField_11.setColumns(10);
		textField_11.setBounds(30, 5, 460, 30);
		textField_11.setBorder(null);
		Text_11.add(textField_11);
		
		JButton check_11 = new JButton(shape[Integer.valueOf(file.print(22))]);
		check_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count[10]++;
				check_11.setText(shape[count[10] % 4]);
				file.write(22, String.valueOf(count[10]%4));
			}
		});
		check_11.setBounds(515, 10, 20, 20);
		check_11.setMargin(new Insets(1, 1, 1, 1));
		Text_11.add(check_11);
		
		JLabel textLabel_11 = new JLabel("11.");
		textLabel_11.setBounds(5, 5, 20, 30);
		Text_11.add(textLabel_11);
		
		JPanel Text_12 = new JPanel();
		Text_12.setLayout(null);
		Text_12.setBackground(Color.WHITE);
		Text_12.setBounds(30, 620, 540, 40);
		add(Text_12);
		
		textField_12 = new JTextField(file.print(11));
		textField_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text_12 = textField_12.getText();
				file.write(11, text_12);
			}
		});
		textField_12.setColumns(10);
		textField_12.setBounds(30, 5, 460, 30);
		textField_12.setBorder(null);
		Text_12.add(textField_12);
		
		JButton check_12 = new JButton(shape[Integer.valueOf(file.print(23))]);
		check_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count[11]++;
				check_12.setText(shape[count[11] % 4]);
				file.write(23, String.valueOf(count[11]%4));
			}
		});
		check_12.setBounds(515, 10, 20, 20);
		check_12.setMargin(new Insets(1, 1, 1, 1));
		Text_12.add(check_12);
		
		JLabel textLabel_12 = new JLabel("12.");
		textLabel_12.setBounds(5, 5, 20, 30);
		Text_12.add(textLabel_12);
		
		JButton btnNewButton = new JButton("Schedule");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // Change from date panel to calendar panel
				ChangePanel("calendar");
				resizeFrame();
			}
		});
		btnNewButton.setBounds(250, 700, 100, 20);
		add(btnNewButton);

	}
}
