import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello!");
    JButton logout = new JButton("Logout");
    JButton DisplayData = new JButton("Show Data");
    JTable table = new JTable();




    WelcomePage(String userID){

        
        frame = new JFrame("Administrator Page");
        frame.setBounds(1100,0,400,400);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        ImageIcon icon = new ImageIcon("src/Assets/MyFrameAssets/Icon.jfif");
        frame.setIconImage(icon.getImage());



        JPanel mainTop = new JPanel();
        JPanel mainCenter = new JPanel();
        JPanel mainBottom = new JPanel();


        mainTop.setLayout(new FlowLayout(1,0,5));
        mainTop.setBackground(new Color(255,238,153));
        JLabel mainText = new JLabel("Dashboard");
        mainText.setFont(new Font("monospaced", Font.PLAIN, 15));
        mainTop.add(mainText);

        
        // table.setModel(new javax.swing.table.DefaultTableModel());



        mainCenter.setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());

        // table.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        table.setFont(new Font("calibri", Font.PLAIN, 15));
        table.setAlignmentX(JTable.CENTER_ALIGNMENT);
        
        // Create a JScrollPane to enable scrolling of the table
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setViewportView(table);
        scrollPane.setSize(400, 400);

        
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 25));
        welcomeLabel.setText("Hello "+userID);
        
        

        logout.setBackground(new Color(230,255,238));
        logout.setFont(new Font("monospaced", Font.PLAIN, 11));
        logout.setFocusPainted(false);
        
        logout.setFocusable(false);


        DisplayData.setBackground(new Color(230,255,238));
        DisplayData.setFont(new Font("monospaced", Font.PLAIN, 11));
        DisplayData.setFocusPainted(false);
        
        DisplayData.setFocusable(false);
        
        


        
        p1.add(welcomeLabel);
        p1.add(logout);
        p1.add(DisplayData);
        mainCenter.add(p1,BorderLayout.NORTH);
        mainCenter.add(scrollPane, BorderLayout.CENTER);
        mainCenter.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        p1.setBackground(new Color(230,238,255));
        mainBottom.setBackground(new Color(230,238,255));
        

        
        
        
        
        
        
        JLabel rights = new JLabel("All Rights Reserved For CRS®");
        rights.setFont(new Font("monospaced", Font.PLAIN, 10));

        mainBottom.add(rights);
        
        
        
        
        
        
        
        
        
        
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(frame, "Log off the System to Close the window", "Notice", JOptionPane.ERROR_MESSAGE);
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

            
        DisplayData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                final String DB_URL = "jdbc:mysql://localhost/crs?serverTimezone=UTC";
                final String USERNAME = "root";
                final String PASSWORD = "";

                try{
                    JOptionPane.showMessageDialog(null,"connected successfully");
                    frame.setBounds(1030, 0, 500, 500);
                    Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                    Statement stmt = conn.createStatement();
                    String query = "SELECT * FROM user";
                    ResultSet rs =stmt.executeQuery(query);
                    java.sql.ResultSetMetaData rsmd = rs.getMetaData();
                    DefaultTableModel model = (DefaultTableModel) table.getModel();

                    int cols = rsmd.getColumnCount();
                    String[] colName=new String[cols];
                    for(int i=0;i<cols;i++)
                        colName[i] = rsmd.getColumnName(i+1);
                        
                    model.setColumnIdentifiers(colName);
                    String id, name, email,nationality, personalid, car, datestart, dateend, comments;
                    
                    while(rs.next()){
                        id = rs.getString(1);               //supposed to be INT
                        name = rs.getString(2);
                        email = rs.getString(3);
                        nationality = rs.getString(4);
                        personalid = rs.getString(5);
                        car = rs.getString(6);
                        datestart = rs.getString(7);
                        dateend = rs.getString(8);
                        comments = rs.getString(9);
                        String[] row = {id,name,email,nationality,personalid,car,datestart,dateend,comments};
                        model.addRow(row);
                    }
                    stmt.close();
                    conn.close();

                }catch(Exception ActionEvent){
                    System.out.println("DataBase Connection Failed :( ");
                }
            }
        });
        
        frame.add(mainTop, BorderLayout.NORTH);
        frame.add(mainCenter, BorderLayout.CENTER);
        frame.add(mainBottom, BorderLayout.SOUTH);


    }
}
