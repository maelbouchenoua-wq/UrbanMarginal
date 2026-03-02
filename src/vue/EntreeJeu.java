package vue;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class EntreeJeu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIp;

	private void quitterLeJeu() {
		System.exit(0);
	}
	
	private void afficherArene() {
		Arene arene = new Arene();
		arene.setVisible(true);
		this.dispose();
	}
	
	
	private void afficherChoix() {
		ChoixJoueur choix = new ChoixJoueur();
		choix.setVisible(true);
		this.dispose();
	}
	/**
	 * Create the frame.
	 */
	public EntreeJeu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 159);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {
				afficherArene();
			}
		});
		btnStart.setBounds(204, 10, 84, 20);
		contentPane.add(btnStart);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				afficherChoix();
			}
		});
		btnConnect.setBounds(204, 63, 84, 20);
		contentPane.add(btnConnect);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(204, 93, 84, 20);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quitterLeJeu();
			}
		});
		contentPane.add(btnExit);
		
		txtIp = new JTextField();
		txtIp.setText("127.0.0.1");
		txtIp.setBounds(98, 63, 96, 18);
		contentPane.add(txtIp);
		txtIp.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Start a server :");
		lblNewLabel.setBounds(10, 14, 89, 12);
		contentPane.add(lblNewLabel);
		
		JLabel lblConnect = new JLabel("Connect an existing serveur :");
		lblConnect.setBounds(10, 46, 150, 12);
		contentPane.add(lblConnect);
		
		JLabel lblIpServeur = new JLabel("IP serveur :");
		lblIpServeur.setBounds(10, 67, 78, 12);
		contentPane.add(lblIpServeur);

	}
}
