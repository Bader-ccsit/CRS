import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class terms {

    JFrame frame = new JFrame();
    JButton btn1 = new JButton("Go Back");

    public terms(){
        frame.setBounds(0,440,400,380);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        frame.add(btn1, BorderLayout.CENTER);

    }
}
