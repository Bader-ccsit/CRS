import javax.swing.*;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;

import javax.swing.border.LineBorder;
import javax.xml.stream.events.Comment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class SignupPage extends JFrame implements ActionListener{

    JFrame frame;
    
    
    
    

    

    JLabel NameLabel = new JLabel("Name:");
    JTextField NameField = new JTextField(15);

    JLabel NationalityLabel = new JLabel("Nationality:");
    JTextField NationalityField = new JTextField(15);

    JLabel PersonalIDLabel = new JLabel("Passport No. / National ID:");
    JTextField PersonalIDField = new JTextField(15);

    JLabel AgeLabel = new JLabel("Age:");
    JTextField AgeField = new JTextField(15);

    JLabel CarLabel = new JLabel("Select a Car");
    JComboBox CarField = new JComboBox<>();

    JLabel dateB = new JLabel("Starting Date:");
    private com.toedter.calendar.JDateChooser jDateChooser1 = new com.toedter.calendar.JDateChooser();
    
    JLabel dateE = new JLabel("Ending Date:");
    private com.toedter.calendar.JDateChooser jDateChooser2 = new com.toedter.calendar.JDateChooser();

    JLabel txtLabel = new JLabel("Comments (Optional)");
    JTextArea txt = new JTextArea(3, 20);
    
    

    JButton submit = new JButton("Submit");
    JButton reset = new JButton("Reset");

    
    


    public SignupPage(HashMap<String,String> loginInfoOriginal){
        

    
        frame = new JFrame("SignUp");
        frame.setBounds(0,0,400,435);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        ImageIcon icon = new ImageIcon("src/Assets/MyFrameAssets/Icon.jfif");
        frame.setIconImage(icon.getImage());
        

        JLabel mainText = new JLabel("Buy Your Car NOW!");
        mainText.setFont(new Font("monospaced", Font.PLAIN, 15));
        
        JPanel mainTop = new JPanel();
        JPanel mainCenter = new JPanel();
        JPanel mainBottom = new JPanel();

        

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel();
        JPanel p7 = new JPanel();
        JPanel p8 = new JPanel();
        JPanel p9 = new JPanel();
        JPanel p10 = new JPanel();
        JPanel p11 = new JPanel();
        JPanel p12 = new JPanel();
        JPanel p13 = new JPanel();
        JPanel p14 = new JPanel();
        JPanel p15 = new JPanel();
        JPanel btns = new JPanel();
        
        
        mainTop.setLayout(new FlowLayout(1,0,5));
        mainCenter.setLayout(new BorderLayout(40,40));
        mainBottom.setLayout(new FlowLayout(1,0,5));


        p1.setLayout(new BorderLayout(0,10));
        p2.setLayout(new BorderLayout(0,10));
        p3.setLayout(new BorderLayout(0,10));
        p4.setLayout(new BorderLayout(0,10));
        p5.setLayout(new BorderLayout(0,10));
        p6.setLayout(new BorderLayout(0,10));
        p7.setLayout(new BorderLayout(0,10));
        p8.setLayout(new BorderLayout(0,10));
        p9.setLayout(new BorderLayout(0,10));
        p10.setLayout(new BorderLayout(0,10));
        p11.setLayout(new BorderLayout(0,10));
        p12.setLayout(new BorderLayout(0,10));
        p13.setLayout(new BorderLayout(0,10));
        p14.setLayout(new BorderLayout(0,10));
        p15.setLayout(new BorderLayout(0,10));
        btns.setLayout(new FlowLayout());

        mainCenter.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
        p10.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2, true));
        p7.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2, true));
        p4.setBorder(BorderFactory.createLineBorder(Color.magenta, 2, true));
        


        mainTop.setBackground(new Color(255,238,153));
        frame.getContentPane().setBackground(new Color(230,247,255));
        mainCenter.setBackground(getForeground());
        p1.setBackground(getForeground());
        p2.setBackground(getForeground());
        p3.setBackground(getForeground());
        p4.setBackground(getForeground());
        p5.setBackground(getForeground());
        p6.setBackground(getForeground());
        p7.setBackground(getForeground());
        p8.setBackground(getForeground());
        p9.setBackground(getForeground());
        p10.setBackground(getForeground());
        p11.setBackground(getForeground());
        p12.setBackground(getForeground());
        p13.setBackground(getForeground());
        p14.setBackground(getForeground());
        p15.setBackground(getForeground());
        btns.setBackground(getForeground());
        

        

        mainTop.add(mainText);

        p13.add(NameLabel, BorderLayout.WEST);
        p13.add(NameField, BorderLayout.EAST);

        

        p15.add(NationalityLabel, BorderLayout.WEST);
        p15.add(NationalityField, BorderLayout.EAST);

        p14.add(AgeLabel, BorderLayout.WEST);
        p14.add(AgeField, BorderLayout.EAST);

        p11.add(PersonalIDLabel, BorderLayout.WEST);
        p11.add(PersonalIDField, BorderLayout.EAST);

        

        p12.add(CarLabel, BorderLayout.WEST);
        p12.add(CarField, BorderLayout.EAST);

        jDateChooser1.setLayout(new FlowLayout());
        JTextFieldDateEditor jDateChooser1editor = (JTextFieldDateEditor) jDateChooser1.getDateEditor();
        jDateChooser1editor.setEditable(false);
        

        p8.add(dateB, BorderLayout.WEST);
        p8.add(jDateChooser1, BorderLayout.EAST);

        jDateChooser2.setLayout(new FlowLayout());
        JTextFieldDateEditor jDateChooser2editor = (JTextFieldDateEditor) jDateChooser2.getDateEditor();
        jDateChooser2editor.setEditable(false);
        

        p9.add(dateE, BorderLayout.WEST);
        p9.add(jDateChooser2, BorderLayout.EAST);



        
        txt.setLineWrap(true);
        txt.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        p5.add(txtLabel, BorderLayout.WEST);
        p5.add(new JScrollPane(txt), BorderLayout.EAST);



        
        

        submit.setBackground(new Color(230,255,238));
        submit.setFont(new Font("monospaced", Font.PLAIN, 12));
        submit.setFocusPainted(false);
        // submit.setBorderPainted(false);
        submit.setFocusable(false);

        reset.setBackground(new Color(230,255,238));
        reset.setFont(new Font("monospaced", Font.PLAIN, 12));
        reset.setFocusPainted(false);
        // reset.setBorderPainted(false);
        reset.setFocusable(false);

        submit.setLayout(new FlowLayout());
        reset.setLayout(new FlowLayout());

        submit.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
        reset.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
        btns.add(submit, BorderLayout.WEST);
        btns.add(reset, BorderLayout.EAST);
        p6.add(btns, BorderLayout.CENTER);


        submit.addActionListener(this);
        reset.addActionListener(this);


        p10.add(p13,BorderLayout.NORTH);
        p10.add(p14, BorderLayout.CENTER);
        p10.add(p15, BorderLayout.SOUTH);

        p7.add(p10, BorderLayout.NORTH);
        p7.add(p11, BorderLayout.CENTER);
        p7.add(p12, BorderLayout.SOUTH);

        

        p4.add(p7, BorderLayout.NORTH);
        p4.add(p8, BorderLayout.CENTER);
        p4.add(p9, BorderLayout.SOUTH);



        p1.add(p4,BorderLayout.NORTH);
        p1.add(p5,BorderLayout.CENTER);
        p1.add(p6,BorderLayout.SOUTH);

        

        mainCenter.add(p1, BorderLayout.NORTH);
        mainCenter.add(p2, BorderLayout.CENTER);
        mainCenter.add(p3, BorderLayout.SOUTH);
        

        JLabel rights = new JLabel("All Rights Reserved For CRS®");
        rights.setFont(new Font("monospaced", Font.PLAIN, 10));
        mainBottom.add(rights);

        


        frame.add(mainTop, BorderLayout.NORTH);
        frame.add(mainCenter, BorderLayout.CENTER);
        frame.add(mainBottom, BorderLayout.SOUTH);
        
        


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == reset){
            NameField.setText("");
            AgeField.setText("");
            NationalityField.setText("");
            PersonalIDField.setText("");
            CarField.setSelectedItem(Integer.valueOf(0));
            jDateChooser1.setDate(null);
            jDateChooser2.setDate(null);
            txt.setText("");
        }

        if(e.getSource() == submit){
            int flag = 0;
            if(NameField.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "The Name Field is Empty!", getTitle(), JOptionPane.ERROR_MESSAGE);
                flag=1;
            }

            if(AgeField.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "The Age Field is Empty!", getTitle(), JOptionPane.ERROR_MESSAGE);
                flag=1;
            }

            if(NationalityField.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "The Nationality Field is Empty!", getTitle(), JOptionPane.ERROR_MESSAGE);
                flag=1;
            }

            if(PersonalIDField.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "The Passport No. / National ID: Field is Empty!", getTitle(), JOptionPane.ERROR_MESSAGE);
                flag=1;
            }

            // if(CarField.getSelectedItem().equals(Integer.valueOf(0))){
            //     JOptionPane.showMessageDialog(rootPane, "Choose a CAR please!", getTitle(), JOptionPane.ERROR_MESSAGE);
            // }

            if(jDateChooser1.getDate() == null){
                JOptionPane.showMessageDialog(rootPane, "The Begining Date Field is Empty!", getTitle(), JOptionPane.ERROR_MESSAGE);
                flag=1;
            }

            if(jDateChooser2.getDate() == null){
                JOptionPane.showMessageDialog(rootPane, "The Ending Date Field is Empty!", getTitle(), JOptionPane.ERROR_MESSAGE);
                flag=1;
            }

            if(flag == 0){
                JOptionPane.showMessageDialog(rootPane, "Your All Set", getTitle(), JOptionPane.INFORMATION_MESSAGE);
            }else{
                flag = 0;
            }
        }
    
    }
}
