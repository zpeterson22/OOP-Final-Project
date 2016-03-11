package MusicPlayerSkin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class LayoutOne extends BaseLayout {
	// img = new
	// ImageIcon(this.getClass().getResource("musicblack.png")).getImage();

	public LayoutOne() {
		layout2();
	}

	@Override
	public void layout2() {
		setLayout(new BorderLayout());
		setSize(400, 300);

		pan1 = new JPanel();
		pan1.setBackground(Color.decode("#850CE8"));

		mc = new MusicController();

		pan2 = new JPanel();
		pan2.setBackground(Color.decode("#000000"));

		pan3 = new JPanel();
		pan3.setBackground(Color.decode("#000000"));

		pan4 = new JPanel();
		pan4.setBackground(Color.decode("#000000"));

		add(pan1, BorderLayout.CENTER);
		add(mc, BorderLayout.NORTH);
		add(pan2, BorderLayout.SOUTH);
		add(pan3, BorderLayout.EAST);
		add(pan4, BorderLayout.WEST);
	}

}
