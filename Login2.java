package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login2 extends JFrame {
    JTextField t1;
    JPasswordField p1;
    JButton b1, b2;
    Login2(){
        JLabel l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);
        l1.setForeground(Color.white);
        l1.setFont(new Font("Tahoma",Font.BOLD,18));
        add(l1);
        JTextField t1 = new JTextField();
        t1.setBounds(150,20,160,30);
        t1.setFont(new Font("Tahoma",Font.BOLD,20));
        t1.setForeground(Color.white);
        t1.setBackground(new Color(16,108,115));
        add(t1);

        JLabel l2 =new JLabel("Password");
        l2.setFont(new Font("Tahoma",Font.BOLD,18));
        l2.setForeground(Color.white);
        l2.setBounds(40,80,100,30);
        add(l2);
        JPasswordField p1 = new JPasswordField();
        p1.setForeground(Color.white);
        p1.setFont(new Font("Tahoma" , Font.BOLD,20));
        p1.setBounds(150,80,160,30);
        p1.setBackground(new Color(16,108,115));
        add(p1);

        JButton b1 = new JButton("Login");
        b1.setFont(new Font("Tahoma",Font.BOLD,17));
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.setBounds(40,150,120,30);
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b1){
                    try{
                        Con_database c = new Con_database();
                        String  user = t1.getText();
                        String pass = p1.getText();

                        String q = "select * from  login2 where user_name = '"+user+"' and password = '"+pass+"'";
                        // ResultSet resultSet= c.statement.executeQuery(q);
                        ResultSet resultSet = c.statement.executeQuery(q);
                        if (resultSet.next()){
                           new Admin();
                            setVisible(false);
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"invalid ");
                        }

                    }catch (Exception E){
                        E.printStackTrace();


                    }

                }

                }


        });
        JButton b2 = new JButton("Cancel");
        b2.setFont(new Font("Tahoma",Font.BOLD,17));
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.setBounds(190,150,120,30);
        add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b2){
                    new Dashboard();
                    setVisible(false);
                }

            }
        });

        ImageIcon imageIcon= new ImageIcon(ClassLoader.getSystemResource("H.M (3).gif"));
        //if gif image size is not same you can scale them
        //image l1 =imageIcon = new ImageIcon().getScaledInstance(288,300,image.SCALE_DEFAULT);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(315,-30,300,255);
        add(label);





        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
        setSize(600,300);
        setLocation(400,270);



    }
    public static void main(String[] args) {
        new Login2();

    }
}
