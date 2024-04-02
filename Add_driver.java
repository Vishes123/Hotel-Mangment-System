package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add_driver extends JFrame {
    JTextField t1,t2,t3,t4,t5;
    JRadioButton RB1,RB2;
    JComboBox comboBox,comboBox2;
    JButton b1,b2;
    Add_driver(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel l0 = new JLabel("ADD DRIVERS");
        l0.setForeground(Color.white);
        l0.setFont(new Font("Tahoma", Font.BOLD,23));
        l0.setBounds(194,10,170,22);
        panel.add(l0);

        JLabel name = new JLabel("NAME");
        name.setBounds(64,70,102,22);
        name.setFont(new Font("Tahoma",Font.BOLD,17));
        name.setForeground(Color.white);
        panel.add(name);
        JTextField t1 = new JTextField();
        t1.setForeground(Color.white);
        t1.setBounds(180,70,156,20);
        t1.setBackground(new Color(16,108,115));
        t1.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(t1);

        JLabel age = new JLabel("AGE");
        age.setBounds(64,110,102,22);
        age.setForeground(Color.white);
        age.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(age);
        JTextField t2 = new JTextField();
        t2.setBounds(180,110,156,20);
        t2.setForeground(Color.white);
        t2.setFont(new Font("Tahoma",Font.BOLD,18));
        t2.setBackground(new Color(16,108,115));
        panel.add(t2);

        JLabel gender = new JLabel("GENDER");
        gender.setFont(new Font("Tahoma",Font.BOLD,17));
        gender.setForeground(Color.white);
        gender.setBounds(64,150,102,22);
        panel.add(gender);
        JRadioButton RB1 = new JRadioButton("MALE");
        RB1.setBounds(170,150,90,22);
        RB1.setBackground(new Color(3,45,48));
        RB1.setFont(new Font("Tahoma",Font.BOLD,17));
        RB1.setForeground(Color.WHITE);
        panel.add(RB1);
        JRadioButton RB2 = new JRadioButton("FEMALE");
        RB2.setBounds(260,150,95,22);
        RB2.setBackground(new Color(3,45,48));
        RB2.setFont(new Font("Tahoma",Font.BOLD,17));
        RB2.setForeground(Color.WHITE);
        panel.add(RB2);

        JLabel carC = new JLabel("CAR COMPANY");
        carC.setBounds(64,190,115,22);
        carC.setForeground(Color.white);
        carC.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(carC);
        JTextField t4 =new JTextField();
        t4.setBounds(180,190,156,20);
        t4.setBackground(new Color(16,108,115));
        t4.setForeground(Color.white);
        t4.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(t4);

        JLabel carN = new JLabel("CAR NAME");
        carN.setBounds(64,240,102,22);
        carN.setForeground(Color.white);
        carN.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(carN);
        JComboBox comboBox = new JComboBox(new String [] {"TAHR" , "ENOVA" , "SCARPIO" , "BLEARO","SOMO" , "SWIT" , "TATA NANO" ,"OTHER"});
        comboBox.setBounds(180,240,156,20);
        comboBox.setForeground(Color.white);
        comboBox.setFont(new Font("Tahoma",Font.BOLD,17));
        comboBox.setBackground(new Color(15,108,115));
        panel.add(comboBox);



        JLabel avl = new JLabel("AVAILABLE");
        avl.setBounds(64,280,102,22);
        avl.setForeground(Color.white);
        avl.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(avl);
        JComboBox comboBox2 = new JComboBox(new String [] {"YES" , "NO"});
        comboBox2.setBounds(180,280,156,20);
        comboBox2.setForeground(Color.white);
        comboBox2.setFont(new Font("Tahoma",Font.BOLD,17));
        comboBox2.setBackground(new Color(15,108,115));
        panel.add(comboBox2);

        JLabel Loc = new JLabel("Location");
        Loc.setBounds(64,320,102,22);
        Loc.setFont(new Font("Tahoma",Font.BOLD,17));
        Loc.setForeground(Color.white);
        Loc.setBackground(new Color(16,108,115));
        panel.add(Loc);
        JTextField t5 = new JTextField();
        t5.setBounds(180,320,156,20);
        t5.setForeground(Color.white);
        t5.setFont(new Font("Tahoma",Font.BOLD,18));
        t5.setBackground(new Color(16,108,115));
        panel.add(t5);

        JButton b1 = new JButton("BACK");
        b1.setBounds(70,380,100,40);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b1){
                    new Admin();
                    setVisible(false);
                }

            }
        });

        JButton b2 = new JButton("ADD");
        b2.setBounds(200,380,100,40);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b2){
                    String name = t1.getText();
                    String age  = t2.getText();
                    String gender = null;
                    if (RB1.isSelected()){
                        gender="MALE";
                    } else if (RB2.isSelected()) {
                        gender="FEMALE";

                    }
                    String carC = t4.getText();
                    String carN = (String)  comboBox.getSelectedItem();
                    String avl = (String)  comboBox2.getSelectedItem();
                    String Loc = t5.getText();
                    try {
                        Con_database c = new Con_database();
                        String q = "insert into driver values('"+name+"','"+age+"','"+gender+"', '"+carC+"', '"+carN+"','"+avl+"','"+Loc+"')";
                        c.statement.executeUpdate(q);
                        JOptionPane.showMessageDialog(null,"Driver Details has successfully Added");

                    }catch (Exception E){
                        E.printStackTrace();

                    }


                }

            }
        });

        ImageIcon imageIcon2= new ImageIcon(ClassLoader.getSystemResource("license.png"));
        Image image1 =  imageIcon2.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image1);
        JLabel label2 = new JLabel(imageIcon1);
        label2.setBounds(500,60,300,300);
        panel. add(label2);








       // setSize(900,500);
        setSize(900,500);
        setUndecorated(true);
        setVisible(true);
        setLayout(null);
       // setLocation(20,200);
        setLocation(60,160);




    }
    public static void main(String[] args) {
        new Add_driver();

    }
}
