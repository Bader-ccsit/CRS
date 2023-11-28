import java.awt.*;
import javax.swing.*;



public class AboutUs {

JFrame frame = new JFrame("About Us");


    public AboutUs(){
        
        frame.setBounds(400,0,700,300);
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        ImageIcon icon = new ImageIcon("src/Assets/MyFrameAssets/Icon.jfif");
        frame.setIconImage(icon.getImage());

        JPanel left = new JPanel();
        JPanel right = new JPanel();
        JPanel center = new JPanel();
        JPanel top = new JPanel();
        JPanel bottom = new JPanel();

        center.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));

        top.setBackground(new Color(255,238,153));
        top.setLayout(new FlowLayout(1,0,0));

        center.setLayout(new BorderLayout());

        JLabel head = new JLabel("About our Car Rental System®");             //adding the top label and buttons
        head.setFont(new Font("Gabriola", Font.PLAIN, 20));


        JLabel rights = new JLabel("All Rights Reserved For CRS®");
        rights.setFont(new Font("monospaced", Font.PLAIN, 10));
        

        JLabel p = new JLabel();
        ImageIcon photo = new ImageIcon(new ImageIcon("src/Assets/AboutUsAssets/aboutusphoto.gif").getImage().getScaledInstance(300, 180, Image.SCALE_DEFAULT));
        p.setIcon(photo);

        
    
        
        JTextArea textArea = new JTextArea(30,30);
        textArea.setText("Are you looking for a convenient and affordable way to travel around the city\n Do you want to avoid the hassle of public transportation or expensive taxis? If yes, then you should try Car Rental System, the best car rental service in town! Car Rental System is a web-based platform that allows you to book a car of your choice from a wide range of options. You can choose from economy, luxury, SUV, or sports cars, depending on your budget and preference. \n Join us today at Car Rental System®");
        textArea.setOpaque(false);
        textArea.setBackground(new Color(0, 0, 0));
        textArea.setLineWrap(true);
        textArea.setFont(new Font("Gabriola", Font.PLAIN, 15));
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setOpaque(false);
        
        top.add(head);

        center.add(textArea, BorderLayout.CENTER);
        left.add(p);
        
        bottom.add(rights);



        frame.add(top,BorderLayout.NORTH);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.add(center, BorderLayout.CENTER);
        frame.add(right, BorderLayout.EAST);
        frame.add(left, BorderLayout.WEST);



        
    }
}
