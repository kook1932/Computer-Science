import javax.swing.*;

public abstract class FrameWindow {
    JFrame frame;

    FrameWindow() {
    }

    public JFrame createWindow(String title, int x, int y, int width, int height) {
        frame = new JFrame(title);
        frame.setBounds(x, y, width, height);
        JPanel panel = createPanel(width, height);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    public abstract JPanel createPanel(int width, int height);
}
