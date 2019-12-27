import java.awt.Dimension;
import java.util.Date;
import javax.swing.*;

public class TimeDisplay extends DisplayDecorator 
{
	LabelPanel labelPanel;
	Display displayComponent;

	TimeDisplay(Display display, int width, int height) 
	{
		super(display, width, height);
		displayComponent = display;
		labelPanel = new LabelPanel();
	}

	public JPanel create() 
	{
		JPanel jp = new JPanel();
		jp.setLayout(new BoxLayout(jp, 1));
		JPanel subPanel = displayComponent.create();
		jp.add(subPanel);
		jp.add(labelPanel.createPanel(getWidth(), getHeight()));
		jp.setPreferredSize(new Dimension(getWidth(), getHeight()));
		return jp;
	}

	public void show() 
	{
		displayComponent.show();
		Date date = new Date();
		labelPanel.updateText(date.toString());
	}

	public int getHeight() 
	{
		return displayComponent.getHeight() + super.getHeight();
	}
	
	public int getWidth()
	{
		return displayComponent.getWidth() + super.getWidth();
	}
}