package com.swshcool.youn_guibasic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;

public class CFirst extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application. 
	 */
	//메뉴얼로 들어가는 설명 /**
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CFirst frame = new CFirst();
					frame.setVisible(true); //눈에 보이도록
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}); 
	}

	/**
	 * Create the frame.
	 */
	public CFirst() {
		setTitle("First Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우창의 x버튼이 눌리면 실행
		setBounds(100, 100, 861, 576); //창 크기(x,y,가로,세로) design탭에서도 조절가능
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel DDDDDD = new JLabel("NEW LABEL FRAME");
		DDDDDD.setFont(new Font("Brush Script MT", Font.PLAIN, 65));
		DDDDDD.setForeground(Color.BLUE);
		DDDDDD.setBounds(61, 10, 633, 113);
		contentPane.add(DDDDDD);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(61, 117, 121, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(61, 262, 115, 23);
		contentPane.add(chckbxNewCheckBox);
		
		textField = new JTextField();
		textField.setBounds(60, 304, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(61, 358, 32, 23);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(58, 405, 97, 23);
		contentPane.add(btnNewButton);
		
		JTextArea textADDDDrea = new JTextArea();
		textADDDDrea.setText("HI HELLO I AM HUMAN");
		textADDDDrea.setBounds(275, 248, 437, 167);
		contentPane.add(textADDDDrea);
	}
}
