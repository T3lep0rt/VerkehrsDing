import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;

public class GUI {

	private JFrame frame;
	private JFrame frameTwo;
	private Manager VerkehrsManager = new Manager();
	private JTextField tfEingabe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.pack();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		tfEingabe = new JTextField();
		tfEingabe.setBounds(39, 199, 86, 20);
		frame.getContentPane().add(tfEingabe);
		tfEingabe.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(171, 0, 263, 188);
		frame.getContentPane().add(lblNewLabel);
		
		frameTwo = new JFrame();
		frameTwo.setBounds(100, 100, 450, 300);
		frameTwo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameTwo.setLocation(frame.getX() + frame.getWidth(), frame.getY());
		frameTwo.setVisible(true);

		
		JLabel lblAnzeige = new JLabel("");
		lblAnzeige.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblAnzeige.setBounds(151, 65, 283, 84);
		frameTwo.getContentPane().add(lblAnzeige);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerkehrsManager.setInput(tfEingabe.getText());
				lblNewLabel.setText(VerkehrsManager.getStau());
			}
		});
		btnSubmit.setBounds(136, 198, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText(VerkehrsManager.vorherigeMeldung());
			}
		});
		btnBack.setBounds(234, 173, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnPush = new JButton("Push");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblAnzeige.setText(VerkehrsManager.getStau());
			}
		});
		btnPush.setBounds(335, 198, 89, 23);
		frame.getContentPane().add(btnPush);
		
		JButton btnForward = new JButton("Forward");
		btnForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText(VerkehrsManager.forward());
			}
		});
		btnForward.setBounds(234, 211, 89, 23);
		frame.getContentPane().add(btnForward);
		


	}
}
