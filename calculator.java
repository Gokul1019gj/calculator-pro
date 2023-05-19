import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class calculator implements ActionListener {

    JFrame jf;
    JLabel disp;
    JButton sevenbtn;
    JButton eightbtn;
    JButton ninebtn;
    JButton fourbtn;
    JButton fivebtn;
    JButton sixbtn;
    JButton onebtn;
    JButton twobtn;
    JButton threebtn;
    JButton zerobtn;
    JButton dotbtn;
    JButton equalbtn;
    JButton plusbtn;
    JButton minusbtn;
    JButton divbtn;
    JButton multiplebtn;
    JButton clearbtn;

    boolean isoprtr=false;

    String oldval;
    String newval;
    String optype;
    float newv;
    float old;
    float res;

    public void result(float x,float y){

        if(optype=="+"){
            res=x+y;
            disp.setText(res+"");

        }
        else if(optype=="-"){
            res=x-y;
            disp.setText(res+"");

        }else if(optype=="/"){
            res=x/y;
            disp.setText(res+"");

        }else if(optype=="*"){
            res=x*y;
            disp.setText(res+"");

        }




     }
    calculator(){

       jf=new JFrame("calculator");
        jf.setLayout(null);
        jf.setSize(700,600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


      disp=new JLabel();
        disp.setBounds(30, 50, 540, 60);
        disp.setBackground(Color.DARK_GRAY);
        disp.setForeground(Color.white);
        disp.setOpaque(true);
        disp.setHorizontalAlignment(SwingConstants.RIGHT);

        jf.add(disp);

        sevenbtn=new JButton("7");
        sevenbtn.setBounds(30, 130, 80, 80);
        sevenbtn.setFont(new Font("Arial",Font.PLAIN,40));
        sevenbtn.addActionListener(this);
        jf.add(sevenbtn);

        eightbtn=new JButton("8");
        eightbtn.setBounds(140, 130, 80, 80);
        eightbtn.setFont(new Font("Arial",Font.PLAIN,40));
        eightbtn.addActionListener(this);
        jf.add(eightbtn);

         ninebtn=new JButton("9");
        ninebtn.setBounds(250, 130, 80, 80);
       ninebtn.setFont(new Font("Arial",Font.PLAIN,40));
       ninebtn.addActionListener(this);
        jf.add(ninebtn);

         fourbtn=new JButton("4");
        fourbtn.setBounds(30, 240, 80, 80);
        fourbtn.setFont(new Font("Arial",Font.PLAIN,40));
        fourbtn.addActionListener(this);
        jf.add(fourbtn);

        fivebtn=new JButton("5");
        fivebtn.setBounds(140, 240, 80, 80);
        fivebtn.setFont(new Font("Arial",Font.PLAIN,40));
        fivebtn.addActionListener(this);
        jf.add(fivebtn);

        sixbtn=new JButton("6");
        sixbtn.setBounds(250, 240, 80, 80);
        sixbtn.setFont(new Font("Arial",Font.PLAIN,40));
        sixbtn.addActionListener(this);
        jf.add(sixbtn);


         onebtn=new JButton("1");
        onebtn.setBounds(30, 350, 80, 80);
        onebtn.setFont(new Font("Arial",Font.PLAIN,40));
        onebtn.addActionListener(this);
        jf.add(onebtn);
         twobtn=new JButton("2");
        twobtn.setBounds(140, 350, 80, 80);
        twobtn.setFont(new Font("Arial",Font.PLAIN,40));
        twobtn.addActionListener(this);
        jf.add(twobtn);
         threebtn=new JButton("3");
        threebtn.setBounds(250, 350, 80, 80);
        threebtn.setFont(new Font("Arial",Font.PLAIN,40));
        threebtn.addActionListener(this);
        jf.add(threebtn);



         zerobtn=new JButton("0");
        zerobtn.setBounds(30, 460, 80, 80);
        zerobtn.setFont(new Font("Arial",Font.PLAIN,40));
        zerobtn.addActionListener(this);
        jf.add(zerobtn);
         dotbtn=new JButton(".");
        dotbtn.setBounds(140, 460, 80, 80);
        dotbtn.setFont(new Font("Arial",Font.PLAIN,40));
        dotbtn.addActionListener(this);
        jf.add(dotbtn);
        equalbtn=new JButton("=");
        equalbtn.setBounds(250, 460, 80, 80);
        equalbtn.setFont(new Font("Arial",Font.PLAIN,40));
        equalbtn.addActionListener(this);
        jf.add(equalbtn);



         plusbtn=new JButton("+");
        plusbtn.setBounds(360, 130, 80, 80);
       plusbtn.setFont(new Font("Arial",Font.PLAIN,40));
       plusbtn.addActionListener(this);
        jf.add(plusbtn);

         minusbtn=new JButton("-");
        minusbtn.setBounds(360, 240, 80, 80);
       minusbtn.setFont(new Font("Arial",Font.PLAIN,40));
       minusbtn.addActionListener(this);
        jf.add(minusbtn);

        divbtn=new JButton("/");
        divbtn.setBounds(360, 350, 80, 80);
       divbtn.setFont(new Font("Arial",Font.PLAIN,40));
       divbtn.addActionListener(this);
        jf.add(divbtn);

       multiplebtn=new JButton("*");
        multiplebtn.setBounds(360, 460, 80, 80);
        multiplebtn.setFont(new Font("Arial",Font.PLAIN,40));
        multiplebtn.addActionListener(this);
  
        jf.add(multiplebtn);

        clearbtn=new JButton("C");
        clearbtn.setBounds(500, 460, 80, 80);
        clearbtn.setFont(new Font("Arial",Font.PLAIN,40));
        clearbtn.addActionListener(this);
      
        jf.add(clearbtn);



    }
    
 
    public static void main(String[] args) {
        new calculator();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

         if(e.getSource()==sevenbtn)
                   if(isoprtr)
                   {
                       disp.setText("7");
                       isoprtr=false;
                    } 
        else
         disp.setText(disp.getText()+"7");
         else if(e.getSource()==eightbtn)
         if(isoprtr)
                   {
                       disp.setText("8");
                       isoprtr=false;
                    } 
        else
         disp.setText(disp.getText()+"8");
         else if(e.getSource()==ninebtn)
         if(isoprtr)
                   {
                       disp.setText("9");
                       isoprtr=false;
                    } 
        else
         disp.setText(disp.getText()+"9");
         else if(e.getSource()==fourbtn)
         if(isoprtr)
                   {
                       disp.setText("4");
                       isoprtr=false;
                    } 
        else
         disp.setText(disp.getText()+"4");
         else if(e.getSource()==fivebtn)
         if(isoprtr)
                   {
                       disp.setText("5");
                       isoprtr=false;
                    } 
        else
         disp.setText(disp.getText()+"5");
         else if(e.getSource()==sixbtn)
         if(isoprtr)
                   {
                       disp.setText("6");
                       isoprtr=false;
                    } 
        else
         disp.setText(disp.getText()+"6");
         else if(e.getSource()==onebtn)
         if(isoprtr)
                   {
                       disp.setText("1");
                       isoprtr=false;
                    } 
        else
         disp.setText(disp.getText()+"1");
         else if(e.getSource()==twobtn)
         if(isoprtr)
                   {
                       disp.setText("2");
                       isoprtr=false;
                    } 
        else
         disp.setText(disp.getText()+"2");
         else if(e.getSource()==threebtn)
         if(isoprtr)
                   {
                       disp.setText("3");
                       isoprtr=false;
                    } 
        else
         disp.setText(disp.getText()+"3");
         else if(e.getSource()==zerobtn)
         if(isoprtr)
                   {
                       disp.setText("0");
                       isoprtr=false;
                    } 
        else
         disp.setText(disp.getText()+"0");
         else if(e.getSource()==dotbtn)
         if(isoprtr)
                   {
                       disp.setText(".");
                       isoprtr=false;
                    } 
        else
         disp.setText(disp.getText()+".");
         else if(e.getSource()==equalbtn){

            newval=disp.getText();
             old=Float.parseFloat(oldval);
            newv=Float.parseFloat(newval);
            result(old, newv);


          


         }

         else if(e.getSource()==plusbtn){
            
            optype="+";


            oldval=disp.getText();
             isoprtr=true;

         }
         else if(e.getSource()==minusbtn){
            optype="-";
            oldval=disp.getText();
            isoprtr=true;

         }
         else if(e.getSource()==multiplebtn){
            optype="*";
            oldval=disp.getText();
            isoprtr=true;

         }
         else if(e.getSource()==divbtn){
            optype="/";
            oldval=disp.getText();
            isoprtr=true;

         }
         else if(e.getSource()==clearbtn)
         disp.setText("");


        
        
    }
}
