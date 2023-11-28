import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class terms {

    JFrame frame = new JFrame("Terms And Conditions");
    

    public terms(){
        frame.setBounds(0,440,400,380);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        ImageIcon icon = new ImageIcon("src/Assets/MyFrameAssets/Icon.jfif");
        frame.setIconImage(icon.getImage());

        JPanel mainTop = new JPanel();
        JPanel mainCenter = new JPanel();
        JPanel mainBottom = new JPanel();
        mainTop.setLayout(new BorderLayout());
        
        mainTop.setBackground(new Color(255,238,153));
        mainCenter.setBackground(new Color(230,230,255));

        mainCenter.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));

        JLabel head = new JLabel("Check Out Our Terms And Conditions");
        JLabel check = new JLabel("Easy, Clear, and Great!");
        head.setFont(new Font("Gabriola", Font.PLAIN, 20));
        check.setFont(new Font("monospaced", Font.PLAIN, 10));
        head.setHorizontalAlignment(JLabel.CENTER);
        check.setHorizontalAlignment(JLabel.CENTER);
        head.setVerticalAlignment(JLabel.CENTER);
        check.setVerticalAlignment(JLabel.CENTER);
        mainTop.add(head, BorderLayout.NORTH);
        
        mainTop.add(check, BorderLayout.CENTER);

        
        

        JTextArea terms = new JTextArea(35, 30);
        terms.setLayout(new FlowLayout(1,0,0));
        terms.setText("Terms and Conditions for Car Rental System\n\n 1- Acceptance of Terms and Conditions\n\n By using the Car Rental System, the User agrees to be bound by these Terms and Conditions, as well as the Rental Agreement of the Car Rental Company.\n\n The User is responsible for reading and understanding these Terms and Conditions, as well as the Rental Agreement of the Car Rental Company, before booking, paying, and renting a car.\n\n The User acknowledges that the Car Rental System is only a facilitator and not a party to the Rental Agreement between the User and the Car Rental Company.\n\n The User agrees that the Car Rental System is not liable for any damages, losses, or claims arising from or related to the use of the Car Rental System or the car rental.\n\n 2.Booking and Payment \n\n The User can browse, compare, and select the car of their choice from the Car Rental System. \n\n The User can book the car by providing the required information, such as name, contact details, driver's license, payment method, etc. \n\n The User can pay for the car rental by using the payment options available on the Car Rental System, such as credit card, debit card, PayPal, etc.\n\n The User will receive a confirmation email from the Car Rental System after the booking and payment are completed. \n\n The User must present the voucher and a valid driver's license to the Car Rental Company at the time of pick-up. \n\n 3.Car Rental \n\n The User must comply with the Rental Agreement of the Car Rental Company, as well as the applicable laws and regulations of the country where the car rental takes place.\n\n The User must use the car in a responsible and careful manner, and not cause any damage, injury, or harm to the car, the Car Rental Company, or any third party.\n\n The User must return the car to the Car Rental Company in the same condition as it was received, except for normal wear and tear, at the end of the rental period, or earlier if requested by the Car Rental Company.\n\n 4.Privacy and Data Protection\n\n The Car Rental System respects the privacy and data protection rights of the Users and the Car Rental Companies.\n\n The Car Rental System collects, processes, and stores the personal data of the Users and the Car Rental Companies in accordance with the Privacy Policy of the Car Rental System, which is available on the Car Rental System website.\n\n The Car Rental System shares the personal data of the Users and the Car Rental Companies with each other and with third parties only for the purposes of facilitating the car rental, providing customer service, complying with legal obligations, or improving the Car Rental System.\n\n The Car Rental System uses cookies and other technologies to enhance the functionality and performance of the Car Rental System, as well as to provide personalized and relevant content and advertisements to the Users and the Car Rental Companies.\n\n The Users and the Car Rental Companies can access, update, correct, delete, or object to the processing of their personal data by contacting the Car Rental System.\n\n");
        
        JScrollPane sp = new JScrollPane(terms);
        sp.setVerticalScrollBarPolicy (JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        terms.setLineWrap(true);
        terms.setEditable(false);
        
        
        
                

        mainCenter.add(new JScrollPane(terms), BorderLayout.CENTER);

        JLabel rights = new JLabel("All Rights Reserved For CRS®");
        rights.setFont(new Font("monospaced", Font.PLAIN, 10));
        
        mainBottom.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        mainBottom.add(rights);

        frame.add(mainTop, BorderLayout.NORTH);
        frame.add(mainCenter, BorderLayout.CENTER);
        frame.add(mainBottom, BorderLayout.SOUTH);

    }
}
