import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello!");
    JButton logout = new JButton("Logout");

    WelcomePage(String userID){

        welcomeLabel.setBounds(0, 0, 200, 35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 25));
        welcomeLabel.setText("Hello "+userID);
        
        frame = new JFrame();
        frame.setBounds(1100,0,400,400);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        logout.setBounds(0, 50, 30, 30);
        frame.add(logout);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(frame, "Signout the System to Close the window", "Notice", JOptionPane.ERROR_MESSAGE);
            }


        });

        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                MyFrame.SignIn.setEnabled(true);
                frame.dispose();
            }
        });

            

        
        frame.add(welcomeLabel);
    }
}
