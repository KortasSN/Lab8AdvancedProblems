package com.Josh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Created by ec0662sr on 4/7/2016.
 */
public class TicketManagerGUI extends JFrame {
    private JPanel rootPanel;
    private JTextField addDescription;
    private JList<String> ticketList;
    private JTextField addWhoReportedTicket;
    private JButton submitTicketButton;
    private JComboBox setPriority;

    private final String priority1 = "Priority 1 - Least Severe";
    private final String priority2 = "Priority 2";
    private final String priority3 = "Priority 3";
    private final String priority4 = "Priority 4";
    private final String priority5 = "Priority 5 - Most Severe";




    public TicketManagerGUI() {
        super("Ticket Manager");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setPreferredSize(new Dimension(500,200));
        configurePriority();
//String priority = (String)setPriority.getSelectedItem();


//DefaultListModel<String> ticketList



        submitTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ticketInfo = addDescription.getText();
                String reported = addWhoReportedTicket.getText();
                String priority = (String)setPriority.getSelectedItem();

String result = reported + " reported " + ticketInfo + " with level " + priority + ".";
                System.out.println("This prints the result " + result);
            }
        });
    }



    private void configurePriority() {
        setPriority.addItem(priority1);
        setPriority.addItem(priority2);
        setPriority.addItem(priority3);
        setPriority.addItem(priority4);
        setPriority.addItem(priority5);
    }
}