package tictactoegame2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class GamePanel implements ActionListener
{
    String str="",title_str="";
    int count=0;
    JFrame jf;
    JButton j1,j2,j3,j4,j5,j6,j7,j8,j9;
    boolean win=false;
    Color Color1;
    String player1,player2;
    String player;
    boolean firstturn=true;
    
    GamePanel(String player1,String player2)
    {
//        try
//        {
//             UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//        }
//        catch(Exception e)   
//        {
//            System.out.println(e);
//        }
        this.player1=player1;
        this.player2=player2;
        
        
    } 
    void openGamePanel1()
    {
        jf=new JFrame();
        jf.setTitle(player1+" (x) turns");
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gd=new GridLayout(3,3);
        jf.setLayout(new GridLayout(3,3));
        
        j1=new JButton();
        j1.addActionListener(this);
        jf.add(j1);
        
        j2=new JButton();
        j2.addActionListener(this);
        jf.add(j2);
        
        j3=new JButton();
        j3.addActionListener(this);
        jf.add(j3);
        
        j4=new JButton();
        j4.addActionListener(this);
        jf.add(j4);
        
        j5=new JButton();
        j5.addActionListener(this);
        jf.add(j5);
        
        j6=new JButton();
        j6.addActionListener(this);
        jf.add(j6);
        
        j7=new JButton();
        j7.addActionListener(this);
        jf.add(j7);
        
        j8=new JButton();
        j8.addActionListener(this);
        jf.add(j8);
        
        j9=new JButton();
        j9.addActionListener(this);
        jf.add(j9);
          
        jf.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        count=count+1;
        if(firstturn==true)
        {
            str="X";
            Color1=Color.red;
            title_str="0";
            jf.setTitle(player2+" ("+title_str+")Turn");
           
            firstturn=false;
        }
        else
        {
               str="0";
            Color1=Color.CYAN;
            title_str="X";
        
            jf.setTitle(player1+" ("+title_str+") Turn");
            
            firstturn=true;
        }
       if(ae.getSource()==j1)
       {
           j1.setBackground(Color1);
           j1.setText(str);
           Font f=new Font("Arial", 1, 50);
           j1.setFont(f);
           j1.setEnabled(false);
       }
       if(ae.getSource()==j2)
       {
            j2.setBackground(Color1);
           j2.setText(str);
           Font f=new Font("Arial", 1, 50);
           j2.setFont(f);
           j2.setEnabled(false);
       }
       if(ae.getSource()==j3)
       {
            j3.setBackground(Color1);
           j3.setText(str);
           Font f=new Font("Arial", 1, 50);
           j3.setFont(f);
           j3.setEnabled(false);
       }
       if(ae.getSource()==j4)
       {
            j4.setBackground(Color1);
           j4.setText(str);
           Font f=new Font("Arial", 1, 50);
           j4.setFont(f);
           j4.setEnabled(false);
       }
       if(ae.getSource()==j5)
       {
            j5.setBackground(Color1);
           j5.setText(str);
           Font f=new Font("Arial", 1, 50);
           j5.setFont(f);
           j5.setEnabled(false);
       }
       if(ae.getSource()==j6)
       {
            j6.setBackground(Color1);
           j6.setText(str);
           Font f=new Font("Arial", 1, 50);
           j6.setFont(f);
           j6.setEnabled(false);
       }
       if(ae.getSource()==j7)
       {
            j7.setBackground(Color1);
           j7.setText(str);
           Font f=new Font("Arial", 1, 50);
           j7.setFont(f);
           j7.setEnabled(false);
       }
       if(ae.getSource()==j8)
       {
            j8.setBackground(Color1);
           j8.setText(str);
           Font f=new Font("Arial", 1, 50);
           j8.setFont(f);
           j8.setEnabled(false);
       }
       if(ae.getSource()==j9)
       {
            j9.setBackground(Color1);
           j9.setText(str);
           Font f=new Font("Arial", 1, 50);
           j9.setFont(f);
           j9.setEnabled(false);
       } 
       winningPossibilities();
       whoWins();
    } 
    void winningPossibilities()
    {
        if(j1.getText()==j2.getText() && j2.getText()==j3.getText() && j1.getText()!="")
        {
            win=true;
        }
        else if(j4.getText()==j5.getText() && j5.getText()==j6.getText() && j5.getText()!="")
        {
            win=true;            
        }
        else if(j7.getText()==j8.getText() && j8.getText()==j9.getText() && j8.getText()!="")
        {
            win=true;
        }
        //vertical winning possibilities
        else if(j2.getText()==j5.getText() && j5.getText()==j8.getText() && j2.getText()!="")
        {
            win=true;
        }
        else if(j3.getText()==j6.getText() && j6.getText()==j9.getText() && j9.getText()!="")
        {
            win=true;
        }
        else if(j1.getText()==j4.getText() && j4.getText()==j7.getText() && j1.getText()!="")
        {            
            win=true;
        }
        //cross winning possibilities
        else if(j1.getText()==j5.getText() && j5.getText()==j9.getText() && j1.getText()!="")
        {
            win=true;
        }
        else if(j3.getText()==j5.getText() && j5.getText()==j7.getText() && j7.getText()!="")
        {
            win=true;
        }
        //draw game
        else
        {
            win=false;
        }
    } 
    void whoWins()
    {
        if(win==true)
        {
            
            if(str.equals("0"))
            {
                player=player2;
            }
            else
            {
                player=player1;
            }
            
            String win_title=player+"("+str+")"+"Wins";
            JOptionPane.showMessageDialog(jf,win_title);
            restartGame();
        }
        else if(win==false && count==10)
        {
           
        } 
        else if(win==false && count==9)
        {
            JOptionPane.showMessageDialog(jf,"Match Draw");
            restartGame();
        }
    }
    void restartGame()
    {
        int i=JOptionPane.showConfirmDialog(jf,"Do you want to restart the game ?");
        if(i==0)
        {
           j1.setText("");
           j2.setText("");
           j3.setText("");
           j4.setText("");
           j5.setText("");
           j6.setText("");
           j7.setText("");
           j8.setText("");
           j9.setText("");
           
           j1.setBackground(null);
           j2.setBackground(null);
           j3.setBackground(null);
           j4.setBackground(null);
           j5.setBackground(null);
           j6.setBackground(null);
           j7.setBackground(null);
           j8.setBackground(null);
           j9.setBackground(null);
           
           
          
           btnSetEnablin(true);
           count=0;
           
           
           //str=str;
//           player2=player1;
//           player1=player;
           
           if(!player.equals(player1))
           {
           player2=player1;
           player1=player;
           count=1;  
           }
           else
           {
               player1=player2;
               player2=player;
               count=0;
           }
           
           jf.setTitle(player+" ("+str+") turns");
           win=false;
           
        }
        else if(i==1)
        {
            System.exit(0);
        }
        else
        {
            btnSetEnablin(false);
        }           
    }
    void btnSetEnablin(boolean b)
    {
         j1.setEnabled(b);
         j2.setEnabled(b);
         j3.setEnabled(b);
         j4.setEnabled(b);
         j5.setEnabled(b);
         j6.setEnabled(b);
         j7.setEnabled(b);
         j8.setEnabled(b);
         j9.setEnabled(b); 
    }
}
