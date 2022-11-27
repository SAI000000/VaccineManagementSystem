package com.vaccine.service;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.regex.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField firstname;
	private JTextField lstnm;
	private JTextField phno;
	private JTextField eml;
	private JTextField cptxt;
	private JTextField cpptxt;
	private JTextField addtxt;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPage frame = new RegistrationPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(160, 10, 1300, 770);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 240));
		contentPane.setBorder(new LineBorder(new Color(128, 128, 128), 4, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JLabel w1 = new JLabel("*");
		w1.setForeground(new Color(255, 0, 0));
		w1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 26));
		w1.setBounds(836, 191, 45, 24);
		contentPane.add(w1);
		w1.setVisible(false);
		
		JLabel w2 = new JLabel("*");
		w2.setForeground(Color.RED);
		w2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 26));
		w2.setBounds(836, 253, 45, 24);
		contentPane.add(w2);
		w2.setVisible(false);
		
		JLabel w3 = new JLabel("*");
		w3.setForeground(Color.RED);
		w3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 26));
		w3.setBounds(836, 317, 45, 24);
		contentPane.add(w3);
		w3.setVisible(false);
		
		JLabel w4 = new JLabel("*");
		w4.setForeground(Color.RED);
		w4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 26));
		w4.setBounds(836, 385, 45, 24);
		contentPane.add(w4);
		w4.setVisible(false);
		
		JLabel w5 = new JLabel("*");
		w5.setForeground(Color.RED);
		w5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 26));
		w5.setBounds(836, 459, 45, 24);
		contentPane.add(w5);
		w5.setVisible(false);
		
		JLabel w6 = new JLabel("*");
		w6.setForeground(Color.RED);
		w6.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 26));
		w6.setBounds(836, 549, 45, 24);
		contentPane.add(w6);
		w6.setVisible(false);
		
		JLabel w7 = new JLabel("*");
		w7.setForeground(Color.RED);
		w7.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 26));
		w7.setBounds(1254, 406, 35, 24);
		contentPane.add(w7);
		w7.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setBounds(426, 184, 141, 45);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Last Name:");
		lblNewLabel_1_2.setBounds(426, 253, 141, 45);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phone No:");
		lblNewLabel_1_3.setBounds(426, 317, 141, 45);
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Email Id:");
		lblNewLabel_1_4.setBounds(426, 385, 141, 45);
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Date of Birth:");
		lblNewLabel_1_4_1.setBounds(853, 301, 141, 45);
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1_4_1);
		
		firstname = new JTextField();
		firstname.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		firstname.setBackground(new Color(255, 255, 255));
		firstname.setBounds(593, 186, 219, 45);
		firstname.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(firstname);
		firstname.setColumns(10);
		
		JLabel lblNewLabel_1_4_1_2 = new JLabel("Address:");
		lblNewLabel_1_4_1_2.setBounds(853, 404, 141, 45);
		lblNewLabel_1_4_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 19));
		contentPane.add(lblNewLabel_1_4_1_2);
		
		JButton btnbacklog = new JButton("<Back");
		btnbacklog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage hp = new HomePage();
				hp.setVisible(true);
			    setVisible(false);
			}
		});
		
		btnbacklog.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 23));
		btnbacklog.setBorderPainted(false);
		btnbacklog.setBackground(new Color(255, 255, 240));
		btnbacklog.setBounds(440, 667, 175, 57);
		contentPane.add(btnbacklog);
		
		JLabel phnowarn = new JLabel("Invalid Input  !!");
		phnowarn.setForeground(Color.RED);
		phnowarn.setBounds(593, 364, 117, 13);
		contentPane.add(phnowarn);
		
		JLabel lstnmwarn = new JLabel("Invalid Input  !!");
		lstnmwarn.setForeground(Color.RED);
		lstnmwarn.setBounds(593, 301, 117, 13);
		contentPane.add(lstnmwarn);
		
		JLabel fstnmwarn = new JLabel("Invalid Input  !!");
		fstnmwarn.setForeground(Color.RED);
		fstnmwarn.setBounds(593, 230, 117, 13);
		contentPane.add(fstnmwarn);
		
		JLabel emlwarn = new JLabel("Invalid Input  !!");
		emlwarn.setForeground(Color.RED);
		emlwarn.setBounds(593, 436, 117, 13);
		contentPane.add(emlwarn);
		
		JLabel cpwarn = new JLabel("Invalid Input  !!");
		cpwarn.setForeground(Color.RED);
		cpwarn.setBounds(593, 510, 117, 13);
		contentPane.add(cpwarn);
		
		JLabel cppwarn = new JLabel("Invalid Input !!");
		cppwarn.setForeground(Color.RED);
		cppwarn.setBounds(593, 593, 117, 13);
		contentPane.add(cppwarn);
		
		JLabel addwarn = new JLabel("Invalid Input  !!");
		addwarn.setForeground(Color.RED);
		addwarn.setBounds(1025, 459, 117, 13);
		contentPane.add(addwarn);
		
		fstnmwarn.setVisible(false);
		lstnmwarn.setVisible(false);
		phnowarn.setVisible(false);
		emlwarn.setVisible(false);
		cpwarn.setVisible(false);
		cppwarn.setVisible(false);
		addwarn.setVisible(false);
		
		
		
		JButton btnSubmit = new JButton("Submit");
		ArrayList al=new ArrayList();
		btnSubmit.addActionListener(new ActionListener() {
		
			
			@SuppressWarnings("unchecked")
			int c=0;
			public void actionPerformed(ActionEvent e) {
				
				w1.setVisible(false);
				w2.setVisible(false);
				w3.setVisible(false);
				w4.setVisible(false);
				w5.setVisible(false);
				w6.setVisible(false);
				w7.setVisible(false);
				
				if(firstname.getText().trim().isEmpty() && lstnm.getText().trim().isEmpty()&& phno.getText().trim().isEmpty()&& eml.getText().trim().isEmpty()&& cptxt.getText().trim().isEmpty()&& cpptxt.getText().trim().isEmpty()&& addtxt.getText().trim().isEmpty()) {
					w1.setVisible(true);
					w2.setVisible(true);
					w3.setVisible(true);
					w4.setVisible(true);
					w5.setVisible(true);
					w6.setVisible(true);
					w7.setVisible(true);
					c=1;
					}
				 if (firstname.getText().trim().isEmpty()) {
						w1.setVisible(true);
						c=1;
					}
				 if (lstnm.getText().trim().isEmpty()) {
						w2.setVisible(true);
						c=1;
					}
			     if (phno.getText().trim().isEmpty()) {
						w3.setVisible(true);
						c=1;
					}
				 if (eml.getText().trim().isEmpty()) {
						w4.setVisible(true);
						c=1;
					}
				 if (cptxt.getText().trim().isEmpty()) {
						w5.setVisible(true);
						c=1;
					}
				 if (cpptxt.getText().trim().isEmpty()) {
						w6.setVisible(true);
						c=1;
					}
				 if (addtxt.getText().trim().isEmpty()) {
						w7.setVisible(true);
						c=1;
						
					}
					else {
						c=0;
					}
				
			
				 boolean b ;
				 b= Pattern.compile("^$|(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$").matcher(firstname.getText()).matches();
				if (firstname!=null) {
					if(b==false){
						//fstnmwarn.setText("wrong input !!!");
						fstnmwarn.setVisible(true);
						c=1;
					}	
					else {
						al.add(firstname.getText());
						fstnmwarn.setVisible(false);	
					}
				}				
				
				
				boolean bl;
				 bl= Pattern.compile("^$|(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$").matcher(lstnm.getText()).matches();
				if (lstnm!=null) {
					if(bl==false){
						//lstnmwarn.setText("wrong input !!!");
						lstnmwarn.setVisible(true);	
						c=1;
					}	
					else {
						al.add(lstnm.getText());
						lstnmwarn.setVisible(false);						
						
					}
				}
				
				boolean mn ;
				// mn= Pattern.compile("^\\d{10}$").matcher(mntext.getText()).matches();
				 mn= Pattern.compile("^$|[6-9][0-9]{9}").matcher(phno.getText()).matches();
				if (phno!=null) {
					if(mn==false){
						//phnowarn.setText("wrong input !!!");
						phnowarn.setVisible(true);
						c=1;
					}
					else {
						al.add(phno.getText());
						phnowarn.setVisible(false);
					}
				}
				
				boolean ei ;
				//ei= Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,20}$").matcher(eitext.getText()).matches();
				ei= Pattern.compile("^$|[a-zA-Z0-9._-]+@[a-z]{5,7}+\\.+[a-z]{3}+").matcher(eml.getText()).matches();
				if (eml!=null) {
					if(ei==false){
						//emlwarn.setText("wrong input !!!");
						emlwarn.setVisible(true);
						c=1;
					}
					else {
						al.add(eml.getText());
						emlwarn.setVisible(false);						
					}
				}
				
				boolean pw ;
				 pw= Pattern.compile("^$|(?=.\\\\d)(?=.[a-z])(?=.[A-Z])(?=.[@#$%]).{8,20}$").matcher(cptxt.getText()).matches();
				if (cptxt!=null) {
					if(pw==false){
						//cpwarn.setText("wrong input !!!");
						cpwarn.setVisible(true);
						c=1;
					}	
					else {
						al.add(cptxt.getText());
						cpwarn.setVisible(false);						
					}
				}
				
				
				if(addtxt!=null) {
					al.add(addtxt.getText());
					c=0;
				}
			
				if(cpptxt!=null) {
					al.add(cpptxt.getText());
					c=0;
				}
				if(!cptxt.getText().equals(cpptxt.getText()))
				{
					//cppwarn.setText("wrong input");
					cpwarn.setVisible(true);
					cppwarn.setVisible(true);
					c = 1;
				}
				else {
					al.add(cpptxt.getText());
					cpwarn.setVisible(false);
					cppwarn.setVisible(false);
				}
				if(c==0) {
				jdbctrial1 ora = new jdbctrial1();
				int a =ora.insertIntoDB(al);
				if(a==0) {
					JOptionPane.showMessageDialog(null,"Successfully Submited ");
				LoginPage lpg = new LoginPage();
				lpg.setVisible(true);
				}
				else  {
					JOptionPane.showMessageDialog(null,"Not Submitted");
					c=0;
					a=0;
				}
				}
			}
			
	
		});
		btnSubmit.setBounds(916, 667, 175, 57);
		btnSubmit.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 23));
		btnSubmit.setBorderPainted(false);
		btnSubmit.setBackground(new Color(255, 255, 240));
		contentPane.add(btnSubmit);
		
		/*JDateChooser dateChooser = new JDateChooser();
		dateChooser.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		dateChooser.setToolTipText("");
		dateChooser.setBackground(new Color(255, 255, 240));
		dateChooser.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		dateChooser.setBounds(1025, 301, 219, 45);
		contentPane.add(dateChooser);*/
		
		JLabel lblNewLabel_2 = new JLabel("Create password:");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(392, 469, 175, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Confirm password:");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(392, 547, 175, 36);
		contentPane.add(lblNewLabel_2_1);
		
		lstnm = new JTextField();
		lstnm.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lstnm.setColumns(10);
		lstnm.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		lstnm.setBackground(new Color(255, 255, 255));
		lstnm.setBounds(593, 255, 219, 45);
		contentPane.add(lstnm);
		
		phno = new JTextField();
		phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
		phno.setColumns(10);
		phno.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		phno.setBackground(new Color(255, 255, 255));
		phno.setBounds(593, 319, 219, 45);
		contentPane.add(phno);
		
		eml = new JTextField();
		eml.setFont(new Font("Tahoma", Font.PLAIN, 17));
		eml.setColumns(10);
		eml.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		eml.setBackground(new Color(255, 255, 255));
		eml.setBounds(593, 387, 219, 45);
		contentPane.add(eml);
		
		cptxt = new JTextField();
		cptxt.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cptxt.setColumns(10);
		cptxt.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		cptxt.setBackground(new Color(255, 255, 255));
		cptxt.setBounds(593, 466, 219, 45);
		contentPane.add(cptxt);
		
		cpptxt = new JTextField();
		cpptxt.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cpptxt.setColumns(10);
		cpptxt.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		cpptxt.setBackground(new Color(255, 255, 255));
		cpptxt.setBounds(593, 544, 219, 45);
		contentPane.add(cpptxt);
		
		addtxt = new JTextField();
		addtxt.setFont(new Font("Tahoma", Font.PLAIN, 17));
		addtxt.setColumns(10);
		addtxt.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		addtxt.setBackground(new Color(255, 255, 255));
		addtxt.setBounds(1025, 406, 219, 45);
		contentPane.add(addtxt);
		
		JLabel lblNewLabel_1_1 = new JLabel("Registration Form");
		lblNewLabel_1_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 43));
		lblNewLabel_1_1.setBounds(490, 46, 656, 93);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\91777\\Downloads\\1000_F_420405672_7dcUaLpD0OMSoNDeAnjK7SPQkV3gvdet-removebg-preview.jpg"));
		lblNewLabel.setBounds(52, 46, 364, 628);
		contentPane.add(lblNewLabel);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 23));
		btnReset.setBorderPainted(false);
		btnReset.setBackground(new Color(255, 255, 240));
		btnReset.setBounds(666, 667, 175, 57);
		contentPane.add(btnReset);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\91777\\Downloads\\3.png"));
		lblNewLabel_3_1.setBounds(1225, 692, 65, 65);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon("C:\\Users\\91777\\Downloads\\4.png"));
		lblNewLabel_3_2.setBounds(10, 10, 65, 65);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setIcon(new ImageIcon("C:\\Users\\91777\\Downloads\\5.png"));
		lblNewLabel_3_3.setBounds(10, 692, 65, 65);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon("C:\\Users\\91777\\Downloads\\6.png"));
		lblNewLabel_3_1_1.setBounds(1225, 10, 65, 65);
		contentPane.add(lblNewLabel_3_1_1);
		

		System.out.println(al);
		
		

	}
}
