import javax.swing.*;
import java.awt.event.WindowListener;

public abstract class FrameWindow 
{
	JFrame frame;
	
	FrameWindow(String title, int x, int y, int width, int height) 
	{
		frame = createWindow(title, x, y, width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JFrame createWindow(String title, int x, int y, int width, int height) 
	{
		JFrame frame = new JFrame(title);
		frame.setBounds(x, y, width, height);
		JPanel panel = createPanel(width, height);
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		return frame;
	}

	public abstract JPanel createPanel(int width, int height);
}