/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverraidzada;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;



import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;


public class Main extends JFrame {

	URL som = Main.class.getResource("som.wav");
        AudioClip Som = Applet.newAudioClip(som);
   
	public Main() {
                
		construirMenuBar();
		construirFase();
		configurarTela();
              
	}

	public static void main(String[] args) {
                Main tocar = new Main();
                tocar.Som.loop();
		
	}
        
        

	private JMenuBar construirMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.white);
		menuBar.setBorder(new LineBorder(Color.black));
		JMenu menu = new JMenu("Opções");
		JMenuItem sobre = new JMenuItem("Sobre");
		sobre.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Lucas Sant'Ana Mingatos - 826274 \n Caio Hatano Basso - 827213",
								"Informações", JOptionPane.WARNING_MESSAGE);
			}
		});

		JMenuItem sair = new JMenuItem("Sair");
		sair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		menu.add(sobre);
		menu.add(new JSeparator());
		menu.add(sair);
		menuBar.add(menu);
		setJMenuBar(menuBar);

		return menuBar;
	}

	private JPanel construirFase() {
		Fase fase = new Fase();
		add(fase);
		return fase;
	}

	private void configurarTela() {
		setSize(800, 650);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("RIVER RAIDZADA");
	}
}

