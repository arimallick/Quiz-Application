// package winapp;
import javax.sound.sampled.SourceDataLine;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizRules extends JFrame implements ActionListener{
    String name;
    JButton b1 = new JButton("Back");
    JButton b2 = new JButton("Start");
   public QuizRules(String name){
        this.name = name;

        // Pannel Layout
        getContentPane().setBackground(Color.ORANGE);
        setLayout(null);
        setSize(800,650);
        setLocation(350,100);
        

        // Rules Heading
        JLabel heading = new JLabel("-Welcome "+ name +" Read the Rules-");
        heading.setBounds(160,20,700,40);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 30));
        heading.setForeground(Color.DARK_GRAY);
        add(heading);

        JLabel rules = new JLabel();
        add(rules);
        rules.setBounds(20,60,700,350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 18));
        rules.setText(
         "<html>" +
         "NOTE: Run on Default window pop up, do not maximize it" + "<br><br>" +
         "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
         "2. Don not unnecesarrily smile at the person sitting next to you" + "<br><br>" +
         "3. Crying is allowed but please do so quietly" + "<br><br>" +
         "4. You have 2 lifelines" + "<br><br>" +
         "5. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
         "6. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
         "<html"
        );
         
        // back button
        add(b1);
        b1.setBounds(160,450,100,40);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font("Mongolian Baiti", Font.BOLD,20));
        b1.addActionListener(this);
        
        // Start Button
        add(b2);
        b2.setBounds(490,450,100,40);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("Mongolian Baiti", Font.BOLD,20));
        b2.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            setVisible(false);
            new QuizLogin();
        }

        else if (e.getSource() == b2) {
            setVisible(false);
            new QuizQues();
        }
    }
    public static void main(String[] args) {
        new QuizRules("");
    }
}