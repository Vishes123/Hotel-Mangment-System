package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Manager extends JFrame {
    Manager(){
        JPanel panel = new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        panel.setBounds(5,5,1200,590);
        add(panel);

        JLabel l1 = new JLabel("NAME");
        l1.setBounds(40,30,80,14);
        l1.setForeground(Color.white);
        l1.setFont(new Font("Tahoma",Font.BOLD,13));
        panel.add(l1);


        JLabel l2 = new JLabel("AGE");
        l2.setBounds(210,30,80,14);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Tahoma",Font.BOLD,13));
        panel.add(l2);


        JLabel l3 = new JLabel("GENDER");
        l3.setBounds(350,30,80,14);
        l3.setForeground(Color.white);
        l3.setFont(new Font("Tahoma",Font.BOLD,13));
        panel.add(l3);


        JLabel l4 = new JLabel("JOB");
        l4.setBounds(520,30,80,14);
        l4.setForeground(Color.white);
        l4.setFont(new Font("Tahoma",Font.BOLD,13));
        panel.add(l4);


        JLabel l5 = new JLabel("SALARY");
        l5.setBounds(650,30,80,14);
        l5.setForeground(Color.white);
        l5.setFont(new Font("Tahoma",Font.BOLD,13));
        panel.add(l5);

        JLabel l6 = new JLabel("PHONE");
        l6.setBounds(820,30,80,14);
        l6.setForeground(Color.white);
        l6.setFont(new Font("Tahoma",Font.BOLD,13));
        panel.add(l6);

        JLabel l7 = new JLabel("AADHAR-NO");
        l7.setBounds(930,30,80,14);
        l7.setForeground(Color.white);
        l7.setFont(new Font("Tahoma",Font.BOLD,13));
        panel.add(l7);

        JLabel l8 = new JLabel("GMAIL");
        l8.setBounds(1090,30,80,14);
        l8.setForeground(Color.white);
        l8.setFont(new Font("Tahoma",Font.BOLD,13));
        panel.add(l8);


        JTable table = new JTable();
        table.setBounds(10,40,1190,450);
        table.setForeground(Color.white);
        table.setLayout(null);
        table.setBackground(new Color(3,45,48));
        table.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(table);

        JButton back = new JButton("BACK");
        back.setBackground(Color.black);
        back.setBounds(510,500,100,30);
        back.setForeground(Color.white);
        back.setFont(new Font("Tahoma",Font.BOLD,13));
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==back){
                    new Reception();
                    setVisible(false);
                }
            }
        });


        try {
            Con_database c= new Con_database();
            String q = "select * from employee where job = 'Manager'";
            ResultSet resultSet = c. statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));


        }catch ( Exception e){
           e.printStackTrace();
        }

        setLocation(100,80);
        setSize(1190,800);
        setUndecorated(true);
        setLayout(null);
        setVisible(true);



    }
    public static void main(String[] args) {
        new Manager();

    }
}
