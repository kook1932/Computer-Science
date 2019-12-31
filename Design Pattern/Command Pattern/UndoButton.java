import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class UndoButton extends CommandButton implements Command
{	
	public UndoButton(String title, ActionListener action, int width, int height, JLabel label) 
	{
		super(title, action, width, height, label);
	}
    
	@Override
	public void execute() 
	{
		label.setIcon(undoList[0]);
	}
    
}
