import java.awt.*;
class awtexp extends Frame
{
	awtexp()
	{
		Button b = new Button("Click Me");
		b.setBounds(30,100,80,30);
		add(b);
		setSize(300,300);
		setTitle("Welcome to RSMl");
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String args[])
	{
		awtexp o=new awtexp();
	}
}