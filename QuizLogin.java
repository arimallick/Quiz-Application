// package winapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class QuizLogin extends JFrame implements ActionListener{
    
    JButton b1 = new JButton("Rules");
    JButton b2 = new JButton("Exit");
    
    JTextField j = new JTextField();

    QuizLogin(){
        
        // Login Box Pannel
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
        setLocation(200,150);

        // Image Field
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("logos/new.jpg"));
        JLabel image = new JLabel(i);
        image.setBounds(0, 0, 600, 500);
        add(image);

        // Heading 1 
        JLabel h1 = new JLabel("Brain Test");
        add(h1);
        h1.setBounds(785,60,300,60);
        h1.setFont(new Font("Mongolian Baiti", Font.BOLD, 50));
        h1.setForeground(new  Color(100, 144, 55));
        setSize(1200,500);

        // Heading 2
        JLabel h2 = new JLabel("Enter your name");
        add(h2);
        h2.setBounds(810,150,300,20);
        h2.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
        h2.setForeground(new  Color(0, 0, 100));
        setSize(1200,500);
 
        // Test field
        add(j);
        j.setBounds(750,200,300,25);
        j.setFont(new Font("Times New Roman", Font.BOLD, 20));
     
        // Rules Button
        add(b1);
        b1.setBounds(750,250,100,20);
        b1.setBackground(new Color(20,155, 254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        
        // Exit Button
        add(b2);
        b2.setBounds(950,250,100,20);
        b2.setBackground(new Color(20,155, 254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
    }

    // Action Field
    public void actionPerformed(ActionEvent a1){
           if (a1.getSource() == b1){
            String name = j.getText();
            setVisible(false);
            new QuizRules(name);
           }
           else if (a1.getSource() == b2) {
            setVisible(false);
           }
    }
    public static void main(String[] args){
        QuizLogin q = new QuizLogin();
    }
}