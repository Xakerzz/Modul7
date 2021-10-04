import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class AnanimusFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400,300);
        jf.setVisible(true);
        jf.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println(e.getX() + " " + e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
    }
}
