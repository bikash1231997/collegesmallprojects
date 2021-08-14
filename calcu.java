import java.awt.*;
import java.awt.event.*;
 
class calcu implements ActionListener
{

	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	

	Button b1=new Button("Add");
	Button b2=new Button("Sub");
	Button b3=new Button("Mul");
	Button b4=new Button("Division");
	Button b5=new Button("Exit");
	
	Frame f=new Frame();
	Label l1=new Label("Enter the 1st Number");
	Label l2=new Label("Enter the 2nd Number");
	Label l3=new Label("Result is");
	
	
	
	calcu()
	{
	
		l1.setBounds(35,80,140,30);
		l2.setBounds(35,120,140,30);
		l3.setBounds(35,160,80,20);
		
		t1.setBounds(185,80,80,20);
		t2.setBounds(185,120,80,20);
		t3.setBounds(185,160,80,20);
		
		b1.setBounds(50,250,50,20);
		b2.setBounds(110,250,50,20);
		b3.setBounds(170,250,50,20);
		b4.setBounds(230,250,50,20);
		b5.setBounds(140,280,50,20);
		
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,350);
		f.setBackground(Color.black);
		f.setTitle("Calcutor");
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		
		if(e.getSource()==b1)
		{
			t3.setText(String.valueOf(n1+n2));
		}
			
		if(e.getSource()==b2)
		{
			t3.setText(String.valueOf(n1-n2));
		}
		
		if(e.getSource()==b3)
		{
			t3.setText(String.valueOf(n1*n2));
		}
		
		if(e.getSource()==b4)
		{
			t3.setText(String.valueOf(n1/n2));
		}
		
		if(e.getSource()==b5)
		{
			System.exit(0);
		}
	}
	
	public static void main(String args[])
	{
		new calcu();
	
	}
}
