package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class New_customer extends JFrame {

    JComboBox comboBox;
    Choice c1;
   JLabel date;

   JButton b1,b2;
    New_customer(){
        JPanel panel= new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        panel.setBounds(5,5,840,550);
        setSize(850,550);
        setLocation(400,150);
        add(panel);

        ImageIcon imageIcon= new ImageIcon(ClassLoader.getSystemResource("customer.png"));
        Image image =  imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon12=new ImageIcon(image);
        JLabel label = new JLabel(imageIcon12);
        label.setBounds(550,150,200,200);
        panel. add(label);

        JLabel l1 = new JLabel("NEW CUSTOMER FROM");
        l1.setFont(new Font("Tahoma", Font.BOLD,22));
        l1.setForeground(Color.white);
        l1.setBounds(120,15,300,20);
        panel.add(l1);

        JLabel govId = new JLabel("GOVERNMENT ID :");
        govId.setBounds(30,70,160,20);
        govId.setForeground(Color.white);
        govId.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(govId);

        JComboBox combobox  = new JComboBox(new String[] {"Aadhar card" , "Driveing license" , "Voter card" , "PAN card"});
       combobox.setBounds(220,70,150,25);
       combobox.setBackground(new Color(16,108,115));
       combobox.setFont(new Font("Tahoma",Font.BOLD,14));
       combobox.setForeground(Color.white);
       panel.add(combobox);

       JLabel name = new JLabel("NAME :");
       name.setFont(new Font("Tahoma", Font.BOLD, 17));
       name.setBounds(30,120,160,20);
       name.setForeground(Color.white);
       panel.add(name);
       JTextField t1 =new JTextField();
       t1.setBounds(220,120,150,25);
       t1.setBackground(new Color(16,108,115));
       t1.setFont(new Font("Tahpma",Font.BOLD,14));
       t1.setForeground(Color.white);
       panel.add(t1);

       JLabel Nom = new JLabel("NUMBER :");
       Nom.setBounds(30,180,160,20);
       Nom.setFont(new Font("Tahoma",Font.BOLD,17));
       Nom.setForeground(Color.white);
       panel.add(Nom);
       JTextField t2 = new JTextField();
       t2.setForeground(Color.white);
       t2.setBackground(new Color(16,108,115));
       t2.setBounds(220,180,150,25);
       t2.setFont(new Font("Tahoma",Font.BOLD,14));
       panel.add(t2);

       JLabel gender = new JLabel("GENDER :");
       gender.setForeground(Color.white);
       gender.setFont(new Font("Tahoma",Font.BOLD,17));
       gender.setBounds(30,240,160,20);
       panel.add(gender);
       JRadioButton rb1 =new JRadioButton("MALE");
       rb1.setBounds(220,245,80,20);
       rb1.setForeground(Color.white);
       rb1.setFont(new Font("Tahoma",Font.BOLD,14));
       rb1.setBackground(new Color(4,45,48));
       panel.add(rb1);
        JRadioButton rb2 =new JRadioButton("FEMALE");
        rb2.setForeground(Color.white);
        rb2.setFont(new Font("Tahoma",Font.BOLD,14));
        rb2.setBounds(295,245,110,20);
        rb2.setBackground(new Color(4,45,48));
        panel.add(rb2);

        JLabel Con = new JLabel("COUNTRY :");
        Con.setBounds(30,300,150,20);
        Con.setFont(new Font("Tahoma",Font.BOLD,17));
        Con.setForeground(Color.white);
        panel.add(Con);
        JTextField t4 = new JTextField();
        t4.setFont(new Font("Tahoma",Font.BOLD,14));
        t4.setBounds(220,300,150,20);
        t4.setBackground(new Color(16,106,115));
        panel.add(t4);

        JLabel room = new JLabel("ROOM NO :");
        room.setBounds(30,350,150,20);
        room.setFont(new Font("Tahoma",Font.BOLD,17));
        room.setForeground(Color.white);
        panel.add(room);

        c1 = new Choice();
        try {
            Con_database c = new Con_database();
            ResultSet resultSet = c.statement.executeQuery("select * from room");
            while (resultSet.next()){
                c1.add(resultSet.getString("roomnumber"));
            }


        }catch (Exception E){
            E.printStackTrace();
        }
        c1.setBounds(220,350,150,20);
        c1.setForeground(Color.white);
        c1.setBackground(new Color(16,108,115));
        c1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(c1);

        JLabel cin = new JLabel("CHECKED IN :");
        cin.setBounds(30,400,150,20);
        cin.setFont(new Font("Tahoma",Font.BOLD,17));
        cin.setForeground(Color.white);
        panel.add(cin);

        Date date1 = new Date();

        date = new JLabel(""+date1);
        date.setBounds(220,400,210,20);
        date.setFont(new Font("Tahoma",Font.BOLD,17));
        date.setForeground(Color.white);
        panel.add(date);

        JLabel dipo = new JLabel("DEPOSIT :");
        dipo.setBounds(30,440,160,20);
        dipo.setFont(new Font("Tahoma",Font.BOLD,17));
        dipo.setForeground(Color.white);
        panel.add(dipo);
        JTextField t3 = new JTextField();
        t3.setForeground(Color.white);
        t3.setBackground(new Color(16,108,115));
        t3.setBounds(220,440,150,25);
        t3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(t3);

        JButton b1 = new JButton("ADD");
        b1.setForeground(Color.white);
        b1.setFont(new Font("Tahoma",Font.BOLD,14));
        b1.setBounds(430,190,75,30);
        b1.setBackground(Color.black);
        panel.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if (e.getSource()==b1){
                //  Con_database c = new Con_database();
                     String gender = null;
                   if (rb1.isSelected()){
                       gender= "Male";
                   }else {
                       gender="Female";
                   }
                   String s1 = (String)combobox.getSelectedItem();
                   String s2 = t1.getText();
                   String s3 = t2.getText();
                   String s4 = gender;
                   String s5 = t4.getText();
                   String s6 = c1.getSelectedItem();
                   String s7 = date.getText();
                   String s8= t3.getText();

                   try {
                       Con_database c = new Con_database();
                       String q = "insert into customer values('"+s1+"', '"+s2+"' , '"+s3+"' , '"+s4+"' , '"+s5+"'  , '"+s6+"' , '"+s7+"' , '"+s8+"')";
                       String q1 = "update room set availability = 'Occupied' where roomnumber = "+s6;
                       c.statement.executeUpdate(q);
                       c.statement.executeUpdate(q1);
                       JOptionPane.showMessageDialog(null,"Customer details are Successfully added");

                   }catch (Exception E){
                       E.printStackTrace();

                   }


               }
            }
        });

        JButton b2 = new JButton("BACK");
        b2.setForeground(Color.white);
        b2.setFont(new Font("Tahoma",Font.BOLD,14));
        b2.setBounds(430,250,75,30);
        b2.setBackground(Color.black);
        panel.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b2){
                  new Reception();
                  setVisible(false);
                }
            }
        });

        setUndecorated(false);
        setLayout(null);
        setVisible(true);


    }
    public static void main(String[] args) {
        new New_customer();

    }
}
