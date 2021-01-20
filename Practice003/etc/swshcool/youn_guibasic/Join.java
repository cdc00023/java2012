package com.swshcool.youn_guibasic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Join extends JFrame {

	private JPanel contentPane;
	private JTextField textUserName;
	private JPasswordField textPwd;
	private JPasswordField textConfirm;
	private JTextField textAdd;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	//UI에서 입력된 값을 취하기 위한 임시 변수
	private String username;
	private String userpwd;
	private String confirm;
	private char gender;
	private String addr;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join frame = new Join();
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
	public Join() {
		setTitle("join Member");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 395, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("join as new member");
		lblNewLabel.setBounds(87, 24, 204, 24);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setBounds(12, 58, 78, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBounds(12, 99, 78, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Confirm");
		lblNewLabel_1_1_1.setBounds(12, 144, 78, 15);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Gender");
		lblNewLabel_1_1_1_1.setBounds(12, 189, 78, 15);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Address");
		lblNewLabel_1_1_1_1_1.setBounds(12, 231, 78, 15);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JRadioButton rdoMale = new JRadioButton("Male");
		rdoMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   gender = 'M';
			}
		});
		buttonGroup.add(rdoMale);
		rdoMale.setBounds(98, 185, 53, 23);
		contentPane.add(rdoMale);
		
		JRadioButton rdoFemale = new JRadioButton("Female");
		rdoFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gender ='F';
			}
		});
		buttonGroup.add(rdoFemale);
		rdoFemale.setBounds(224, 185, 67, 23);
		contentPane.add(rdoFemale);
		
		textUserName = new JTextField();
		textUserName.setBounds(94, 58, 258, 21);
		contentPane.add(textUserName);
		textUserName.setColumns(10);
		
		textPwd = new JPasswordField();
		textPwd.setBounds(94, 96, 258, 21);
		contentPane.add(textPwd);
		
		textConfirm = new JPasswordField();
		textConfirm.setBounds(94, 141, 258, 21);
		contentPane.add(textConfirm);
		
		textAdd = new JTextField();
		textAdd.setBounds(97, 228, 255, 21);
		contentPane.add(textAdd);
		textAdd.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//UI 입력요소들을 리셋
				textUserName.setText("");
				textAdd.setText("");
				buttonGroup.clearSelection();				
				textPwd.setText("");
				textConfirm.setText("");
				textAdd.setText("");
			}
		});
		btnReset.setBounds(98, 270, 97, 23);
		contentPane.add(btnReset);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//UI 입력된 데이터 값을 저장(JOIN)
			}
		});
		btnSave.setBounds(254, 270, 97, 23);
		contentPane.add(btnSave);
	}
}
