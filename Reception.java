package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
     Reception(){
         JPanel panel =new JPanel();
         panel.setLayout(null);
         panel.setBounds(280,5,1238,820);
         panel.setBackground(new Color(3,45,48));
         add(panel);

         ImageIcon  imageIconb = new ImageIcon(ClassLoader.getSystemResource("H.M (3).gif"));
         Image i =imageIconb.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
         ImageIcon imageIcon =new ImageIcon(i);
         JLabel label =new JLabel(imageIcon);
         label.setBounds(300,20,500,800);
         panel.add(label);

         JPanel panel2 =new JPanel();
         panel2.setLayout(null);
         panel2.setBounds(5,5,270,820);
         panel2.setBackground(new Color(3,45,48));
         add(panel2);

         ImageIcon  imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("HM.gif"));
         Image i2 =imageIcon2.getImage().getScaledInstance(250,190,Image.SCALE_DEFAULT);
         ImageIcon imageIcon02 =new ImageIcon(i2);
         JLabel label1 =new JLabel(imageIcon02);
         label1.setBounds(5,500,250,190);
         panel2.add(label1);

         JButton btnNCF = new JButton("New Customer Form");
         btnNCF.setBounds(30,30,200,30);
         btnNCF.setBackground(Color.black);
         btnNCF.setForeground(Color.white);
         panel2.add(btnNCF);
         btnNCF.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {

                 }
                 catch (Exception E){
                     E.printStackTrace();
             }
             }
         });

         JButton buttn1 = new JButton("Room");
         buttn1.setBounds(30,70,200,30);
         buttn1.setForeground(Color.WHITE);
         buttn1.setBackground(Color.black);
         panel2.add(buttn1);
         buttn1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     if (e.getSource()==buttn1){
                         new Room();
                         setVisible(false);
                     }

                 }
                 catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });

         JButton button2 = new JButton("Department");
         button2.setBounds(30,110,200,30);
         button2.setBackground(Color.black);
         button2.setForeground(Color.WHITE);
         panel2.add(button2);
         button2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     if (e.getSource()==button2){
                         new Department();
                         setVisible(false);
                     }

                 }
                 catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });

         JButton button3 = new JButton("All Employee Info");
         button3.setBounds(30,150,200,30);
         button3.setBackground(Color.BLACK);
         button3.setForeground(Color.WHITE);
         panel2.add(button3);
         button3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     if (e.getSource()==button3){
                         new Employe();
                         setVisible(false);
                     }

                 }
                 catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });

         JButton button4 =new JButton("Customer Info");
         button4.setBounds(30,190,200,30);
         button4.setForeground(Color.WHITE);
         button4.setBackground(Color.black);
         panel2.add(button4);
         button4.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     new New_customer();
                     setVisible(false);

                 }
                 catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });

         JButton button5 = new JButton("Manager Info");
         button5.setBounds(30,230,200,30);
         button5.setBackground(Color.black);
         button5.setForeground(Color.WHITE);
         panel2.add(button5);
         button5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     if (e.getSource()==button5){
                         new Manager();
                         setVisible(false);
                     }

                 }
                 catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });

         JButton button6 = new JButton("Check out");
         button6.setBounds(30,270,200,30);
         button6.setForeground(Color.WHITE);
         button6.setBackground(Color.black);
         panel2.add(button6);
         button6.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {

                 }
                 catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });

         JButton button7 = new JButton("Update Check Details");
         button7.setBounds(30,310,200,30);
         button7.setBackground(Color.black);
         button7.setForeground(Color.WHITE);
         panel2.add(button7);
         button7.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {

                 }
                 catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });

         JButton butoon8 =new JButton("Update Room status");
         butoon8.setBounds(30,350,200,30);
         butoon8.setBackground(Color.BLACK);
         butoon8.setForeground(Color.WHITE);
         panel2.add(butoon8);
         butoon8.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {

                 }
                 catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });
         JButton button9 = new JButton("Pick up Service");
         button9.setBounds(30,390,200,30);
         button9.setBackground(Color.BLACK);
         button9.setForeground(Color.WHITE);
         panel2.add(button9);
         button9.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {

                 }
                 catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });
         JButton button10 =new JButton("Search Room");
         button10.setBounds(30,430,200,30);
         button10.setBackground(Color.BLACK);
         button10.setForeground(Color.WHITE);
         panel2.add(button10);
         button10.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {

                 }
                 catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });






         getContentPane().setBackground(Color.white);
         setLayout(null);
         setSize(1950,1090);
         setVisible(true);



    }
    public static void main(String[] args) {
         new Reception();

    }
}
