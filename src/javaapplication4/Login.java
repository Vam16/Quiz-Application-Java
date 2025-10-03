package javaapplication4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    
    JButton rules, back;
    JTextField tfname;
    
    Login(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image scaledImage = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage); 


        JLabel image = new JLabel(scaledIcon);
        image.setBounds(0, 0, 600, 470);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(850, 100, 600, 50);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        add(heading);

        
        JLabel name = new JLabel ("Enter your name");
        name.setBounds(850, 150, 300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        add(name);
        
        
        tfname = new JTextField();
        tfname.setBounds(770 , 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(tfname);
        
        
        rules  = new JButton("Rules");
        rules.setBounds(770, 250, 120, 25);
        rules.setBackground(Color.BLACK);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        
        back  = new JButton("Back");
        back.setBounds(950, 250, 120, 25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }else if (ae.getSource() == back){
            setVisible(false);
        }
        
    }

    
    public static void main (String args[]){
        new Login();
    }
    
}
