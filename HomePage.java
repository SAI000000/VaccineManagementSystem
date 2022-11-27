package com.vaccine.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import java.awt.Canvas;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JPasswordField ps1;
	
	/*
	   Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 1200, 600);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(new Color(255, 255, 240));
		contentPane.setBorder(new LineBorder(new Color(255, 239, 213), 5, true));
		setContentPane(contentPane);
		setUndecorated(true);
		contentPane.setLayout(null);
		
		JLabel war1 = new JLabel("*");
		war1.setForeground(new Color(255, 0, 0));
		war1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 26));
		war1.setBounds(1069, 223, 45, 44);
		contentPane.add(war1);
		war1.setVisible(false);
		
		JLabel war2 = new JLabel("*");
		war2.setForeground(Color.RED);
		war2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 26));
		war2.setBounds(1069, 304, 45, 44);
		contentPane.add(war2);
		war2.setVisible(false);
		
		JButton loginbtn = new JButton("Login");
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt1.getText().trim().isEmpty() && ps1.getText().trim().isEmpty()) {
				war1.setVisible(true);
				war2.setVisible(true);
				}
				else if (txt1.getText().trim().isEmpty()) {
					war1.setVisible(true);
					war2.setVisible(false);
				}
				else if (ps1.getText().trim().isEmpty()) {
					war2.setVisible(true);
					war1.setVisible(false);
				}
				else {
					war1.setVisible(false);
					war2.setVisible(false);
				}
			}
			
		});
		loginbtn.setForeground(new Color(0, 0, 0));
		loginbtn.setBorderPainted(false);
		/*loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lg=new LoginPage();
				lg.setVisible(true);
				setVisible(false);
			}
		});*/
		loginbtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 23));
		loginbtn.setBackground(new Color(255, 255, 240));
		loginbtn.setBounds(991, 455, 175, 50);
		contentPane.add(loginbtn);
		
		JButton signupbtn = new JButton("Sign Up");
		signupbtn.setForeground(new Color(0, 0, 0));
		signupbtn.setBorderPainted(false);
		signupbtn.setBorder(new LineBorder(new Color(220, 20, 60), 5, true));
		signupbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationPage rg=new RegistrationPage();
				rg.setVisible(true);
				setVisible(false);
			}
		});
		signupbtn.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 23));
		signupbtn.setBackground(new Color(255, 255, 240));
		signupbtn.setBounds(792, 455, 175, 50);
		contentPane.add(signupbtn);
		
		
		JLabel lblNewLabel_1 = new JLabel("Don't have an account?,   Sign up.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(667, 403, 353, 27);
		contentPane.add(lblNewLabel_1);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		txt1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txt1.setColumns(10);
		txt1.setBounds(817, 230, 242, 44);
		contentPane.add(txt1);
		
		JLabel lblNewLabel_2 = new JLabel("Email-Id :");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(667, 230, 124, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password :");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(667, 313, 124, 35);
		contentPane.add(lblNewLabel_2_1);
		
		ps1 = new JPasswordField();
		ps1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		ps1.setBounds(817, 316, 242, 35);
		contentPane.add(ps1);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Your Details..");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		lblNewLabel_3.setBounds(681, 143, 485, 56);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("WELCOME TO VACCINE REGISTRATION...!!");
		lblNewLabel_3_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 21));
		lblNewLabel_3_1.setBounds(667, 41, 485, 56);
		contentPane.add(lblNewLabel_3_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnBack.setForeground(new Color(0, 0, 0));
		btnBack.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 23));
		btnBack.setBorderPainted(false);
		btnBack.setBorder(new LineBorder(new Color(220, 20, 60), 5, true));
		btnBack.setBackground(new Color(255, 255, 240));
		btnBack.setBounds(583, 455, 175, 50);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\91777\\Downloads\\earth1.png"));
		lblNewLabel.setBounds(56, 32, 389, 342);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2_2 = new JLabel("Get Vaccinated.");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 33));
		lblNewLabel_2_2.setBounds(56, 403, 300, 35);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Do your part.");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 23));
		lblNewLabel_2_3.setBounds(92, 463, 169, 35);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Protect Yourself.");
		lblNewLabel_2_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_3_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 27));
		lblNewLabel_2_3_1.setBounds(143, 523, 242, 35);
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("Protect Others.");
		lblNewLabel_2_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_3_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 27));
		lblNewLabel_2_3_1_1.setBounds(304, 455, 242, 35);
		contentPane.add(lblNewLabel_2_3_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\91777\\Downloads\\s2.png"));
		lblNewLabel_4.setBounds(518, 63, 77, 374);
		contentPane.add(lblNewLabel_4);
		
	
	}
}
