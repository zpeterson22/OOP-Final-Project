package MusicPlayerSkin;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class DefaultLayout extends JPanel {

	public DefaultLayout() {
		setLayout(new BorderLayout());
		setSize(300, 300);

		// setBackground(Color.green);

		JPanel pan1 = new JPanel();
		pan1.setBackground(Color.decode("#850CE8"));

		MusicController mc = new MusicController();

		JPanel pan2 = new JPanel();
		pan2.setBackground(Color.decode("#000000"));
		pan2.setSize(50, 200);
		pan2.add(new JButton("Test"));

		JPanel pan3 = new JPanel();
		pan3.setBackground(Color.decode("#000000"));

		JPanel pan4 = new JPanel();
		pan4.setBackground(Color.decode("#000000"));

		add(pan1, BorderLayout.CENTER);
		add(mc, BorderLayout.NORTH);
		add(pan2, BorderLayout.SOUTH);
		add(pan3, BorderLayout.EAST);
		add(pan4, BorderLayout.WEST);
	}

}
