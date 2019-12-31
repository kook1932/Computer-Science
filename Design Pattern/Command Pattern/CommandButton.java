import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CommandButton extends JButton implements Command{
	protected ImageIcon icon;
	protected ImageIcon[] undoList;
	protected JLabel label;
	protected UndoButton undoButton;
	protected JTextArea textfield;
	
	public CommandButton(String title, ActionListener action, int width, int height, JLabel label) 
	{
		super(title);
		this.icon = new ImageIcon();
		this.undoList = new ImageIcon[2];
		undoList[0] = new ImageIcon();
		undoList[1] = new ImageIcon();
		this.label = label;
		this.createButton(title, action, width, height);
	}
	
	public CommandButton(String title, ActionListener action, int width, int height, JLabel label, 
			             JButton undo, JTextArea tf)
	{
		super(title);
		this.icon = new ImageIcon(title + ".jpg");
		this.label = label;
		undoButton = (UndoButton) undo;
		this.createButton(title, action, width, height);
		this.textfield = tf;
	}
	
	private JButton createButton(String text, ActionListener listener, int width, int height) {
        this.addActionListener(listener);
        Dimension buttonDimension = new Dimension(width, height);
        this.setMaximumSize(buttonDimension);
        this.setMinimumSize(buttonDimension);
        this.setPreferredSize(buttonDimension);
        return this;
    }
    
	@Override
	public void execute() 
	{
		undoButton.undoList[0] = undoButton.undoList[1]; 
		undoButton.undoList[1] = icon;
		textfield.setText("undo button 클릭 시 나오는 이미지 : " + undoButton.undoList[0].toString() + 
						  "\n" + "현재 클릭한 이미지 : " + undoButton.undoList[1].toString());
		label.setIcon(icon);
	}
}
