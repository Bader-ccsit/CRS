import java.awt.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.*;

import javax.swing.JButton;

import javax.swing.JFrame;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.DateChooserPanel;

public class AboutUs {

JFrame frame = new JFrame();
JButton btn1 = new JButton();
private com.toedter.calendar.JDateChooser jDateChooser1;
    public AboutUs(){
        
        frame.setBounds(400,0,700,300);
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        frame.add(btn1, BorderLayout.CENTER);


        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        frame.add(jDateChooser1);
            }
}
