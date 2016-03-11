package MusicPlayerSkin;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class LayoutThree extends BaseLayout{
	// img = new
	// ImageIcon(this.getClass().getResource("musicblack.png")).getImage();

	public LayoutThree() {
		layout2();
	}
	
	@Override
	public void layout2() {
		setLayout(new BorderLayout());
		setSize(400, 300);
		
		pan1 = new JPanel();
		pan1.setBackground(Color.decode("#FF2000"));
		
		mc3 = new MusicControllerThree();
		
		pan2 = new JPanel();
		pan2.setBackground(Color.decode("#000000"));
		
		pan3 = new JPanel();
		pan3.setBackground(Color.decode("#000000"));
		
		pan4 = new JPanel();
		pan4.setBackground(Color.decode("#000000"));
		
		add(pan1, BorderLayout.CENTER);
		add(mc3, BorderLayout.NORTH);
		add(pan2, BorderLayout.SOUTH);
		add(pan3, BorderLayout.EAST);
		add(pan4, BorderLayout.WEST);
		
	}
	
}
