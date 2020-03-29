import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;

    public Window() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("BotonPulsado");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Window");
        frame.setContentPane(new Window().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
