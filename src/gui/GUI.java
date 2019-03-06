package gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;



public class GUI {
	Image cancel_image_resize = new ImageIcon("src/resources/cancel.jpg").getImage().getScaledInstance( 20, 20,  java.awt.Image.SCALE_SMOOTH );
	ImageIcon cancel_image_resized = new ImageIcon(cancel_image_resize);
	
	/*
	 * Dichiarazione dei componenti
	 */
	Frame window = new Frame("GUI"); // Finestra
	Panel title_bar = new Panel(); // Barra per il titolo
	
	JButton button_close = new JButton(cancel_image_resized); // Bottone di chiusura
	
	/*
	 * Costuttore con la configurazione dei componenti
	 */
	GUI(){
		/*
		 * Configurazione
		 */
		double 	width = 1.3, // 1 - 2
				height = 1.3; // 1 - 2
		
		/*
		 * Impostazioni di base del window
		 */
		int window_width = (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / width),
			window_height = (int) ( Toolkit.getDefaultToolkit().getScreenSize().getHeight() / height);
		int posx = (int) ((Toolkit.getDefaultToolkit().getScreenSize().getWidth()  / 2) - (window_width / 2)),
			posy = (int) ((Toolkit.getDefaultToolkit().getScreenSize().getHeight()  / 2) - (window_height / 2));
		
		window.setSize(window_width, window_height); // Misura del window
		window.setLocation(posx, posy); // Posizione sullo schermo del window
		
		window.setBackground(new Color(23,26,40)); // Colore di backdround del window
		window.setUndecorated(true); // Cancella la title_bar
		window.setLayout(null); // Custom Layout
		
		/*
		 * Componenti
		 */
		button_close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		/*
		 * Configurazione dei componenti
		 */
		button_close.setBounds(window_width-10-20, 10, 20, 20);
		button_close.setRolloverEnabled(false); // Cancella l'animazione mentre il puntatore del mouse e' sopra
		button_close.setBorderPainted(false); // Cancella i bordi del bottone
		button_close.setContentAreaFilled(false); // Cancella il background del bottone
		/*
		 * L'aggiunta dei componenti
		 */
		window.add(button_close);
		window.setVisible(true);
	}
	
	/*
	 * Avvio
	 */
	public static void main(String[] args) {
		new GUI();
	}
}
