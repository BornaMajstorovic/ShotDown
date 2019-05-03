
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Gui extends JFrame {
	
	
	public Gui() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(1250, 550, 600, 600);
		setTitle("Shot down");
		
		
		JPanel panel = (JPanel) getContentPane();
		panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		ImageIcon image = new ImageIcon("night.jpg");
		JLabel label = new JLabel(image);
		panel.add(label,BorderLayout.CENTER);
		
	
		
		JLabel time = new JLabel("Number of minutes before shotdown");
		panel.add(time,BorderLayout.WEST);
		
		final JTextField input = new JTextField();
		panel.add(input, BorderLayout.CENTER);
		input.setColumns(5);
		
		
		JPanel southPanel = new JPanel();
		panel.add(southPanel,BorderLayout.SOUTH);
		
		JButton go = new JButton("GO");
		southPanel.add(go);
		
		go.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main main = new Main();
				int mins = Integer.parseInt(input.getText());
				main.go(mins);
				JOptionPane.showMessageDialog(Gui.this, "Shutting down in " + mins + " minutes");
				
			}
			});
	}
	
	public static void main(String[] args) throws Exception{
		SwingUtilities.invokeAndWait(()->{
			Gui window = new Gui();
			window.pack();
			window.setVisible(true);
			});
	}

}
