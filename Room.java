package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame {
    JTable table;
    JButton b1;
    Room(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);


        ImageIcon imageIcon= new ImageIcon(ClassLoader.getSystemResource("roomm.png"));
        Image image =  imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon12=new ImageIcon(image);
        JLabel label = new JLabel(imageIcon12);
        label.setBounds(600,200,200,200);
        panel. add(label);

        JLabel  l1=new JLabel("AVAILABILIT");
        l1.setBounds(119,14,120,14);
        l1.setForeground(Color.white);
        l1.setFont(new Font("Tahoma", Font.BOLD,13));
        l1.setBackground(new Color(16, 108, 115));
        panel.add(l1);

        JLabel  l2=new JLabel(" ROOM STATUS");
        l2.setBounds(210,14,120,14);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Tahoma", Font.BOLD,12 ));
        l2.setBackground(new Color(16, 108, 115));
        panel.add(l2);

        JLabel l3 = new JLabel("PRICE");
        l3.setForeground(Color.white);
        l3.setBounds(334,14,120,14);
        l3.setFont(new Font("Tahoma", Font.BOLD,12));
        l3.setBackground(new Color(16, 108, 115));
        panel.add(l3);

        JLabel l4 = new JLabel(" BAD TYPE");
        l4.setForeground(Color.white);
        l4.setBounds(434,14,120,14);
        l4.setFont(new Font("Tahoma", Font.BOLD,12));
        l4.setBackground(new Color(16, 108, 115));
        panel.add(l4);

        JLabel l5 = new JLabel("ROOM NO");
        l5.setForeground(Color.white);
        l5.setBounds(15,14,120,14);
        l5.setFont(new Font("Tahoma", Font.BOLD,12));
        l5.setBackground(Color.black);
        panel.add(l5);

         JTable table = new JTable();
         table.setBounds(10,40,500,400);
         table.setBackground(new Color(3,45,48));
       // table.setBackground(new Color(16, 108, 115));
         table.setForeground(Color.white);
         table.setFont(new Font("Tahoma",Font.BOLD,12));
         panel.add(table);



         JButton b1 = new JButton("BACK");
         b1.setBackground(Color.black);
         b1.setForeground(Color.white);
         b1.setBounds(200,500,120,30);
         panel.add(b1);
         b1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if (e.getSource()==b1){
                     new Reception();
                     setVisible(false);
                 }
             }
         });




         try {
             Con_database c = new Con_database();
             String RoomInfo = "select  * from room ";
             ResultSet resultSet = c. statement.executeQuery(RoomInfo);
             table.setModel(DbUtils.resultSetToTableModel(resultSet));

         }catch (Exception E){
             E.printStackTrace();
         }




        setSize(900,600);
         setUndecorated(true);
        setLocation(400,100);
        setLayout(null);
        setVisible(true);


    }
    public static void main(String[] args) {
        new Room();

    }
}
