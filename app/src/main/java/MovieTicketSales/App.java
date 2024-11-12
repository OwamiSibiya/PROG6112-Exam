package MovieTicketSales;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App extends JFrame {
    
    private JComboBox<String> movieComboBox;
    private JTextField ticketCountField;
    private JTextField ticketPriceField;
    private JTextArea reportArea;
    private MovieTickets movieTickets;
    
    public App() {
        movieTickets = new MovieTickets();
        
        // Prepare the frame
        setTitle("Movie Ticket Sales");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Components
        movieComboBox = new JComboBox<>(new String[]{"Napoleon", "Oppenheimer", "Damsel"});
        ticketCountField = new JTextField(10);
        ticketPriceField = new JTextField(10);
        reportArea = new JTextArea(8, 25);
        reportArea.setEditable(false);

        // Layout
        setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Movie:"));
        inputPanel.add(movieComboBox);
        inputPanel.add(new JLabel("Number of Tickets:"));
        inputPanel.add(ticketCountField);
        inputPanel.add(new JLabel("Ticket Price:"));
        inputPanel.add(ticketPriceField);
        inputPanel.add(new JLabel("Ticket Report:"));
        add(inputPanel, BorderLayout.NORTH);

        // Report text area
        add(new JScrollPane(reportArea), BorderLayout.CENTER);

        // Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu toolsMenu = new JMenu("Tools");
        
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        JMenuItem processMenuItem = new JMenuItem("Process");
        JMenuItem clearMenuItem = new JMenuItem("Clear");
        
        exitMenuItem.addActionListener(e -> System.exit(0));
        processMenuItem.addActionListener(new ProcessAction());
        clearMenuItem.addActionListener(e -> clearFields());

        fileMenu.add(exitMenuItem);
        toolsMenu.add(processMenuItem);
        toolsMenu.add(clearMenuItem);
        
        menuBar.add(fileMenu);
        menuBar.add(toolsMenu);
        setJMenuBar(menuBar);
    }

    private void clearFields() {
        movieComboBox.setSelectedIndex(0);
        ticketCountField.setText("");
        ticketPriceField.setText("");
        reportArea.setText("");
    }

    private class ProcessAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String movieName = (String) movieComboBox.getSelectedItem();
            int numberOfTickets;
            double ticketPrice;
            
            try {
                numberOfTickets = Integer.parseInt(ticketCountField.getText());
                ticketPrice = Double.parseDouble(ticketPriceField.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(App.this, "Please enter valid numbers for tickets and price.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!movieTickets.ValidateData(movieName, numberOfTickets, ticketPrice)) {
                JOptionPane.showMessageDialog(App.this, "Invalid data. Please check your inputs.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double totalTicketPrice = movieTickets.CalculateTotalTicketPrice(numberOfTickets, ticketPrice);
            String report = String.format("MOVIE NAME: %s\nMOVIE TICKET PRICE: R %.2f\nNUMBER OF TICKETS: %d\nTOTAL TICKET PRICE: R %.2f",
                                          movieName, ticketPrice, numberOfTickets, totalTicketPrice);
            reportArea.setText(report);
            saveReportToFile(report);
        }
    }

    private void saveReportToFile(String report) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("report.txt"))) {
            writer.write(report);
            writer.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving report to file.", "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new App().setVisible(true);
        });
    }
}

// References:
// Oracle. (n.d.). Creating a GUI With Swing [online]. Available at: https://docs.oracle.com/javase/tutorial/uiswing/start/index.html [Accessed 12 Nov. 2024].
// GeeksforGeeks. (2020). How to create ComboBox in Java [online]. Available at: https://www.geeksforgeeks.org/how-to-create-combobox-in-java/ [Accessed 12 Nov. 2024].
// ZetCode. (2019). Java Swing BorderLayout [online]. Available at: https://zetcode.com/javaswing/borderlayout/ [Accessed 12 Nov. 2024].
// Oracle. (n.d.). How to Use Menus [online]. Available at: https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html [Accessed 12 Nov. 2024].
// Stack Overflow. (2010). How to add action listener to JButton in java? [online]. Available at: https://stackoverflow.com/questions/2098887/how-to-add-action-listener-to-jbutton-in-java [Accessed 12 Nov. 2024].
// Oracle. (n.d.). How to Make Dialogs [online]. Available at: https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html [Accessed 12 Nov. 2024].
// Java2s. (2010). Java VAT Calculation [online]. Available at: https://www.java2s.com/Code/Java/Finance/CalculatingVAT.htm [Accessed 12 Nov. 2024].
// Baeldung. (2020). Writing to a File in Java [online]. Available at: https://www.baeldung.com/java-write-to-file [Accessed 12 Nov. 2024].

