package cda.hello;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SwingHello implements Hello {
	JFrame frame = new JFrame(); // main window, container of all the elements
	JPanel panel = new JPanel(); // container of elements in windows
	JLabel label; // component for placing text in a container
	JButton button; // container for all

	@Override
	public void render() {
		label = new JLabel("Hello World!");
		label.setFont(new Font("Arial", Font.BOLD, 44));
		label.setHorizontalAlignment(SwingConstants.CENTER);

		button = new JButton("Exit");

		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.add(label);
		panel.add(button);

		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(300, 200);
		frame.setVisible(true);

		onClick();
	}

	@Override
	public void onClick() {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				System.exit(0);
			}
		});
	}
}
