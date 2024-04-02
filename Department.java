package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame {
    Department(){
        JPanel panel = new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        add(panel);

        JLabel l1 = new JLabel("DEPARTMENT");
        l1.setFont(new Font("Tahoma",Font.BOLD,15));
        l1.setForeground(Color.white);
        l1.setBounds(120,25,120,17);
        panel.add(l1);

        JLabel l2 = new JLabel("BUDGET");
        l2.setFont(new Font("Tahoma",Font.BOLD,15));
        l2.setForeground(Color.white);
        l2.setBounds(480,25,120,17);
        panel.add(l2);

        JTable table = new JTable();
        table.setBounds(0,40,700,350);
        table.setForeground(Color.white);
        table.setBackground(new Color(5,45,48));
        table.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(table);

        JButton back = new JButton("BACK");
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        back.setFont(new Font("Tahoma",Font.BOLD,16));
        back.setBounds(300,410,90,30);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Reception();
                setVisible(false);
            }
        });

        try {
            Con_database c = new Con_database();
            String departmentInfo = "select * from department";
            ResultSet resultSet = c. statement.executeQuery(departmentInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception E){
            E.printStackTrace();

        }

        setSize(700,500);
        setUndecorated(true);
        setVisible(true);
        setLayout(null);
        setLocation(550,150);



    }
    public static void main(String[] args) {
        new Department();

    }
}
