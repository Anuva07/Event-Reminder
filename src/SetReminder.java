import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class SetReminder extends JFrame {

	private JPanel contentPane;
	private JTextField nametxt;
	private JTextField datetxt;
	private JTextField timetxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetReminder frame = new SetReminder();
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
	public SetReminder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel picpanel = new JLabel("");
		Image projectpic = new ImageIcon(this.getClass().getResource("/clock1.png")).getImage();
		picpanel.setIcon(new ImageIcon(projectpic));
		contentPane.add(picpanel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 222, 179));
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 222, 179));
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(0, 2, 30, 30));
		
		JLabel Name = new JLabel("Event Name");
		Name.setFont(new Font("Tahoma", Font.BOLD, 27));
		Name.setBackground(new Color(240, 240, 240));
		panel_1.add(Name);
		
		nametxt = new JTextField();
		panel_1.add(nametxt);
		nametxt.setColumns(10);
		
		JLabel Date = new JLabel("Set Date");
		Date.setFont(new Font("Tahoma", Font.BOLD, 27));
		panel_1.add(Date);
		
		datetxt = new JTextField();
		panel_1.add(datetxt);
		datetxt.setColumns(10);
		
		JLabel Time = new JLabel("Set Time");
		Time.setBackground(new Color(176, 224, 230));
		Time.setFont(new Font("Tahoma", Font.BOLD, 27));
		panel_1.add(Time);
		
		timetxt = new JTextField();
		panel_1.add(timetxt);
		timetxt.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 222, 179));
		panel.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JButton Confirm = new JButton("Confirm Event");
		Confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
//				SETREMINDER SETRM = NEW SETREMINDER();
//				SETRM.SETVISIBLE(FALSE);
//				REMINDER RM = NEW REMINDER();
//				RM.SETVISIBLE(FALSE);
				String N = nametxt.getText();
				String D = datetxt.getText();
				String T = timetxt.getText();
				
				if(!N.equals("")  && !D.equals("")  && !T.equals(""))
				{
					//dispose();
				
				BufferedWriter out1, out2, out3;
				
				try
				{
					out1 = new BufferedWriter(new FileWriter("data.txt", true));
					out1.append(N);
					out1.newLine();
					out1.append(D);
					out1.newLine();
					out1.append(T);
					out1.newLine();
					out1.close();
									
				}
				catch (IOException e1) {
					e1.printStackTrace();
				}
				
/*				try
				{
					out2 = new BufferedWriter(new FileWriter("data.txt", true));
					out2.append(D);
					out2.newLine();
					out2.close();
				}
				catch (IOException e1) {
					e1.printStackTrace();
				}
				
				try
				{
					out3 = new BufferedWriter(new FileWriter("data.txt", true));
					out3.append(T);
					out3.newLine();
					out3.close();
				}
				catch (IOException e1) {
					e1.printStackTrace();
				}
				*/
				dispose();
				
			}
				else 
				{
					
					JOptionPane.showMessageDialog(null," Invalid input");
					dispose();
				}
			}
		});
		Confirm.setBackground(new Color(250, 128, 114));
		Confirm.setFont(new Font("Tahoma", Font.PLAIN, 35));
		panel_2.add(Confirm);
		
		
	}

}
