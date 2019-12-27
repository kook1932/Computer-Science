import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LabelWindow extends FrameWindow implements Observer 
{
	JFrame frame;
	JLabel label;

	public LabelWindow(String title, int x, int y, int width, int height)
	{
		super(title, x, y, width, height);
	}

	public void updateText(String msg) 
	{
		label.setText(msg);
		label.validate();
	}

	public JPanel createPanel(int width, int height) 
	{
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		label = new JLabel();
		panel.add(label);
		panel.setPreferredSize(new Dimension(width, height));
		return panel;
	}

	public void update(int primeNumber) 
	{
		updateText(Integer.toString(primeNumber));
	}
}