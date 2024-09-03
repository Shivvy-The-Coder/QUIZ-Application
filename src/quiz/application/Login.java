package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener
{
    JButton rules , back; 
    JTextField tfname;
    Login()
    {
//        getContentPane().se
//        get content will get the entire frame and Setbackground functton will st thew background to the desired colour here we have set it to white
        getContentPane().setBackground(Color.WHITE);
            
//        setlayout fucntoin will be used to set the null as we wont want any layout which is being provided the jVM
        setLayout(null);
        
        
//        ImageIcon is a class placed inside if the jframe this will be used to choose the image from the directory using the 
//        classloader -> load the classes and getSystemresoure is usded to get the directory whre the image is located
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
// we cant directluy use the i1 variable to access the image therfore we will us ethe JLabel class to store the Image/Photo as variable in image        
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
//add () fucntion is used to add the image to tghe current frame 
        add(image);
        
//        this will set up the heading o my application
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
// now to setip the name coloumn of my application
        JLabel name = new JLabel("Simple Minds");
        name.setBounds(810,150,345,25);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30,144,254));
        add(name);
  
//this button wlll be used to set the name of user
        tfname = new JTextField();
        tfname.setBounds(750,180,300,45);
        tfname.setFont(new Font("Mongolian baiti",Font.BOLD, 18));
        add(tfname);
                
//        jbuttonis a librarypresent in Jfram class 
        rules = new JButton("RULES");
        rules.setBounds(735,270,120,25);
        rules.setForeground(Color.RED);
        rules.addActionListener(this);
        add(rules);

//this buttonwill be used to go back
        back = new JButton("BACK");
        back.setBounds(900,270,120,25);
        back.setForeground(Color.RED);
        back.addActionListener(this);
        add(back);
        
//setSize() function is used to set the dimesnion of the frame here it has been set to 1300px height qand 800px as width
        setSize(1300,800);
//by default the frame is not visible therefore we will set the visiblity to true so that whenver the program constructor calls the fram gets visible 
        setVisible(true); 
        
// here we are setting up the location from very center point of the frame whicg the top eft corner of the screen
        setLocation(400,100);        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==rules)
        {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back)
        {
            setVisible(false);
        }
            
    }
    public static void main (String [] args)
    {
        new Login();
    }
              
}
