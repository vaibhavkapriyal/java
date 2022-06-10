import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class A extends JFrame implements ActionListener
{
	JTextField tf1,tf2,tf3;
	
	A()
	{
		JLabel l1=new JLabel("Frist no.");
		JLabel l2=new JLabel("Second no.");
		JLabel l3=new JLabel("Result");
		
		tf1=new JTextField(20);
		tf2=new JTextField(20);
		tf3=new JTextField(20);
		
		JButton b1=new JButton("SUM");
		JButton b2=new JButton("SUB");
		JButton b3=new JButton("MULTIPLY");
		JButton b4=new JButton("DIVIDE");
		JButton b5=new JButton("EXIT");
		
		setLayout(new FlowLayout());
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		b1.addActionListener(this);
		add(b1);
		b2.addActionListener(this);
		add(b2);
		b3.addActionListener(this);
		add(b3);
		b4.addActionListener(this);
		add(b4);
		b5.addActionListener(this);
		add(b5);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		int result=0;
		if(s.equals("SUM"))
		{
			result=Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText());
			
		}
		
		if(s.equals("SUB"))
		{
			result=Integer.parseInt(tf1.getText())-Integer.parseInt(tf2.getText());
			
		}
		if(s.equals("MULTIPLY"))
		{
			result=Integer.parseInt(tf1.getText())*Integer.parseInt(tf2.getText());
			
		}
		if(s.equals("DIVIDE"))
		{
			result=Integer.parseInt(tf1.getText())/Integer.parseInt(tf2.getText());
			
		}
		if(s.equals("EXIT"))
		{
			System.exit(0);
		}
		tf3.setText(Integer.toString(result));
	}
	public static void main(String args[])
	{
		A a=new A();
		a.setSize(500,500);
		a.setVisible(true);
	}
}
