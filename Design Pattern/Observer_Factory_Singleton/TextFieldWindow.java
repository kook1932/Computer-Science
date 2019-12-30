import java.awt.*;
import javax.swing.*;

public class TextFieldWindow extends productWindow
{
	JTextField textField;

	TextFieldWindow(String title, int x, int y, int width, int height) 
	{
		super(title, x, y, width, height);
	}

	public void updateText(String msg) 
	{
		textField.setText(msg);
		textField.validate();
	}

	public JPanel createPanel(int width, int height)
	{
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		textField = new JTextField();
		panel.add(textField);
		panel.setPreferredSize(new Dimension(width, height));
		return panel;
	}
}