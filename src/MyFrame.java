
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;





public class MyFrame extends JFrame implements ActionListener, MouseListener{
    
    JButton AboutUs;
    static JButton SignUp;
    static JButton SignIn;
     
    JMenuBar menuBar;
    JMenu filemenu;
    JMenu editmenu;
    JMenu helpmenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    JLabel find_text;
    JLabel terms_text;

  

    public MyFrame(){
        JFrame frame = new JFrame("Car Rental System");                             //creating JFrame
        frame.setBounds(500, 300, 520, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        ImageIcon icon = new ImageIcon("src/Assets/MyFrameAssets/Icon.jfif");
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(new Color(124, 152, 176));

        frame.setLayout(new BorderLayout());                                             //end of creating JFrame



        JPanel p1 = new JPanel();
        p1.setBackground(new Color(255,238,153));
        p1.setLayout(new FlowLayout(1,0,0));
        

        
        JPanel p2 = new JPanel();       
        
        JLabel rights = new JLabel("All Rights Reserved For CRS®");
        rights.setFont(new Font("monospaced", Font.PLAIN, 10));
        
        // ImageIcon icon1 = new ImageIcon(new ImageIcon("Assets/MyFrameAssets/Icon.jfif").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        // rights.setIcon(icon1);
        p2.add(rights);
        
        
        JLabel head = new JLabel("Hello and welcome to our CRS");             //adding the top label and buttons
        head.setFont(new Font("Gabriola", Font.PLAIN, 20));
        
        AboutUs = new JButton("AboutUs");
        SignUp = new JButton("SignUp");
        SignIn = new JButton("Signin");                                //end of adding the top label and buttons


        AboutUs.setBackground(new Color(230,255,238));
        AboutUs.setFont(new Font("monospaced", Font.PLAIN, 12));
        AboutUs.setFocusPainted(false);
        AboutUs.setBorderPainted(false);
        AboutUs.setFocusable(false);
        

        SignUp.setBackground(new Color(230,255,238));
        SignUp.setFont(new Font("monospaced", Font.PLAIN, 12));
        SignUp.setFocusPainted(false);
        SignUp.setBorderPainted(false);
        SignUp.setFocusable(false);

        SignIn.setBackground(new Color(230,255,238));
        SignIn.setFont(new Font("monospaced", Font.PLAIN, 12));
        SignIn.setFocusPainted(false);
        SignIn.setBorderPainted(false);
        SignIn.setFocusable(false);

        AboutUs.addActionListener(this);
        SignUp.addActionListener(this);
        SignIn.addActionListener(this);


        menuBar = new JMenuBar();                     //begining of menubar
        menuBar.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));
        filemenu = new JMenu("File");
        editmenu = new JMenu("edit");
        helpmenu = new JMenu("help");

