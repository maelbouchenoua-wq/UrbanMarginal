package vue;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChoixJoueur extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPseudo;
	private JLabel lblPrecedent;
	private JLabel lblSuivent;
	private JLabel lblGo;

	private void afficherArene() {
		Arene arene = new Arene();
		arene.setVisible(true);
		this.dispose();
		
	}

	
	/**
	 * Create the frame.
	 */
	public ChoixJoueur() {
		setTitle("Choice");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setPreferredSize(new Dimension(400, 275));
		this.pack();
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		txtPseudo = new JTextField();
		txtPseudo.setBounds(143, 247, 120, 18);
		contentPane.add(txtPseudo);
		txtPseudo.setColumns(10);
		
		lblPrecedent = new JLabel("");
		lblPrecedent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.print("Precedent");
			}
		});
		lblPrecedent.setBounds(61, 146, 44, 45);
		contentPane.add(lblPrecedent);
		
		lblSuivent = new JLabel("");
		lblSuivent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.print("Suivent");
			}
		});
		lblSuivent.setBounds(293, 146, 44, 45);
		contentPane.add(lblSuivent);
		
		lblGo = new JLabel("");
		lblGo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				afficherArene();
			}
			
		});
		lblGo.setBounds(303, 200, 69, 65);
		contentPane.add(lblGo);
		
		JLabel lblFond = new JLabel("");
		lblFond.setBounds(0, 0, 400, 275);
		contentPane.add(lblFond);
		String chemin = "fonds/fondchoix.jpg";
		URL resource = getClass().getClassLoader().getResource(chemin);
		lblFond.setIcon(new ImageIcon(resource));

	}

}
