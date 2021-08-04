package tourandtravel;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
    JProgressBar p;
    Thread t;
    String username;
     
    public void run(){
        try{
          for(int i=1;i<=101;i++){
              int m = p.getMaximum();
              int n =p.getValue();
              if(n<m){
                  p.setValue(p.getValue() + 1);
              }else{
                  i=101;
                  setVisible(false);
                  new Dashboard(username).setVisible(true);
              }
              Thread.sleep(50);
          }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
        
        
        Loading(String user){
        username = user;
        t=new Thread(this);
        
        setBounds(300, 250,900,450);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1= new JLabel("TRVELMANIA");
        l1.setBounds(310, 40,700,40);
        l1.setFont(new Font("Ralway",Font.BOLD, 40));
        l1.setForeground(Color.BLUE);
        add(l1);
        
        p = new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(250, 150, 400, 25);
        add(p);
        
        JLabel l2= new JLabel("Please Wait..");
        l2.setBounds(400, 185,100,25);
        l2.setFont(new Font("Tahoma",Font.BOLD, 14));
        l2.setForeground(Color.RED);
        add(l2);
        
        JLabel l3= new JLabel("Welcome "+ username);
        l3.setBounds(20, 350,400,25);
        l3.setFont(new Font("Tahoma",Font.BOLD, 14));
        l3.setForeground(Color.RED);
        add(l3);
        
        t.start();
        
    }
    
    public static void main(String[] args){
        new Loading("").setVisible(true);
    }
}