        loadItem = new JMenuItem("load");
        saveItem = new JMenuItem("save");
        exitItem = new JMenuItem("exit");


        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);


        filemenu.add(loadItem);
        filemenu.add(saveItem);
        filemenu.add(exitItem);

        menuBar.add(filemenu);
        menuBar.add(editmenu);
        menuBar.add(helpmenu);


        frame.setJMenuBar(menuBar);                       //end of menubar

        
        p1.add(head);
        // p1.add(AboutUs);
        // p1.add(SignUp);
        // p1.add(SignIn);

        
        JPanel p3 = new JPanel();
        p3.setLayout(new BorderLayout());
        LineBorder border = new LineBorder(Color.BLACK, 1, true);
        // p3.setBorder(border);
        p3.setBorder(BorderFactory.createLineBorder(Color.green, 2, true));
        p3.setBackground(getForeground());
        

        JPanel p4 = new JPanel();
        p4.setLayout(new BorderLayout());
        // p4.setBorder(border);
        p4.setBackground(getForeground());
        p4.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2, true));
        

        JLabel MainText = new JLabel("Car Rental System®");
        ImageIcon MainIcon = new ImageIcon(new ImageIcon("src/Assets/MyFrameAssets/carRentalMoving.gif").getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
        MainText.setFont(new Font("Gabriola", Font.ITALIC, 25));
        MainText.setHorizontalAlignment(JLabel.CENTER);
        MainText.setIcon(MainIcon);
        
        p4.add(MainText, BorderLayout.NORTH);
        


        JPanel p5 = new JPanel();
        p5.setLayout(new FlowLayout());
        // p5.setBorder(border);
        p5.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
        p5.setBackground(getForeground());



        JPanel p6 = new JPanel();
        p6.setLayout(new BorderLayout());
        // p4.setBorder(border);
        p6.setBackground(getForeground());
        p6.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2, true));
        
        find_text = new JLabel("Find a Car");
        ImageIcon find_icon = new ImageIcon(new ImageIcon("src/Assets/MyFrameAssets/search.gif").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        find_text.setIcon(find_icon);
        find_text.setHorizontalTextPosition(JLabel.CENTER);
        find_text.setVerticalTextPosition(JLabel.BOTTOM);
        find_text.setFont(new Font("Gabriola", Font.ITALIC, 19));
        p6.add(find_text, BorderLayout.EAST);

        terms_text = new JLabel("Terms And Conditions");
        ImageIcon terms_icon = new ImageIcon(new ImageIcon("src/Assets/MyFrameAssets/terms.gif").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        terms_text.setIcon(terms_icon);
        terms_text.setHorizontalTextPosition(JLabel.CENTER);
        terms_text.setVerticalTextPosition(JLabel.BOTTOM);
        terms_text.setFont(new Font("Gabriola", Font.ITALIC, 19));
        p6.add(terms_text, BorderLayout.WEST);



        find_text.addMouseListener(this);
        terms_text.addMouseListener(this);



        JPanel p7 = new JPanel();
        p7.setLayout(new FlowLayout());
        p7.setBackground(getForeground());
        p7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));

        JLabel speach_Title = new JLabel();
        speach_Title.setText("Why You Should Choose CRS?");
        speach_Title.setFont(new Font("Gabriola", Font.BOLD, 20));
        JLabel speach = new JLabel();
        speach.setText("<html>• Seamless experience by <br>one time form submition</html>");
        speach.setFont(new Font("Times New Roman", Font.PLAIN, 17));

        JLabel speach2 = new JLabel();
        speach2.setText("<html><br>• User Frendly Interface</html>");
        speach2.setFont(new Font("Times New Roman", Font.PLAIN, 17));

        JLabel speach3 = new JLabel();
        speach3.setText("<html> <br>• Justifiable Pricing");
        speach3.setFont(new Font("Times New Roman", Font.PLAIN, 17));

        
        
        
        p7.add(speach_Title, BorderLayout.NORTH);
        p7.add(speach);
        p7.add(speach2);
        p7.add(speach3);

        p6.add(p7, BorderLayout.CENTER);
        
        p4.add(p6,BorderLayout.CENTER);





        

        p5.add(AboutUs);
        p5.add(SignUp);
        p5.add(SignIn);

        p3.add(p5, BorderLayout.NORTH);
        p3.add(p4, BorderLayout.CENTER);
        
        
        frame.add(p1, BorderLayout.NORTH);
        frame.add(p2, BorderLayout.SOUTH);
        frame.add(p3,BorderLayout.CENTER);
        
        
        
        


    }




    


    @Override
    public void actionPerformed(ActionEvent e) {

       if(e.getSource() == loadItem){
        JOptionPane.showMessageDialog(null, "the file has been loaded successfuly", "File loaded Conformation", JOptionPane.INFORMATION_MESSAGE);
       }

       if(e.getSource() == saveItem){
        JOptionPane.showMessageDialog(null, "the file has been saved successfuly", "File saved Conformation", JOptionPane.INFORMATION_MESSAGE);
       }

       if(e.getSource() == exitItem){
        System.exit(0);
       }

       if(e.getSource() == SignUp){
        IDandPasswords idandpasswords = new IDandPasswords();
            new SignupPage(idandpasswords.getLoginInfo());

        SignUp.setEnabled(false);   //stopWorking
       }

       if(e.getSource() == AboutUs){
        new AboutUs();
       }

       if(e.getSource() == SignIn){
        IDandPasswords idandpasswords = new IDandPasswords();
        SigninPage signin = new SigninPage(idandpasswords.getLoginInfo());

        SignIn.setEnabled(false);   //stopWorking
       }




       
    }







    @Override
    public void mouseClicked(MouseEvent e) {
       if(e.getSource() == terms_text){
        new terms();
       }
       
       if(e.getSource() == find_text){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new cars();
            }
        });
       }
        
    }







    @Override
    public void mousePressed(MouseEvent e) {
        // JOptionPane.showMessageDialog(null, "Hello", "rfr", JOptionPane.ERROR_MESSAGE);
    }







    @Override
    public void mouseReleased(MouseEvent e) {
        // JOptionPane.showMessageDialog(null, "Hello", "rfr", JOptionPane.ERROR_MESSAGE);
    }







    @Override
    public void mouseEntered(MouseEvent e) {
        // JOptionPane.showMessageDialog(null, "Hello", "rfr", JOptionPane.ERROR_MESSAGE);
    }







    @Override
    public void mouseExited(MouseEvent e) {
    //    JOptionPane.showMessageDialog(null, "Hello", "rfr", JOptionPane.ERROR_MESSAGE);
    }
}
        