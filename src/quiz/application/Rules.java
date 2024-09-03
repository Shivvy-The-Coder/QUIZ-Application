
package quiz.application;

/**
 *
 * @author Shivam
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements  ActionListener
{
    JButton back,start;
    String name;
    Rules(String name)
        {
        this.name= name;
        getContentPane().setBackground(Color.WHITE);
//        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(800,650);
        setVisible(true);
        setLocation(350,100);   
        
        
//        decalring a label here 

        JLabel heading = new JLabel("Welcome "+name +" to Simple Minds");
        heading.setBounds(30,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,20));
        heading.setForeground(Color.RED);
        add(heading);
        
        
        
        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("tahoma",Font.PLAIN,18));
//        rules.setForeground(new Color(30,144,254));
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
            );

        add(rules);
        
        
        
        
        start = new JButton("START");
        start.setBounds(270,700,120,25);
        start.setForeground(Color.RED);
        start.addActionListener(this);
        add(start);

//this buttonwill be used to go back
        back = new JButton("BACK");
        back.setBounds(570,700,120,25);
        back.setForeground(Color.RED);
        back.addActionListener(this);
        add(back);
        }
    
     public void actionPerformed( ActionEvent ae)
     {
         if(ae.getSource()==back)
         {
             setVisible(false);
             new Login();
         }
         else if(ae.getSource()==start)
         {
             setVisible(false);
         }
         
                 
     }
    public static void main(String []args)
    {
        new Rules("User");
    }
    
}
