import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
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

        

        frame = new JFrame("SignIn");
        frame.setBounds(1100,0,400,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        ImageIcon icon = new ImageIcon("src/Assets/MyFrameAssets/Icon.jfif");
        frame.setIconImage(icon.getImage());


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // JOptionPane.showMessageDialog(MessageLabel, "Signout the System to Close the window", "Notice", JOptionPane.ERROR_MESSAGE);
                MyFrame.SignIn.setEnabled(true);
            }
        });



        
        // JPanel p1 = new JPanel();
        JPanel mainTop = new JPanel();
        JPanel mainCenter = new JPanel();
        JPanel mainBottom = new JPanel();




        mainTop.setLayout(new FlowLayout(1,0,5));
        mainTop.setBackground(new Color(255,238,153));
        JLabel mainText = new JLabel("Login To Our System :)");
        mainText.setFont(new Font("monospaced", Font.PLAIN, 15));
        mainTop.add(mainText);


        JLabel tom = new JLabel();
        ImageIcon tomPhoto = new ImageIcon(new ImageIcon("src/Assets/LoginAssets/tom.png").getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH));
        tom.setIcon(tomPhoto);
        tom.setBounds(170, 20, 70, 70);
        tom.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));


        mainCenter.setBorder(BorderFactory.createLineBorder(new Color(0,128,255), 4, true));
        mainCenter.setLayout(null);
        mainCenter.setBackground(new Color(230,238,255));




        userIDLabel.setFont(new Font("monospaced", Font.ITALIC, 13));
        userPasswordLabel.setFont(new Font("monospaced", Font.ITALIC, 13));


        loginButton.setBackground(new Color(230,255,238));
        loginButton.setFont(new Font("monospaced", Font.PLAIN, 12));
        loginButton.setFocusPainted(false);
        loginButton.setBorderPainted(true);
        loginButton.setFocusable(false);



        resetButton.setBackground(new Color(230,255,238));
        resetButton.setFont(new Font("monospaced", Font.PLAIN, 12));
        resetButton.setFocusPainted(false);
        resetButton.setBorderPainted(true);
        resetButton.setFocusable(false);


        // p1.setLayout(null);
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


        mainCenter.add(tom);
        mainCenter.add(userIDLabel);
        mainCenter.add(userPasswordLabel);
        mainCenter.add(MessageLabel);
        mainCenter.add(userIDField);
        mainCenter.add(userPasswordField);
        mainCenter.add(loginButton);
        mainCenter.add(resetButton);



        JLabel rights = new JLabel("All Rights Reserved For CRS®");
        rights.setFont(new Font("monospaced", Font.PLAIN, 10));

        mainBottom.add(rights);
        
        // mainCenter.add(p1, BorderLayout.CENTER);

        frame.add(mainTop, BorderLayout.NORTH);
        frame.add(mainCenter,BorderLayout.CENTER);
        frame.add(mainBottom,BorderLayout.SOUTH);


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
