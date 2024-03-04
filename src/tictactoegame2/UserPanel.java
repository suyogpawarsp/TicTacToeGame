package tictactoegame2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.*;

public class UserPanel implements ActionListener
{
    JFrame jf;
    JTextField jt1, jt2;
    JButton jb;
    JLabel jl1,jl2; 
    
    UserPanel()
    {
        jf=new JFrame("Tic Tac Toe Game by Suyog");
        jf.setSize(500,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        
        jl1=new JLabel("Enter Player One Name : ");
        jl1.setBounds(50,80,150,30);
        jf.add(jl1);
        
        jt1=new JTextField();
        jt1.setBounds(200,80,200,30);
        jf.add(jt1);
        
        jl2=new JLabel("Enter Player One Name : ");
        jl2.setBounds(50,140,150,30);
        jf.add(jl2);
        
        jt2=new JTextField();
        jt2.setBounds(200,140,200,30);
        jf.add(jt2);
        
        jb=new JButton("Click Me");
        jb.setBounds(180, 210, 100, 30);
        jb.addActionListener(this);
        jf.add(jb);
       
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource()==jb)
       {
           String player1=jt1.getText();
           String player2=jt2.getText();
           
           GamePanel gp=new GamePanel(player1,player2);
           gp.openGamePanel1();
           jf.setVisible(false);
       }
    }
}
