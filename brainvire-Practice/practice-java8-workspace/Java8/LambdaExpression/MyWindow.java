package Java8.LambdaExpression;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {

    public static void main(String[] args) {
        JFrame frame = new JFrame("my Window");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());
        JButton button = new JButton("Click here..!");
        frame.add(button);
        // button.addActionListener(new ActionListener() {

        // @Override
        // public void actionPerformed(ActionEvent arg0) {
        // // TODO Auto-generated method stub
        // System.out.println("Button clicked");
        // JOptionPane.showMessageDialog(null, "Button Clicked");

        // throw new UnsupportedOperationException("Unimplemented method
        // 'actionPerformed'");
        // }

        // });
        button.addActionListener(event -> {
            JOptionPane.showMessageDialog(null, "Button Clicked");
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
