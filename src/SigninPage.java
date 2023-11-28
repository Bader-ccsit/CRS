import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class SigninPage implements ActionListener{
    JFrame frame;
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel MessageLabel = new JLabel("This is a TEST");


    HashMap<String,String> logininfo = new HashMap<String,String>();
    public SigninPage(HashMap<String,String> loginInfoOriginal){
        
        logininfo = loginInfoOriginal;

        

        frame = new JFrame();
        frame.setBounds(1100,0,400,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // JOptionPane.showMessageDialog(MessageLabel, "Signout the System to Close the window", "Notice", JOptionPane.ERROR_MESSAGE);
                MyFrame.SignIn.setEnabled(true);
            }
        });



        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        userIDLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        MessageLabel.setBounds(125, 250, 250, 35);
        MessageLabel.setFont(new Font(null, Font.ITALIC, 15));

        userIDField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        p1.add(userIDLabel);
        p1.add(userPasswordLabel);
        p1.add(MessageLabel);
        p1.add(userIDField);
        p1.add(userPasswordField);
        p1.add(loginButton);
        p1.add(resetButton);
        
        frame.add(p1,BorderLayout.CENTER);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int loggedin=0;
        if(e.getSource() == resetButton){
            userIDField.setText("");
            userPasswordField.setText("");
        }

        if(e.getSource() == loginButton){

            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if(logininfo.containsKey(userID)){
                if(logininfo.get(userID).equals(password)){
                    MessageLabel.setForeground(Color.green);
                    MessageLabel.setText("Login Successful");
                    frame.dispose();
                    WelcomePage welcomepage = new WelcomePage(userID);

                    loggedin=1;     //change the value for the signin
                }
                else{
                    MessageLabel.setForeground(Color.red);
                    MessageLabel.setText("Wrong Password");
                }
            }

            else{
                MessageLabel.setForeground(Color.red);
                    MessageLabel.setText("Username NOT Found!");
            }

            if(loggedin==1){
                MyFrame.SignIn.setEnabled(false);

                
            }
        }
    }
}
