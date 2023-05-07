import java.awt.*;
public class jsml extends Frame
{
    jsml()
    {
        setTitle("Hello Work");
        setLayout(null);
        setSize(400,400);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(20,50,80,90);
       
    }
    public static void main(String args[])
    {
        new jsml();
    }
}