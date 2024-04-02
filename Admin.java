package Hotel.Management.System;

import com.mysql.cj.xdevapi.AddResult;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame /*implements ActionListener*/ {
    Admin() {


        JButton add_emp = new JButton("ADD EMPLOYEE");
        add_emp.setBounds(250, 230, 200, 30);
        add_emp.setForeground(Color.black);
        add_emp.setBackground(Color.WHITE);
        add_emp.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(add_emp);
        add_emp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==add_emp){
                    new Add_Employe();
                    setVisible(false);


                }

            }
        });

        JButton addroom1 =new JButton("ADD ROOM");
        addroom1.setFont(new Font("Tahoma",Font.BOLD,15));
        addroom1.setBounds(250,380,200,30);
        addroom1.setBackground(Color.WHITE);
        addroom1.setForeground(Color.black);
        add(addroom1);
        addroom1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==addroom1){
                  new AddRoom();



                }

            }
        });

        JButton add_driver = new JButton("ADD DRIVER");
        add_driver.setBounds(250,530,200,30);
        add_driver.setForeground(Color.BLACK);
        add_driver.setBackground(Color.WHITE);
        add_driver.setFont(new Font("Tahoma",Font.BOLD,15));
        add(add_driver);
        add_driver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==add_driver){
                    new Add_driver();


                }

            }
        });

        JButton logout =new JButton("LOGOUT");
        logout.setBounds(10,650,95,30);
        logout.setForeground(Color.white);
        logout.setBackground(Color.black);
        add(logout);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==logout) {
                    System.exit(512);
                    setVisible(false);}
            }
        });



        JButton back = new JButton("BACK");
        back.setBounds(110,650,95,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        add(back);
       // back.addActionListener(this);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==back) {
                    new Dashboard();
                    setVisible(false);

                }

            }
        });



        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("employees.png"));
        Image i = img1.getImage().getScaledInstance(120,120 , Image.SCALE_DEFAULT) ;
        ImageIcon  imageIcon = new ImageIcon(i);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(70,180,120,120);
        add(label);

        ImageIcon img2 = new ImageIcon(ClassLoader.getSystemResource("room.png"));
        Image i2 = img2.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(i2);
        JLabel label2 = new JLabel(imageIcon2);
        label2.setBounds(70,340,120,120);
        add(label2);

        ImageIcon img3 = new ImageIcon(ClassLoader.getSystemResource("driver.png"));
        Image i3 = img3.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon3 = new ImageIcon(i3);
        JLabel label3 = new JLabel(imageIcon3);
        label3.setBounds(70,500,120,120);
        add(label3);

       ImageIcon img4 = new ImageIcon(ClassLoader.getSystemResource("H.M (3).gif"));
        Image i4 = img4.getImage().getScaledInstance(350,400,Image.SCALE_DEFAULT);
        ImageIcon imageIcon4 = new ImageIcon(i4);
        JLabel label4 = new JLabel(imageIcon4);
        label4.setBounds(1900,500,350,400);
        add(label4);


        getContentPane().setBackground(new Color(3, 45, 48));
        setSize(1950, 1090);
        setVisible(true);
        setLayout(null);

    }
    public static void main(String[] args) {
        new Admin();

    }

}

