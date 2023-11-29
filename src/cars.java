import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class cars extends JFrame implements MouseListener{


    JPanel p2;
    JLabel l2;   //ADDED LABELS AND PANNELS


    // The data to display in the JList
    public static String[] data = {"Toyota Corolla (2023)", "Toyota Camery (2021)", "Kia Cadenza (2020)", "Nissan VTC (2022)", "Ford Mustang (2023)", "Hyundai Accent (2022)", "Hyundai Elantra (2023)", "GMC Yukon (2023)", "GMC Sierra 1500 (2022)"};

    // The components of the GUI
    private JTextField searchField;
    private DefaultListModel<String> listModel;
    private JList<String> list;
    private JScrollPane scrollPane;

    public cars() {
        // Initialize the components
        searchField = new JTextField(20);
        searchField.setPreferredSize(new Dimension(100, 25));
        searchField.setBorder(BorderFactory.createLineBorder(Color.red));
        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        scrollPane = new JScrollPane(list);


        list.setFont(new Font("Calibri", Font.PLAIN, 25));    //change the text of the list


        // Add the data to the list model
        for (String s : data) {
            listModel.addElement(s);
        }

        // Add a document listener to the text field
        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateList();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateList();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateList();
            }
        });

        // Set some properties of the list
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        list.setVisibleRowCount(10);


        list.addMouseListener(this);
        


        p2 = new JPanel();
        p2.setPreferredSize(new Dimension(130, 100));
        p2.setForeground(Color.BLACK);
        p2.setBorder(BorderFactory.createLineBorder(Color.RED));
        
        l2 = new JLabel();
        l2.setText("<html>Select a Car<br> To Preview<html>");            //SETTING THE DEFAULT TEXT FOR PREVIEW
        p2.add(l2);
        // Create a panel to hold the search field
        

        JPanel panel = new JPanel();
        JLabel l1 = new JLabel("Search:");
        l1.setFont(new Font("monospaced", Font.ITALIC, 17));
        ImageIcon searchIcon = new ImageIcon(new ImageIcon("src/Assets/CarsAssets/search.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        l1.setIcon(searchIcon);
        panel.add(l1);
        panel.add(searchField);

        // Add the panel and the scroll pane to the frame
        add(panel, BorderLayout.NORTH);

        add(p2, BorderLayout.AFTER_LINE_ENDS);


        add(scrollPane, BorderLayout.CENTER);

        // Set the frame properties
        setTitle("Search For a Car");
        setBounds(1100,420,400,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon icon = new ImageIcon("src/Assets/MyFrameAssets/Icon.jfif");
        setIconImage(icon.getImage());
        setVisible(true);
    }

    // A method to update the list based on the search query
    private void updateList() {
        try {
            // Get the text from the text field
            String text = searchField.getText();

            // Clear the list model
            listModel.clear();

            // If the text is not empty, filter the data and add the matching items to the list model
            if (!text.isEmpty()) {
                for (String s : data) {
                    if (s.toLowerCase().contains(text.toLowerCase())) {
                        listModel.addElement(s);
                    }
                }
            }
            // Otherwise, add all the data to the list model
            else {
                for (String s : data) {
                    listModel.addElement(s);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        Point p = e.getPoint ();
        // Get the index of the cell at that point
        int index = list.locationToIndex (p);
        // Get the item at that index
        Object item = listModel.getElementAt (index);
        // Do something with the item
        
            if(item == "Toyota Corolla (2023)"){
            
            ImageIcon corolla = new ImageIcon(new ImageIcon("src/Assets/CarsAssets/corolla.jfif").getImage().getScaledInstance(95, 100, Image.SCALE_SMOOTH));
            l2.setText("<html>Toyota Corolla <br>(2023)<br><br>•Economy Car <br><br>• 5 seater <br><br> •Price: 200$</html>");
            l2.setHorizontalTextPosition(JLabel.CENTER);
            l2.setVerticalTextPosition(JLabel.BOTTOM);
            l2.setIcon(corolla);
        }
        
        if(item == "Toyota Camery (2021)"){
            ImageIcon Camery = new ImageIcon(new ImageIcon("src/Assets/CarsAssets/camery.jpg").getImage().getScaledInstance(95, 100, Image.SCALE_SMOOTH));
            l2.setText("<html>Toyota Camery <br>(2021)<br><br>•Economy Car <br><br>• 5 seater <br><br> •Price: 300$</html>");
            l2.setHorizontalTextPosition(JLabel.CENTER);
            l2.setVerticalTextPosition(JLabel.BOTTOM);
            l2.setIcon(Camery);
        }

        if(item == "Kia Cadenza (2020)"){
            ImageIcon Cadenza = new ImageIcon(new ImageIcon("src/Assets/CarsAssets/cadenza.jpg").getImage().getScaledInstance(95, 100, Image.SCALE_SMOOTH));
            l2.setText("<html>Kia Cadenza <br>(2020)<br><br>•Luxury Car <br><br>• 5 seater <br><br> •Price: 400$</html>");
            l2.setHorizontalTextPosition(JLabel.CENTER);
            l2.setVerticalTextPosition(JLabel.BOTTOM);
            l2.setIcon(Cadenza);
        }

        if(item == "Nissan VTC (2022)"){
            ImageIcon VTC = new ImageIcon(new ImageIcon("src/Assets/CarsAssets/vtc.jpeg").getImage().getScaledInstance(95, 100, Image.SCALE_SMOOTH));
            l2.setText("<html>Nissan VTC <br>(2022)<br><br>•Off-Road Car <br><br>• 4 seater <br><br> •Price: 350$</html>");
            l2.setHorizontalTextPosition(JLabel.CENTER);
            l2.setVerticalTextPosition(JLabel.BOTTOM);
            l2.setIcon(VTC);
        }

        if(item == "Ford Mustang (2023)"){
            ImageIcon Mustang = new ImageIcon(new ImageIcon("src/Assets/CarsAssets/mustang.png").getImage().getScaledInstance(95, 100, Image.SCALE_SMOOTH));
            l2.setText("<html>Ford Mustang <br>(2023) <br><br>•Sports Car <br><br>• 2 seater <br><br> •Price: 500$</html>");
            l2.setHorizontalTextPosition(JLabel.CENTER);
            l2.setVerticalTextPosition(JLabel.BOTTOM);
            l2.setIcon(Mustang);
        }

        if(item == "Hyundai Accent (2022)"){
            ImageIcon Accent = new ImageIcon(new ImageIcon("src/Assets/CarsAssets/accent.jpg").getImage().getScaledInstance(95, 100, Image.SCALE_SMOOTH));
            l2.setText("<html>Hyundai Accent <br>(2022) <br><br>•Economy Car <br> <br>• 5 seater <br><br> •Price: 150$</html>");
            l2.setHorizontalTextPosition(JLabel.CENTER);
            l2.setVerticalTextPosition(JLabel.BOTTOM);
            l2.setIcon(Accent);
        }

        if(item == "Hyundai Elantra (2023)"){
            ImageIcon Elantra = new ImageIcon(new ImageIcon("src/Assets/CarsAssets/elentra.jpg").getImage().getScaledInstance(95, 100, Image.SCALE_SMOOTH));
            l2.setText("<html>Hyundai Elantra <br>(2023) <br><br>•Economy Car <br><br>• 5 seater <br><br> •Price: 200$</html>");
            l2.setHorizontalTextPosition(JLabel.CENTER);
            l2.setVerticalTextPosition(JLabel.BOTTOM);
            l2.setIcon(Elantra);
        }

        if(item == "GMC Yukon (2023)"){
            ImageIcon Yukon = new ImageIcon(new ImageIcon("src/Assets/CarsAssets/yukon.jpg").getImage().getScaledInstance(95, 100, Image.SCALE_SMOOTH));
            l2.setText("<html>GMC Yukon <br>(2023)<br><br>•SUV Car <br> <br>• 9 seater <br><br> •Price: 500$</html>");
            l2.setHorizontalTextPosition(JLabel.CENTER);
            l2.setVerticalTextPosition(JLabel.BOTTOM);
            l2.setIcon(Yukon);
        }
        
        if(item == "GMC Sierra 1500 (2022)"){
            ImageIcon Sierra = new ImageIcon(new ImageIcon("src/Assets/CarsAssets/sierra.jpg").getImage().getScaledInstance(95, 100, Image.SCALE_SMOOTH));
            l2.setText("<html>GMC Sierra 1500 <br>(2022)<br><br>•Off-Road Car <br><br>• 5 seater <br><br> •Price: 450$</html>");
            l2.setHorizontalTextPosition(JLabel.CENTER);
            l2.setVerticalTextPosition(JLabel.BOTTOM);
            l2.setIcon(Sierra);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
        l2.setIcon(null);
        l2.setText("<html>Select a Car<br> To Preview<html>");
    }
}