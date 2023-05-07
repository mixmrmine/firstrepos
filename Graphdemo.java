import java.awt.*;

class Graphdemo extends Frame
{
	Graphdemo()
	{
	setSize(500,500);
	setTitle("The Use Of Graphic Class");
	setLayout(null);
	setVisible(true);
	}
	public void paint (Graphics g)
	{
		g.setColor(Color.red);
		g.drawLine(100,100,200,250);
		g.setColor(Color.yellow);
		g.fillRect(200,200,100,100);
		g.setColor(Color.green);
		g.fillOval(300,100,80,80);
	}
	public static void main(String arg[])
	{
		Graphdemo g1 = new Graphdemo();
	}
}