package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoom extends JFrame {
    JTextField t2 , t4;
    JComboBox t3,t5,t6;
    AddRoom(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,857,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel l1 = new JLabel("Add Room");
        l1.setBounds(194,10,160,22);
        l1.setFont(new Font("Tahoma",Font.BOLD,22));
        l1.setForeground(Color.white);
        panel.add(l1);

        JLabel l2 = new JLabel("Room Number");
        l2.setBounds(64,70,152,22);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        l2.setForeground(Color.white);
        panel.add(l2);
        t2 = new JTextField();
        t2.setBounds(200,70,156,20);
        t2.setFont(new Font("Tahoma",Font.PLAIN,22));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(16,108,115));
        panel.add(t2);

        JLabel l3 = new JLabel("Availability");
        l3.setBounds(64,110,152,22);
        l3.setForeground(Color.white);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(l3);
        t3 = new JComboBox(new String[] {"Available", "Occupied"});
        t3.setBounds(200,110,156,20);
        t3.setForeground(Color.white);
       // t3.setFont(new Font("Tahoma",Font.PLAIN,20));
        t3.setBackground(new Color(16,108,115));
        panel.add(t3);

       JLabel l4 = new JLabel("Price");
       l4.setBounds(64,150,152,22);
       l4.setForeground(Color.white);
       l4.setFont(new Font("Tahoma", Font.BOLD,14));
       panel.add(l4);
       t4 = new JTextField();
       t4.setBounds(200 ,150,156,20);
       t4.setForeground(Color.white);
       t4.setBackground(new Color(16,108,115));
       panel.add(t4);

       JLabel l5 = new JLabel("Cleaning Status");
       l5.setBounds(64,190,152,22);
       l5.setForeground(Color.white);
       l5.setFont(new Font("Tahoma",Font.BOLD,14));
       panel.add(l5);
       t5 =new JComboBox(new String[]{"Cleaned" , "Dirty"});
       t5.setBounds(200,190,152,22);
       t5.setForeground(Color.white);
       t5.setBackground(new Color(16,108,115));
       panel.add(t5);

       JLabel l6 = new JLabel("Bad Type");
       l6.setBounds(64,240,152,22);
       l6.setForeground(Color.white);
       l6.setFont(new Font("Tahoma",Font.BOLD,14));
       panel.add(l6);
       t6 = new JComboBox(new String[]{"Singel" , "Double"});
       t6.setBackground(new Color(16,108,115));
       t6.setForeground(Color.white);
       t6.setBounds(200,240,152,22);
       panel.add(t6);

       JButton add = new JButton("ADD");
       add.setBounds(100,310,100,30);
       add.setBackground(Color.black);
       add.setForeground(Color.white);
       add.setFont(new Font ("Tahoma", Font.BOLD,15));
       panel.add(add);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==add){
                    try {
                        Con_database c =new Con_database();
                        String room = t2.getText();
                        String ava = (String) t3.getSelectedItem();
                        String status = (String)  t5.getSelectedItem();
                        String price =  t4.getText();
                        String type = (String) t6.getSelectedItem();
                        String q = "insert into room values('"+room+"','"+ava+"','"+status+"','"+price+"','"+type+"')";
                        // c.statement.executeQuery(q);
                        c.statement.executeUpdate(q);

                        JOptionPane.showMessageDialog(null,"Room Successfully Added");
                        setVisible(false);

                    }catch (Exception E){
                        E.printStackTrace();
                    }
                }

            }
        });
        JButton back = new JButton("BACK");
        back.setBounds(250,310,100,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setFont(new Font ("Tahoma", Font.BOLD,15));
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==back){
                    new Admin();
                    setVisible(false);
                }


            }
        });
        ImageIcon imageIcon= new ImageIcon(ClassLoader.getSystemResource("roomser.png"));
        Image image =  imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
       panel. add(label);











        setLocation(20,200);
        setUndecorated(true);
        setSize(885,500);
        setVisible(true);
        setLayout(null);

    }
    public static void main(String[] args) {
        new AddRoom();

    }
}
