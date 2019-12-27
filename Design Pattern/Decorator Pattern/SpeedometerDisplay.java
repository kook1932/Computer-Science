import java.awt.Dimension;
import javax.swing.*;

public class SpeedometerDisplay extends DisplayDecorator 
{
	LabelPanel labelPanel;
	Display displayComponent; // 여태까지 만들어진 디스플레이

	SpeedometerDisplay(Display display, int width, int height) 
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
		labelPanel.updateText("Speed: 60");
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