package com.swshcool.guibasic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserID;
	private JTextField txtUserPWD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//데이터베이스 연결
					if(DBUtil.dbconn == null)DBUtil.DBCConnect(); //인스턴스 안해도 씀dbconn
					
					Login frame = new Login();
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
	public Login() {
		setTitle("Login Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Login Demo");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(101, 28, 231, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USER ID");
		lblNewLabel_1.setBounds(78, 106, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setBounds(78, 131, 67, 15);
		contentPane.add(lblNewLabel_2);
		
		txtUserID = new JTextField();
		txtUserID.setBounds(157, 103, 116, 21);
		contentPane.add(txtUserID);
		txtUserID.setColumns(20);
		
		txtUserPWD = new JTextField();
		txtUserPWD.setBounds(157, 128, 116, 21);
		contentPane.add(txtUserPWD);
		txtUserPWD.setColumns(20);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//데이터 베이스 연결
				if(DBUtil.dbconn == null)DBUtil.DBCConnect();
				String userid = txtUserID.getText();
				String userpwd = txtUserPWD.getText();
				//유저아이디와 비밀번호를 사용, 데이터베이스연결을 시도
				System.out.println("[MyMGS]데이터베이스 연결에 실패하였습니다.");
				
				
			}
		});
		btnLogin.setBounds(282, 102, 77, 47);
		contentPane.add(btnLogin);
	}
}
