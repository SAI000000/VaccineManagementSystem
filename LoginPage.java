package com.vaccine.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField eml1;
	private JTextField pass1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 240));
		contentPane.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(255, 222, 173)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel inwarn = new JLabel("Incorrect Details   !!");
		inwarn.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		inwarn.setForeground(Color.RED);
		inwarn.setBounds(406, 266, 156, 29);
		contentPane.add(inwarn);
		inwarn.setVisible(false);
		
		JLabel lblNewLabel_2_2 = new JLabel("Enter your Details..");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 23));
		lblNewLabel_2_2.setBounds(128, 241, 242, 50);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel warn1 = new JLabel("*");
		warn1.setForeground(Color.RED);
		warn1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 26));
		warn1.setBounds(509, 314, 45, 44);
		contentPane.add(warn1);
		warn1.setVisible(false);
		
		JLabel warn2 = new JLabel("*");
		warn2.setForeground(Color.RED);
		warn2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 26));
		warn2.setBounds(509, 390, 45, 44);
		contentPane.add(warn2);
		warn2.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\91777\\Downloads\\user4.png"));
		lblNewLabel.setBounds(271, 40, 181, 191);
		contentPane.add(lblNewLabel);
		
		eml1 = new JTextField();
		eml1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		eml1.setColumns(10);
		eml1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		eml1.setBounds(257, 310, 242, 44);
		contentPane.add(eml1);
		
		pass1 = new JTextField();
		pass1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		pass1.setColumns(10);
		pass1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		pass1.setBounds(257, 397, 242, 44);
		contentPane.add(pass1);
		
		JLabel lblNewLabel_2 = new JLabel("Email-Id :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel_2.setBounds(100, 323, 124, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password :");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(100, 399, 124, 35);
		contentPane.add(lblNewLabel_2_1);
		
		
	
		
		
		
		JButton loginbtn = new JButton("Login");
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(eml1.getText().trim().isEmpty() && pass1.getText().trim().isEmpty()) {
				warn1.setVisible(true);
				warn2.setVisible(true);
				}
				else if (eml1.getText().trim().isEmpty()) {
					warn1.setVisible(true);
					warn2.setVisible(false);
				}
				else if (pass1.getText().trim().isEmpty()) {
					warn2.setVisible(true);
					warn1.setVisible(false);
				}
				else {
					warn1.setVisible(false);
					warn2.setVisible(false);
				}
			    jdbctrial1 oral = new jdbctrial1();
				int a =oral.login(eml1.getText(),pass1.getText());
				System.out.println(a);
				if(a==0) {
					inwarn.setVisible(true);
				}
				else if(a==2){
					
					inwarn.setVisible(false);
					Dashboard hm= new Dashboard();
					hm.setVisible(true);
				}
				System.out.println("login page overs");
			}
			
		
			
		});
		loginbtn.setForeground(Color.BLACK);
		loginbtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 23));
		loginbtn.setBorderPainted(false);
		loginbtn.setBackground(new Color(255, 255, 240));
		loginbtn.setBounds(406, 492, 100, 50);
		contentPane.add(loginbtn);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 23));
		btnBack.setBorderPainted(false);
		btnBack.setBorder(new LineBorder(new Color(220, 20, 60), 5, true));
		btnBack.setBackground(new Color(255, 255, 240));
		btnBack.setBounds(141, 492, 175, 50);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 222, 173)));
		lblNewLabel_1.setBounds(32, 25, 638, 554);
		contentPane.add(lblNewLabel_1);
		setUndecorated(true);
	}
}
