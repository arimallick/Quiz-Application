// package winapp;
import javax.swing.*;
import java.awt.*;
public class QuizScore extends JFrame{
    public QuizScore(int scr){
        setLayout(null);
        setBounds(-7, 0, 1600, 850);
        getContentPane().setBackground(Color.YELLOW);
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("logos/ff.jpg"));
        JLabel image = new JLabel(i);
        image.setBounds(0, 0, 800, 800);
        add(image);

        JLabel score1 = new JLabel();
        add(score1);
        score1.setBounds(1100,400,700,50);
        score1.setFont(new Font("Tahoma", Font.PLAIN, 50));
        score1.setText(
            "<html>" + "your score is" + scr + "<html>"
        );
        add(score1);
        setVisible(true);
    }
    
}
