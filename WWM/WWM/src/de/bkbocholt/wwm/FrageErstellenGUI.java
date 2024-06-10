package de.bkbocholt.wwm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrageErstellenGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtFrage;
	private JTextField txtAntwortA;
	private JTextField txtAntwortB;
	private JTextField txtAntwortC;
	private JTextField txtAntwortD;
	private JTextField txtRichtig;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrageErstellenGUI frame = new FrageErstellenGUI();
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
	public FrageErstellenGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 278);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Frage:");
		lblNewLabel.setBounds(10, 39, 74, 14);
		contentPane.add(lblNewLabel);
		
		txtFrage = new JTextField();
		txtFrage.setBounds(94, 36, 408, 20);
		contentPane.add(txtFrage);
		txtFrage.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Antwort a");
		lblNewLabel_1.setBounds(10, 76, 74, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAntwortB = new JLabel("Antwort b");
		lblAntwortB.setBounds(10, 107, 74, 14);
		contentPane.add(lblAntwortB);
		
		JLabel lblAntwortC = new JLabel("Antwort c");
		lblAntwortC.setBounds(10, 138, 74, 14);
		contentPane.add(lblAntwortC);
		
		JLabel lblAntwortD = new JLabel("Antwort d");
		lblAntwortD.setBounds(10, 173, 74, 14);
		contentPane.add(lblAntwortD);
		
		txtAntwortA = new JTextField();
		txtAntwortA.setColumns(10);
		txtAntwortA.setBounds(94, 73, 408, 20);
		contentPane.add(txtAntwortA);
		
		txtAntwortB = new JTextField();
		txtAntwortB.setColumns(10);
		txtAntwortB.setBounds(94, 104, 408, 20);
		contentPane.add(txtAntwortB);
		
		txtAntwortC = new JTextField();
		txtAntwortC.setColumns(10);
		txtAntwortC.setBounds(94, 135, 408, 20);
		contentPane.add(txtAntwortC);
		
		txtAntwortD = new JTextField();
		txtAntwortD.setColumns(10);
		txtAntwortD.setBounds(94, 170, 408, 20);
		contentPane.add(txtAntwortD);
		
		JLabel lblNewLabel_2 = new JLabel("Buchstabe richtige Antwort:");
		lblNewLabel_2.setBounds(10, 204, 176, 14);
		contentPane.add(lblNewLabel_2);
		
		txtRichtig = new JTextField();
		txtRichtig.setBounds(176, 201, 96, 20);
		contentPane.add(txtRichtig);
		txtRichtig.setColumns(10);
		
		JButton button = new JButton("Hauptmen\u00FC");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fenster=new HauptmenueGUI();
				fenster.setVisible(true);
				FrageErstellenGUI.this.dispose();
			}
		});
		button.setBounds(445, 11, 102, 23);
		contentPane.add(button);
		
		JButton btnCommit = new JButton("Commit");
		btnCommit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCommit.setBounds(413, 200, 89, 23);
		contentPane.add(btnCommit);
	}
}
