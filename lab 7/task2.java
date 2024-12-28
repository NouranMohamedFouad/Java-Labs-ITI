import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;


public class task2 extends JFrame implements Runnable
{
    Thread th; 
    JLabel timeLabel = new JLabel();
    public task2()
    {
        this.setTitle("Banner Application");
        this.add(timeLabel,BorderLayout.CENTER);
        th = new Thread(this);
        th.start();
    }

    public void run()
    {
        String message="hello java";
        int x = 0;

        while(true)
        {
            x+=5;
            if (x>=600) {
                x =-200; 
            }
            
            timeLabel.setBounds(x, 100, 200, 50); 
            timeLabel.setText(message);

            try 
            {
                Thread.sleep(200);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            } 
        }
    }

    public static void main(String[] args)
    {
        task2 app = new task2();
        app.setBounds(50,50,600,400);
        app.setVisible(true);
    }
}    