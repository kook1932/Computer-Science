import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends FrameWindow implements ActionListener 
{
	private static final String MAIN_TITLE = "Main Window";
	private static final String TEXTFIELD_WINDOW_TITLE = "TextField Window";
	private static final String LABEL_WINDOW_TITLE = "Label Window";
	private static final String REMOVE_TITLE = "Remove ";
	private static final String ADD_TITLE = "Add ";
	private static final String TEXTFIELD_OBSERVER_BUTTON_TITLE = "TextField Window Observer";
	private static final String LABEL_OBSERVER_BUTTON_TITLE = "Label Window Observer";
	private static final String STOP_THREAD_BUTTON_TITLE = "Stop Generating Prime Number";
	private static final int X = 250;
	private static final int Y = 100;
	private static final int WIDTH = 600;
	private static final int HEIGHT = 200;
	private static final int GAP = 50;
	
	private JButton stopButton;
	private JButton textFieldObserverButton;
	private JButton labelObserverButton;
	private PrimeObservableThread primeThread;
	private TextFieldWindow textFieldWindow = new TextFieldWindow("TextField Window", 250, 350, 600, 200);
	private LabelWindow labelWindow = new LabelWindow("Label Window", 250, 600, 600, 200);
	private boolean textFieldObserverRemoved = false;
	private boolean labelObserverRemoved = false;

    public MainWindow(String title) 
    {
        super(title, X, Y, WIDTH, HEIGHT);
        textFieldWindow = new TextFieldWindow(TEXTFIELD_WINDOW_TITLE, X, Y + HEIGHT + GAP, WIDTH, HEIGHT);
        labelWindow = new LabelWindow(LABEL_WINDOW_TITLE, X, Y + (HEIGHT + GAP) * 2, WIDTH, HEIGHT);
        
        /*addWindowListener(new WindowAdapter() 
        {
        	@Override
            public void windowClosing(WindowEvent e) 
            {
                primeThread.stopRunning();
                textFieldWindow.closeWindow();
                labelWindow.closeWindow();
                System.exit(0);
            }
        });*/

        primeThread = new PrimeObservableThread();
        primeThread.addObserver(textFieldWindow);
        primeThread.addObserver(labelWindow);
        primeThread.run();
    }

	private JButton createButton(String text, ActionListener listener, int width, int height) 
	{
		JButton button = new JButton(text);
		button.addActionListener(listener);
		Dimension buttonDimension = new Dimension(width, height / 3);
		button.setMaximumSize(buttonDimension);
		button.setMinimumSize(buttonDimension);
		button.setPreferredSize(buttonDimension);
		return button;
	}

	public JPanel createPanel(int width, int height)
	{
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, 1));
		panel.setPreferredSize(new Dimension(width, height));
		textFieldObserverButton = createButton("Remove TextField Window Observer", this, width, height);
		panel.add(textFieldObserverButton);
		labelObserverButton = createButton("Remove Label Window Observer", this, width, height);
		panel.add(labelObserverButton);
		stopButton = createButton("Stop Generating Prime Number", this, width, height);
		panel.add(stopButton);
		return panel;
	}

	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == textFieldObserverButton) 
		{
			if (textFieldObserverRemoved) 
			{
				primeThread.addObserver(textFieldWindow);
				textFieldObserverRemoved = false;
				textFieldObserverButton.setText("Remove TextField Window Observer");
			} 
			else 
			{
				primeThread.removeObserver(textFieldWindow);
				textFieldObserverRemoved = true;
				textFieldObserverButton.setText("Add TextField Window Observer");
			}
		} 
		
		else if (e.getSource() == labelObserverButton) 
		{
			if (labelObserverRemoved) 
			{
				primeThread.addObserver(labelWindow);
				labelObserverRemoved = false;
				labelObserverButton.setText("Remove Label Window Observer");
			} 
			else 
			{
				primeThread.removeObserver(labelWindow);
				labelObserverRemoved = true;
				labelObserverButton.setText("Add Label Window Observer");
			}
		} 
		else if (e.getSource() == stopButton) 
		{
			primeThread.stopRunning();
		}

	}

	public static void main(String[] args) 
	{
		new MainWindow("Main Window");
	}
}
