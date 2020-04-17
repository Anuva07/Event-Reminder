import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Reminder extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reminder frame = new Reminder();
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
	public Reminder() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(10, 10));
		
		JButton setbtn = new JButton("Set Event");
		setbtn.setForeground(Color.BLACK);
		setbtn.setBackground(new Color(250, 128, 114));
		setbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				SetReminder setrm = new SetReminder();
				setrm.setVisible(true);
				Reminder rm = new Reminder();
				rm.setVisible(false);
			}
		});
		setbtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		contentPane.add(setbtn, BorderLayout.SOUTH);
		
		JLabel reminderlabel = new JLabel("");
		Image projectpic = new ImageIcon(this.getClass().getResource("/reminder2.png")).getImage();
		reminderlabel.setIcon(new ImageIcon(projectpic));
		contentPane.add(reminderlabel, BorderLayout.CENTER);
	}

}
