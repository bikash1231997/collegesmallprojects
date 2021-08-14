import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class cal extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5;
	Panel p1,p2,p3,p4;
	TextField f1,f2,f3;
	Label w1,w2,w3;
	
	cal()
	{
		setSize(2000,2000);
		setVisible(true);
		setLayout(new GridLayout(4,1));
		
		Font f= new Font("Arial",Font.PLAIN,20);
		
		w1=new Label("Enter the 1st number");
		w2=new Label("Enter the 2st number");
        w3=new Label("Result is");

		w1.setFont(f);
		w2.setFont(f);
		w3.setFont(f);
		
		f1=new TextField(20);
		f2=new TextField(20);
		f3=new TextField(20);
		
		f1.setFont(f);
		f2.setFont(f);
		f3.setFont(f);
		
		b1=new Button("Add");
		b2=new Button("Sub");
		b3=new Button("Mul");
		b4=new Button("Div");
		b5=new Button("Exit");
		
		
		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
		b4.setFont(f);
		b5.setFont(f);
		
		p1=new Panel(); 
		p1.setBackground(Color.RED);
	    p2=new Panel();
		p2.setBackground(Color.CYAN);
		p3=new Panel();
		p3.setBackground(Color.GREEN);
		p4=new Panel();
		p4.setBackground(Color.BLUE);
		
		p1.add(w1);
		p1.add(f1);
		p2.add(w2);
		p2.add(f2);
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		p3.add(b5);
		p4.add(w3);
		p4.add(f3);
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		
		pack();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent E)
	{
		if (E.getSource()==b1)
		{
			try
			{
				int a=Integer.parseInt(f1.getText());
				int b=Integer.parseInt(f2.getText());
				int c=a+b;
				
				f3.setText(" "+c);
			}
			catch (Exception e1)
			{
				e1.printStackTrace();
				
				f1.setText("");
				f2.setText("");
				f3.setText("");
			}
		}
		else if (E.getSource()==b2)
		{
			try
			{
				int a=Integer.parseInt(f1.getText());
				int b=Integer.parseInt(f2.getText());
				int c=a-b;
				
				f3.setText(" "+c);
			}
			catch (Exception e2)
			{
				e2.printStackTrace();
				
				f1.setText("");
				f2.setText("");
				f3.setText("");
			}
		}
		else if (E.getSource()==b3)
		{
			try
			{
				int a=Integer.parseInt(f1.getText());
				int b=Integer.parseInt(f2.getText());
				int c=a*b;
				
				f3.setText(" "+c);
			}
			catch (Exception e3)
			{
				e3.printStackTrace();

				f1.setText("");
				f2.setText("");
				f3.setText("");
			}
		}
		else if (E.getSource()==b4)
		{
			try
			{
				int a=Integer.parseInt(f1.getText());
				int b=Integer.parseInt(f2.getText());
				int c=a/b;
				
				f3.setText(" "+c);
			}
			catch (Exception e4)
			{
				e4.printStackTrace();

				f1.setText("");
				f2.setText("");
				f3.setText("");
			}
		}
		
		else if (E.getSource()==b5)
		{
			System.exit(0);
		}
	}
	public static void main(String args[])
	{
	 new cal();
	}
}
		
		
		