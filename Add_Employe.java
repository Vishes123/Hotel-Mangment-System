package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Add_Employe extends JFrame{
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton RB1,RB2;
    JComboBox comboBox;
    JButton b1,b2,b3,b4;
    Add_Employe(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel l0 = new JLabel("ADD  EMPLOYEE  DETAIL");
        l0.setBounds(450,24,445,35);
        l0.setForeground(Color.white);
        l0.setFont(new Font("serif",Font.BOLD,31));
        panel.add(l0);



        JLabel l1 = new JLabel("NAME");
        l1.setBounds(60,30,150,27);
        l1.setForeground(Color.white);
        l1.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(l1);
        JTextField t1 =new JTextField();
        t1.setBounds(200,30,150,27);
        t1.setBackground(new Color(16, 108, 115));
        t1.setFont(new Font("Tahoma", Font.BOLD,17));
        t1.setForeground(Color.white);
        panel.add(t1);

        JLabel l2 = new JLabel("AGE");
        l2.setBounds(60,80,150,27);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(l2);
        JTextField t2 = new JTextField();
        t2.setBounds(200,80,150,27);
        t2.setForeground(Color.white);
        t2.setFont(new Font("Tahoma", Font.BOLD,17));
        t2.setBackground(new Color(16,108,115));
        panel.add(t2);

        JLabel l3=new JLabel("GENDER");
        l3.setBounds(60,130,150,27);
        l3.setForeground(Color.white);
        l3.setFont(new Font("Tahoma", Font.BOLD,17));
        panel.add(l3);

        JRadioButton  RB1 = new JRadioButton("MALE");
        RB1.setForeground(Color.white);
        RB1.setBackground(new Color(3,45,48));
        RB1.setFont(new Font("Tahoma" , Font.BOLD,14));
        RB1.setBounds(200,130,70,27);
        panel.add(RB1);


        JRadioButton  RB2 = new JRadioButton("FEMALE");
        RB2.setForeground(Color.white);
        RB2.setBackground(new Color(3,45,48));
        RB2.setFont(new Font("Tahoma" , Font.BOLD,14));
        RB2.setBounds(270,130,90,27);
        panel.add(RB2);
        JLabel l4 = new JLabel("JOB");
        l4.setBounds(60,180,150,27);
        l4.setForeground(Color.white);
        l4.setFont(new Font("Tahoma",Font.BOLD,17));
        l4.setBackground(new Color(3,45,48));
        panel.add(l4);
        comboBox = new JComboBox(new String[]{"Front Desk" , "Housekeeping" , "Kitchen Staff" , "Room Service" , "Manager" , "Accountant" , "Chef"});
        comboBox.setBounds(200,180,150,27);
        comboBox.setForeground(Color.white);
        comboBox.setFont((new Font("Tahoma",Font.BOLD,17)));
        comboBox.setBackground(new Color(16,108,115));
        panel.add(comboBox);

        JLabel l5 =new JLabel("SALARY");
        l5.setBounds(60,230,150,27);
        l5.setForeground(Color.white);
        l5.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(l5);
        JTextField t3 = new JTextField();
        t3.setBounds(200,230,150,27);
        t3.setForeground(Color.white);
       t3.setFont(new Font("Tahoma", Font.BOLD,17));
        t3.setBackground(new Color(16,108,115));
        panel.add(t3);

        JLabel l6 = new JLabel("PHONE NO");
        l6.setFont(new Font("Tahoma",Font.BOLD,17));
        l6.setForeground(Color.white);
        l6.setBounds(60,280,150,27);
        panel.add(l6);
        JTextField t4 = new JTextField();
        t4.setFont(new Font("Tahoma",Font.BOLD,17));
        t4.setBackground(new Color(16,108,115));
        t4.setForeground(Color.white);
        t4.setBounds(200,280,150,27);
        panel.add(t4);

        JLabel l7 = new JLabel("AADHAR NO");
        l7.setFont(new Font("Tahoma",Font.BOLD,17));
        l7.setForeground(Color.white);
        l7.setBounds(60,330,150,27);
        panel.add(l7);
        JTextField t5 = new JTextField();
        t5.setFont(new Font("Tahoma",Font.BOLD,17));
        t5.setBackground(new Color(16,108,115));
        t5.setForeground(Color.white);
        t5.setBounds(200,330,150,27);
        panel.add(t5);


        JLabel l8 = new JLabel("EMAIL ID");
        l8.setFont(new Font("Tahoma",Font.BOLD,17));
        l8.setForeground(Color.white);
        l8.setBounds(60,380,150,27);
        panel.add(l8);
        JTextField t6 = new JTextField();
        t6.setFont(new Font("Tahoma",Font.BOLD,17));
        t6.setBackground(new Color(16,108,115));
        t6.setForeground(Color.white);
        t6.setBounds(200,380,150,27);
        panel.add(t6);


        JButton b1 = new JButton("BACK");
        b1.setFont(new Font("Tahoma",Font.BOLD,17));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.black);
        b1.setBounds(90,420,90,30);
        panel.add(b1);
        //b1.addActionListener( this);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b1){
                    new Admin();
                    setVisible(false);
                }

            }
        });

        JButton b2 = new JButton("SAVE");
        b2.setFont(new Font("Tahoma",Font.BOLD,17));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.black);
        b2.setBounds(200,420,90,30);
        panel.add(b2);
        //b2.addActionListener(this) ;
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b2){

                    String name = t1.getText();
                    String age = t2.getText();
                    String gender = null;
                    if (RB1.isSelected()){
                        gender = "Male";
                    } else if (RB2.isSelected()) {
                        gender = "Female";

                    }
                    String job = (String) comboBox.getSelectedItem();
                    String salary = t3.getText();
                    String phone = t4.getText();
                    String aadhar = t5.getText();
                    String email = t6.getText();

                    try {
                        Con_database c = new Con_database();
                        String q = "insert into employee values('"+name+"', '"+age+"' , '"+gender+"' , '"+job+"' , '"+salary+"'  , '"+phone+"' , '"+aadhar+"' , '"+email+"')";
                        c.statement.executeUpdate(q);
                        JOptionPane.showMessageDialog(null,"Employee Added Successfully detail");

                    }catch (Exception E){
                        E.printStackTrace();

                    }


                }
            }


        });


        ImageIcon imageIcon= new ImageIcon(ClassLoader.getSystemResource("addemp.png"));
        Image image =  imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon12=new ImageIcon(image);
        JLabel label = new JLabel(imageIcon12);
        label.setBounds(500,60,300,300);
        panel. add(label);

        ImageIcon imageIcon2= new ImageIcon(ClassLoader.getSystemResource("login.gif"));
        Image image1 =  imageIcon2.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image1);
        JLabel label2 = new JLabel(imageIcon1);
        label2.setBounds(500,60,300,300);
         add(label2);


         setLocation(60,160);
        setUndecorated(true);
        setSize(900,500);
        setVisible(true);
        setLayout(null);

    }

    public static void main(String[] args) {
        new Add_Employe();
    }
}
