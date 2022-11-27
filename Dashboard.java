package com.vaccine.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 60, 1300, 700);
		contentPane = new JPanel();
	
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 240));
		panel.setBounds(36, 209, 184, 441);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setVisible(false);
		
		JLabel lblNewLabel_2 = new JLabel("name should be displayed");
		lblNewLabel_2.setBounds(996, 109, 158, 38);
		contentPane.add(lblNewLabel_2);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(379, 257, 466, 296);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\91777\\Downloads\\ppro.png"));
		lblNewLabel_1.setBounds(1194, 92, 55, 55);
		contentPane.add(lblNewLabel_1);
		
		JLabel menu = new JLabel("");
		menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setVisible(true);
			}
		});
		menu.setIcon(new ImageIcon("C:\\Users\\91777\\Downloads\\three3.png"));
		menu.setBounds(23, 92, 55, 55);
		contentPane.add(menu);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Profile Info");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBounds(25, 28, 114, 32);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Book Appointment");
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.setVisible(true);
			}
		});
		lblNewLabel_3_1.setForeground(Color.BLACK);
		lblNewLabel_3_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_3_1.setBounds(25, 70, 155, 32);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Sign Out");
		lblNewLabel_3_2.setForeground(Color.BLACK);
		lblNewLabel_3_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_3_2.setBounds(25, 115, 114, 32);
		panel.add(lblNewLabel_3_2);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new MatteBorder(6, 0, 0, 0, (Color) new Color(0, 0, 0)));
		separator.setBounds(33, 157, 1216, 32);
		contentPane.add(separator);
	
		
		JLabel lblNewLabel = new JLabel("Mobile No:");
		lblNewLabel.setBounds(69, 33, 81, 22);
		panel_1.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		
		JLabel lblDose = new JLabel("Dose:");
		lblDose.setBounds(0, 98, 151, 32);
		panel_1.add(lblDose);
		lblDose.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDose.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		
		JLabel lblCentre = new JLabel("Centre:");
		lblCentre.setBounds(98, 168, 52, 22);
		panel_1.add(lblCentre);
		lblCentre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCentre.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setBounds(185, 31, 251, 33);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JComboBox dosecombo = new JComboBox();
		dosecombo.setBounds(185, 98, 251, 32);
		panel_1.add(dosecombo);
		dosecombo.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		dosecombo.setModel(new DefaultComboBoxModel(new String[] {"1st Dose", "2nd Dose"}));
		
		JComboBox centrecombo = new JComboBox();
		centrecombo.setBounds(185, 163, 251, 32);
		panel_1.add(centrecombo);
		centrecombo.setModel(new DefaultComboBoxModel(new String[] {"Shelgi", "UPSC Health care", "Shinde school", "Rugnalay", "UPSC Nilam Nagar", "Lokmangal "}));
		centrecombo.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		
		JButton btnNewButton = new JButton("Book Appointment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				JOptionPane.showMessageDialog(null,"Appointment Booked");
				
			}
		});
		btnNewButton.setBounds(225, 237, 137, 32);
		panel_1.add(btnNewButton);
		setUndecorated(true);
		
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setVisible(false);
			}
		});
	}
}
