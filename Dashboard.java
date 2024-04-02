package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton add,rec;

    Dashboard(){
        super("HOTEL MANAGEMENT SYSTEM ");

        rec = new JButton("RECEPTION");
        rec.setBounds(425,510,140,30);
        rec.setFont(new Font("Tahoma",Font.BOLD,15));
        rec.setBackground(new Color(255,98,0));
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);
        add(rec);
        ImageIcon  imageIconb0 = new ImageIcon(ClassLoader.getSystemResource("Reception.png"));
        Image i22 =imageIconb0.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon imageIcon22 =new ImageIcon(i22);
        JLabel label12 =new JLabel(imageIcon22);
        label12.setBounds(400,300,200,195);
        add(label12);

        add = new JButton("ADMIN");
        add.setBounds(880,510,140,30);
        add.setFont(new Font("Tahoma",Font.BOLD,15));
        add.setBackground(new Color(255,98,0));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);
        ImageIcon  imageIconb = new ImageIcon(ClassLoader.getSystemResource("Boss.png"));
        Image i2 =imageIconb.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 =new ImageIcon(i2);
        JLabel label1 =new JLabel(imageIcon2);
        label1.setBounds(850,300,200,195);
        add(label1);


        ImageIcon  imageIcon = new ImageIcon(ClassLoader.getSystemResource("Dashboard.gif"));
        Image i1 =imageIcon.getImage().getScaledInstance(1950,1090,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 =new ImageIcon(i1);
        JLabel label =new JLabel(imageIcon1);
        label.setBounds(0,0,1950,1090);
        add(label);

        setLayout(null);
        setSize(1950,1090);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==add){
            new Login2();
            setVisible(false);

        }
        else {
            new Reception();
            setVisible(false);

        }

    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
