import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {

        initUI();
    }
    private void initUI() {
        MyPanel panel=new MyPanel();
        add(new MyPanel());

        setTitle("Pacman");

        setSize(380, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        System.out.println("world------------");
    }

    public static void main(String[] args) {
        System.out.println("hello-----------------------");
        EventQueue.invokeLater(() -> {

            var ex = new Main();
            ex.setVisible(true);
        });
    }
}