import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.*;

class Digitalclock extends JFrame
{
    JLabel l1,l2;
    SimpleDateFormat d1;
    Digitalclock(String s1)
    {
super (s1);
    }
    Digitalclock()
    {

    }
    void setComponents()
    {
        l1=new JLabel();
        l1.setFont(new Font("Verdana",Font.BOLD,40));
        Color c1=Color.WHITE;
        Color c2=c1.brighter();
         l1.setForeground(c2);
        l1.setBackground(Color.BLACK);
        l1.setOpaque(true);

        setLayout(null);
        add(l1);
        l1.setBounds(50,50,300,100);
        d1=new SimpleDateFormat("hh:mm:ss a");
       String time =d1.format(Calendar.getInstance().getTime());
        l1.setText(time);
        
while(true)
{
 time =d1.format(Calendar.getInstance().getTime());
 l1.setText(time);
try{
Thread.sleep(1000);
}
catch(Exception e1)
{

}
}//end of while loop
}//end of setcomponents
    public static void main(String[] args) 
   {
        Digitalclock d1=new Digitalclock("Digital CLock");  
        d1.setVisible(true); 
        d1.setSize (200,200);
        d1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d1.setComponents();
        

    }
}