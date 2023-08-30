package word_count;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
public class Cuonter extends JFrame implements ActionListener{
    JLabel lb1,lb2;
    JTextArea ta;
    JButton b;
    JButton pad,text;
    Cuonter(){
        super("Word counting tool");
        lb2=new JLabel("Word Counter : Enter a sentence");
        lb2.setBounds(30,60,200,20);
        
        lb1=new JLabel("No. of Words: ");
        lb1.setBounds(50,80,100,20);

        ta=new JTextArea();
        ta.setBounds(50,110,300,200);

        b=new JButton("Count");
        b.setBounds(50,320, 80,30);
        b.addActionListener(this);

        add(lb1);add(ta);add(b);add(lb2);

        setSize(400,400);
        setLayout(null);//using no layout manager  
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
      
            String text=ta.getText();
            String words[]=text.split("\\s");
            lb1.setText("No.of Words: "+words.length);
            
			   
            }
 
          
     
    	
    
    public static void main(String[] args) {
        new Cuonter();
        
    }}



