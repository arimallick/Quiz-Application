// package winapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class QuizQues extends JFrame implements ActionListener {
    String[][] question = new String[10][5];
    String[][] answer = new String[10][2];
    String[][] user_answer = new String[10][1];
    String time;
    JRadioButton ot1, ot2, ot3, ot4;
    JButton next, submit, lyfline;
    ButtonGroup allbutton;
    JLabel op, qno;
    static int timer = 10;
    int ans_given = 0, count = 0, score = 0;

    public QuizQues() {
        setLayout(null);
        setBounds(-7, 0, 1600, 850);
        getContentPane().setBackground(Color.YELLOW);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("logos/fk.png"));
        JLabel image = new JLabel(i);
        image.setBounds(0, 0, 1600, 400);
        add(image);

        // Questions

        question[0][0] = "Which language is widely used for competitive programming?";
        question[0][1] = "Java";
        question[0][2] = "C++";
        question[0][3] = "C#";
        question[0][4] = "C";

        question[1][0] = "Which language is used to perform CRUD operations in DBMS?";
        question[1][1] = "MongoDB";
        question[1][2] = "SQL";
        question[1][3] = "JDBC";
        question[1][4] = "1 and 2";

        question[2][0] = "Inheritence is used for?";
        question[2][1] = "reuse code";
        question[2][2] = "DRY";
        question[2][3] = "Time and space complexity";
        question[0][4] = "all of above";

        question[3][0] = "Loops are used for?";
        question[3][1] = "repeatatve work";
        question[3][2] = "condtional work";
        question[3][3] = "assign value";
        question[3][4] = "nothing just for fool students";

        question[4][0] = "Which language is known as purely object oriented";
        question[4][1] = "C++";
        question[4][2] = "C";
        question[4][3] = "Python";
        question[4][4] = "Java";

        question[5][0] = "Which condition satisfy the infinite loop";
        question[5][1] = "i<10; i++";
        question[5][2] = "i<10; i+2";
        question[5][3] = "i<10; i--";
        question[5][4] = "Both 1 and 2";

        question[6][0] = "Which SQL query is used to retreive data from DBMS ";
        question[6][1] = "SELECT * from database";
        question[6][2] = "SELECT * from table";
        question[6][3] = "SELECT rollno from table";
        question[6][4] = "Both 2 and 3";

        question[7][0] = "Which command is used to track files in git bash";
        question[7][1] = "git status";
        question[7][2] = "git init";
        question[7][3] = "git add filename";
        question[7][4] = "git commit -m";

        question[8][0] = "Which is an unstructured database storage software";
        question[8][1] = "SQL";
        question[8][2] = "Oracle";
        question[8][3] = "IBM";
        question[8][4] = "MongoDB";

        question[9][0] = "Do we need to start contributing in open source";
        question[9][1] = "What it is";
        question[9][2] = "Not sure";
        question[9][3] = "Waste of time";
        question[9][4] = "Must do";

        

        // Answers

        answer[0][1] = "C++";
        answer[1][1] = "1 and 2";
        answer[2][1] = "all of above";
        answer[3][1] = "repeatatve work";
        answer[4][1] = "Java";
        answer[5][1] = "i<10; i--";
        answer[6][1] = "Both 2 and 3";
        answer[7][1] = "git init";
        answer[8][1] = "MongoDB";
        answer[9][1] = "Must do";

        // Questions
        qno = new JLabel();
        qno.setBounds(100, 450, 100, 50);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);

        op = new JLabel();
        op.setBounds(150, 450, 1000, 50);
        op.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(op);

        // Options

        ot1 = new JRadioButton();
        ot1.setFont(new Font("Dialog", Font.PLAIN, 20));
        ot1.setBounds(150, 520, 250, 30);
        ot1.setBackground(Color.yellow);
        ot1.setForeground(Color.BLACK);
        add(ot1);

        ot2 = new JRadioButton();
        ot2.setFont(new Font("Dialog", Font.PLAIN, 20));
        ot2.setBounds(150, 570, 250, 30);
        ot2.setBackground(Color.yellow);
        ot2.setForeground(Color.BLACK);
        add(ot2);

        ot3 = new JRadioButton();
        ot3.setFont(new Font("Dialog", Font.PLAIN, 20));
        ot3.setBounds(150, 620, 250, 30);
        ot3.setBackground(Color.yellow);
        ot3.setForeground(Color.BLACK);
        add(ot3);

        ot4 = new JRadioButton();
        ot4.setFont(new Font("Dialog", Font.PLAIN, 20));
        ot4.setBounds(150, 670, 250, 30);
        ot4.setBackground(Color.YELLOW);
        ot4.setForeground(Color.BLACK);
        add(ot4);

        // Grouped Options

        allbutton = new ButtonGroup();
        allbutton.add(ot1);
        allbutton.add(ot2);
        allbutton.add(ot3);
        allbutton.add(ot4);

        // Next Question Button
        lyfline = new JButton("50-50 Lifeline");
        lyfline.setFont(new Font("Tahoma", Font.BOLD, 18));
        lyfline.setBounds(800, 520, 170, 35);
        lyfline.setBackground(Color.WHITE);
        lyfline.setForeground(Color.BLACK);
        lyfline.addActionListener(this);
        add(lyfline);

        next = new JButton("Next");
        next.setFont(new Font("Tahoma", Font.BOLD, 20));
        next.setBounds(800, 570, 170, 35);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        add(next);

        submit = new JButton("Submit");
        submit.setFont(new Font("Tahoma", Font.BOLD, 20));
        submit.setBounds(800, 620, 170, 35);
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.BLACK);
        submit.addActionListener(this);
        add(submit);
        
        submit.setEnabled(false);
        start(count);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next)
        {
            repaint();
            ans_given = 1;
            optn();
            ans();

            if (count == 8)
            {
             next.setEnabled(false);
             submit.setEnabled(true);
            }
            if (count == 9){
             if(allbutton.getSelection() == null){
                user_answer[count][0] = " not answerd";
             }
             else{
              user_answer[count][0] = allbutton.getSelection().getActionCommand();
             }

             for(int i = 0; i<user_answer.length; i++){
                if (user_answer[i][0].equals(answer[i][0])){ 
                 score+=10;
                }
             }
            }
            else{
                ans();
            }
        }

        else if (ae.getSource() == lyfline)
        {
         if(count%2 == 0 || count%2 == 1){
            ot2.setEnabled(false);
            ot4.setEnabled(false);
            lyfline.setEnabled(false);
         }
        }
        else if (ae.getSource() == submit)
        {
         setVisible(false);
         new QuizScore(score);
        }
        count++;
        start(count);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        time = "Time left - " + timer + "s";
        g.setFont(new Font("Tahoma", Font.BOLD, 18));
        g.setColor(Color.RED);

        if (timer > 0){
         g.drawString(time, 1000, 500);
        }
        else if (timer < 0)
        {
         if (count==9){
         setVisible(false);
         new QuizScore(score);
         }
         timer = 10;
         optn();
         count++;
         start(count);
        }
        else{
         g.drawString("Times up!", 1000, 500);
        }

        timer--;

        try{
         Thread.sleep(1000);
         repaint();
        }
        catch (Exception e){
         e.printStackTrace();
        }
        
        if (ans_given == 1){
         ans_given = 0;
         timer = 10;
        }
        
        ans();
    }

    void optn(){
        ot1.setEnabled(true);
        ot2.setEnabled(true);
        ot3.setEnabled(true);
        ot4.setEnabled(true);
    }
    
    void ans(){
        if (allbutton.getSelection() == null)
        {
         user_answer[count][0] = "Not Answered";
        }
        else{
         user_answer[count][0] = allbutton.getSelection().getActionCommand();
        }
    }
 
    public void start(int count)
    {
        qno.setText(" " + (count + 1) + " ");
        op.setText(question[count][0]);
        ot1.setText(question[count][1]);
        ot1.setActionCommand(question[count][1]);
        ot2.setText(question[count][2]);
        ot2.setActionCommand(question[count][2]);
        ot3.setText(question[count][3]);
        ot3.setActionCommand(question[count][3]);
        ot4.setText(question[count][4]);
        ot4.setActionCommand(question[count][4]);
        allbutton.clearSelection();
    }
}
