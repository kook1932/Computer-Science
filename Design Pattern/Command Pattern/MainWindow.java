import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MainWindow extends FrameWindow implements ActionListener {
    private static final int X = 250;
    private static final int Y = 100;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;
    private static final int NUM_BUTTONS = 5;
    private static final int BUTTON_HEIGHT = 100;
    private JButton[] buttons;
    private String[] buttonTitles = { "cat", "sheep", "hedgehog", "dog" };
    private JLabel label;
    private JTextArea textfield;

    public MainWindow(String title) {
        super();
        createWindow(title, X, Y, WIDTH, HEIGHT);

    }

    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        label = new JLabel();
        label.setPreferredSize(new Dimension(width, HEIGHT - BUTTON_HEIGHT));
        panel.add(label, BorderLayout.SOUTH);
        
        // undo button을 누르면 어떤 button이 복귀되는지 표시하기 위한 JTextArea
        textfield = new JTextArea("undoList 현황");
        textfield.setPreferredSize(new Dimension(width, HEIGHT - (HEIGHT - BUTTON_HEIGHT)));
        panel.add(textfield,BorderLayout.NORTH);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.setPreferredSize(new Dimension(width, BUTTON_HEIGHT));
        
        // UndoButton을 전달해주기 위해서 먼저 생성한다
        buttons = new JButton[NUM_BUTTONS];
        buttons[NUM_BUTTONS-1] = new UndoButton("undo", this, width / NUM_BUTTONS, BUTTON_HEIGHT, label);
        
        // 다른 CommandButton 생성 시, UndoButton도 같이 넘겨준다
        for (int i = 0; i < NUM_BUTTONS-1; i++) 
        {
            buttons[i] = new CommandButton(buttonTitles[i], this, width / NUM_BUTTONS, 
            		     				   BUTTON_HEIGHT, label, buttons[NUM_BUTTONS-1], textfield);
            buttonPanel.add(buttons[i]);
        }
        buttonPanel.add(buttons[NUM_BUTTONS-1]);
        
        panel.add(buttonPanel);
        return panel;
    }

   @Override
   public void actionPerformed(ActionEvent e) 
   {
	   if (e.getSource() instanceof Command) 
       {
		   Command c = (Command) e.getSource();
           c.execute();
       }
   }
}
