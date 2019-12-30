import javax.swing.*;

public abstract class productWindow extends FrameWindow implements Observer{
	productWindow(String title, int x, int y, int width, int height) {
		super(title, x, y, width, height);
	}

	public abstract void updateText(String msg);

	public abstract JPanel createPanel(int width, int height);

	public void update(int primeNumber) 
	{
		updateText(Integer.toString(primeNumber));
	}	
}
