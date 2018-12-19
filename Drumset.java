/*
*
* Daniel Xiong
* 
* Program that mimics a drum kit.
*
* Snare ----- (press Snare button or press 'A' on keyboard)
* Cymbal ---- (press Cymbal button or press 'S' on keyboard)
* Hi-Hat ---- (press Hi-Hat button or press 'D' on keyboard)
* Tom-Toms -- (press Tom-Toms button or press 'F' on keyboard)
* Kick Drum - (press Kick Drum button or press 'G' on keyboard)
*
* Plays audio using .mp3 and .wav files I found online.
*
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javafx.scene.media.*; // For Audio
import java.io.*; // For File class
import javafx.embed.swing.JFXPanel; // Needed for Media and MediaPlayer to run

public class Drumset{

	private JFrame frame;
	private JPanel panel;
	private GridBagLayout layout;
	private JLabel label;
	private JButton snareButton;
	private JButton cymbalButton;
	private JButton hihatButton;
	private JButton kickButton;
	private JButton tomsButton;
	private GridBagConstraints constraints;

	private final JFXPanel fxPanel = new JFXPanel(); // needed for audio

	private final static int WIDTH = 600, HEIGHT = 275;

	public Drumset(){
		frame = new JFrame("Drumset");
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		layout = new GridBagLayout();
		panel = new JPanel();
		panel.setLayout(layout);
		panel.setBackground(Color.PINK);
		constraints = new GridBagConstraints();

		// Adds instructions label
		label = new JLabel("Press the buttons or use A for Snare, S for Cymbal, D for Hi-Hat, F for Tom-Toms, and G for Kick Drum");
		constraints.anchor = GridBagConstraints.NORTH;
		constraints.fill = GridBagConstraints.CENTER;
		constraints.ipady = 40;
		constraints.gridwidth = 3;
		panel.add(label, constraints);
		
		// Adds Snare
		snareButton = new JButton("Snare");
		snareButton.addKeyListener(new myKeyListener());
		snareButton.addActionListener(new snareListener());
		constraints.weightx = 0.5; 
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridwidth = 1;
		constraints.ipady = 20; 
		constraints.gridx = 0;
		constraints.gridy = 1;
		panel.add(snareButton, constraints);
		
		// Adds Cymbal
		cymbalButton = new JButton("Cymbal");
		cymbalButton.addKeyListener(new myKeyListener());
		cymbalButton.addActionListener(new cymbalListener());
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.ipady = 20;
		constraints.weightx = 0.5;
		constraints.gridx = 1;
		constraints.gridy = 1;
		panel.add(cymbalButton, constraints);
		
		// Adds Hi-Hat
		hihatButton = new JButton("Hi-Hat");
		hihatButton.addKeyListener(new myKeyListener());
		hihatButton.addActionListener(new hihatListener());
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.ipady = 20;
		constraints.weightx = 0.5;
		constraints.gridx = 2;
		constraints.gridy = 1;
		panel.add(hihatButton, constraints);
		
		// Adds Toms
		tomsButton = new JButton("Tom-Toms");
		tomsButton.addKeyListener(new myKeyListener());
		tomsButton.addActionListener(new tomsListener());
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.ipady = 40;
		constraints.weightx = 0.0;
		constraints.gridwidth = 3;
		constraints.gridx = 0;
		constraints.gridy = 2;
		panel.add(tomsButton, constraints);
		
		// Adds Kick 
		kickButton = new JButton("Kick Drum");
		kickButton.addKeyListener(new myKeyListener());
		kickButton.addActionListener(new kickListener());
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.ipady = 40;
		constraints.gridx = 0;
		constraints.gridwidth = 3;
		constraints.gridy = 3;
		panel.add(kickButton, constraints);

		frame.add(panel);
		frame.setVisible(true);
	}

	// ActionListener classes for each button
	private class snareListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent a){
			String snare = "snare.wav";
			Media sample = new Media(new File(snare).toURI().toString());
			MediaPlayer mediaPlayer = new MediaPlayer(sample);
			mediaPlayer.play();
		}
	}

	private class cymbalListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent a){
			String crash = "crash.wav";
			Media sample = new Media(new File(crash).toURI().toString());
			MediaPlayer mediaPlayer = new MediaPlayer(sample);
			mediaPlayer.play();
		}
	}

	private class hihatListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent a){
			String hihat = "hihat.mp3";
			Media sample = new Media(new File(hihat).toURI().toString());
			MediaPlayer mediaPlayer = new MediaPlayer(sample);
			mediaPlayer.play();
		}
	}

	private class tomsListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent a){
			String toms = "toms.wav";
			Media sample = new Media(new File(toms).toURI().toString());
			MediaPlayer mediaPlayer = new MediaPlayer(sample);
			mediaPlayer.play();
		}
	}

	private class kickListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent a){
			String kick = "kick.wav";
			Media sample = new Media(new File(kick).toURI().toString());
			MediaPlayer mediaPlayer = new MediaPlayer(sample);
			mediaPlayer.play();
		}
	}

	// KeyListener class for keybinds
	private class myKeyListener implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e){
			if(e.getKeyCode()==KeyEvent.VK_A){
				String snare = "snare.wav";
				Media sample = new Media(new File(snare).toURI().toString());
				MediaPlayer mediaPlayer = new MediaPlayer(sample);
				mediaPlayer.play();
			}
			else if(e.getKeyCode()==KeyEvent.VK_S){
				String crash = "crash.wav";
				Media sample = new Media(new File(crash).toURI().toString());
				MediaPlayer mediaPlayer = new MediaPlayer(sample);
				mediaPlayer.play();
			}
			else if(e.getKeyCode()==KeyEvent.VK_D){
				String hihat = "hihat.mp3";
				Media sample = new Media(new File(hihat).toURI().toString());
				MediaPlayer mediaPlayer = new MediaPlayer(sample);
				mediaPlayer.play();
			}
			else if(e.getKeyCode()==KeyEvent.VK_F){
				String toms = "toms.wav";
				Media sample = new Media(new File(toms).toURI().toString());
				MediaPlayer mediaPlayer = new MediaPlayer(sample);
				mediaPlayer.play();
			}
			else if(e.getKeyCode()==KeyEvent.VK_G){
				String kick = "kick.wav";
				Media sample = new Media(new File(kick).toURI().toString());
				MediaPlayer mediaPlayer = new MediaPlayer(sample);
				mediaPlayer.play();
			}
		}

		@Override
		public void keyReleased(KeyEvent e){
		}

		@Override
		public void keyTyped(KeyEvent e){
		}
	}

	public static void main(String[] args){
		new Drumset();
	}
}