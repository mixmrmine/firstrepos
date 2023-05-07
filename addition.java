import java.awt.*;
import java.ext.*;
class addition extends Frame implements ActionListener
{
	
	Label l1;
	TextField t1;
	Label l1;
	TextField t2;
	Button b;
	Label l3;
	public void Addition()
	{
		setLayout(newFlowLayout());
		l1= new Label("First NUmber");
		t1= new TextField(20);
		l2= new Label("Second Number");
		t1= new TextField(20);
		b= new Button("add");
		l3 = new Label("Result");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(l3);
		b.addActionListener(this);
		setVisible(true);
		setSize(250,400);
	}

	public void actionPerformed(ActionEvent ae)
	{
		int num1= Integer.ParseInt(t1.getText());
		int num2= Integer.ParseInt(t2.getText());
		int value=num1+num2;

	}	

	public static void main(String args[])
	{
		new addition();
	}
}