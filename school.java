import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.print.*;
import java.awt.print.*;
import java.io.IOException;

class school extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5;
	Panel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15;
	TextField f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14;
	Label w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11,w12,w13,w14;
	
		
	school()
	{
		setSize(1500,1500);
		setVisible(true);
		setLayout(new GridLayout(15,1));
		
		Font f= new Font("Arial",Font.PLAIN,20);
		Font g= new Font("Arial",Font.BOLD,20);
		
		w1=new Label("Enter the Sl.no");
		w2=new Label("Enter the Admission No.");
        w3=new Label("Enter the Admission date");
		w4=new Label("Enter the Admission No.");
        w5=new Label("Enter the Admission class");
		w6=new Label("Enter the Student Name");
        w7=new Label("Enter the Fathers Name");
		w8=new Label("Enter the Mothers Name");
        w9=new Label("Enter the Guardian Name");
		w10=new Label("Enter the D.O.B");
		w11=new Label("Enter the Category");
        w12=new Label("Enter the Cast");
		w13=new Label("Enter the Religion");
        w14=new Label("Enter the Sex");
  
  
  
		w1.setFont(f);
		w2.setFont(f);
		w3.setFont(f);
		w4.setFont(f);
		w5.setFont(f);
		w6.setFont(f);
		w7.setFont(f);
		w8.setFont(f);
		w9.setFont(f);
		w10.setFont(f);
		w11.setFont(f);
		w12.setFont(f);
		w13.setFont(f);
		w14.setFont(f);
		
		f1=new TextField(20);
		f2=new TextField(20);
		f3=new TextField(20);
		f4=new TextField(20);
		f5=new TextField(20);
		f6=new TextField(20);
		f7=new TextField(20);
		f8=new TextField(20);
		f9=new TextField(20);
		f10=new TextField(20);
		f11=new TextField(20);
		f12=new TextField(20);
		f13=new TextField(20);
		f14=new TextField(20);
		
		
		f1.setFont(f);
		f2.setFont(f);
		f3.setFont(f);
		f4.setFont(f);
		f5.setFont(f);
		f6.setFont(f);
		f7.setFont(f);
		f8.setFont(f);
		f9.setFont(f);
		f10.setFont(f);
		f11.setFont(f);
		f12.setFont(f);
		f13.setFont(f);
		f14.setFont(f);
		
		
		b1=new Button("open a prog");
		b2=new Button("Print");
		b3=new Button("Clear");
		b4=new Button("Exit");
		b5=new Button("Save");
		
		
		b1.setFont(g);
		b2.setFont(g);
		b3.setFont(g);
		b4.setFont(g);
		b5.setFont(g);
		
		
		p1=new Panel(); 
	    p2=new Panel();
		p3=new Panel();
		p4=new Panel();
		p5=new Panel();
		p6=new Panel();
		p7=new Panel(); 
		p8=new Panel();
		p9=new Panel();
		p10=new Panel();
		p11=new Panel();
		p12=new Panel();
		p13=new Panel();
		p14=new Panel();
		p15=new Panel();
			
		p1.add(w1);
		p1.add(f1);
		p2.add(w2);
		p2.add(f2);
		p3.add(w3);
		p3.add(f3);
		p4.add(w4);
		p4.add(f4);
		p5.add(w5);
		p5.add(f5);
		p6.add(w6);
		p6.add(f6);
		p7.add(w7);
		p7.add(f7);
		p8.add(w8);
		p8.add(f8);
		p9.add(w9);
		p9.add(f9);
		p10.add(w10);
		p10.add(f10);
		p11.add(w11);
		p11.add(f11);
		p12.add(w12);
		p12.add(f12);
		p13.add(w13);
		p13.add(f13);
		p14.add(w14);
		p14.add(f14);
		p15.add(b1);
		p15.add(b2);
		p15.add(b3);
		p15.add(b4);
		p15.add(b5);
				
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(p7);
		add(p8);
		add(p9);
		add(p10);
		add(p11);
		add(p12);
		add(p13);
		add(p14);
		add(p15);
		
		pack();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		
	}
	public void clearfields()
	{
		f1.setText(" ");
		f2.setText(" ");
		f3.setText(" ");
		f4.setText(" ");
		f5.setText(" ");
		f6.setText(" ");
		f7.setText(" ");
		f8.setText(" ");
		f9.setText(" ");
		f10.setText(" ");
		f11.setText(" ");
		f12.setText(" ");
		f13.setText(" ");
		f14.setText(" ");
	}
	
	public void printComponent()
	{
		PrinterJob pj = PrinterJob.getPrinterJob();
		pj.setJobName(" Print Component ");

		pj.setPrintable (new Printable()
		{    
			public int print(Graphics pg, PageFormat pf, int pageNum)
			{
				if (pageNum > 0) return Printable.NO_SUCH_PAGE;

				Graphics2D g2 = (Graphics2D) pg;
				g2.translate(pf.getImageableX(), pf.getImageableY());
				b2.paint(g2);
				return Printable.PAGE_EXISTS;
			}
		});

	if (pj.printDialog() == false) return;

		try 
			{
				pj.print();
			} catch (PrinterException ex) {
		// handle exception
  }
}
	
	public void actionPerformed(ActionEvent E)
	{
		if (E.getSource()==b1)
		{
			try
			{
				String command = "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe";
				
				Runtime run = Runtime.getRuntime();
				Process pro = run.exec(command);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		else if (E.getSource()==b2)
		{
			printComponent();
		}
		else if (E.getSource()==b3)
		{
			clearfields();	           
		}
		
		else if (E.getSource()==b4)
		{
			System.exit(0);
		}
		else if (E.getSource()==b5)
		{
		/*	jdbc j = new jdbc();
			j.setVisible(true); */
		}
		
	}
	
	public static void main(String args[])
	{
	 new school();
	}
}
		
		
		