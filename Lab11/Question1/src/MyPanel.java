import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public MyPanel() {
        super();
        this.addMouseListener(new MyMouseAdapter());
    }
}
