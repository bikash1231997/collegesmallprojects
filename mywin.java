import java.awt.*; 
import java.awt.event.*; 
public class mywin extends Frame implements ActionListener 
{ 
Button ext; 
Label lbl; 
mywin() 
{ 
ext=new Button("Exit"); 
lbl=new Label("Click Here To Close "); 
setLayout(null); 
lbl.setBounds(160,150,140,20); 
ext.setBounds(200,180,60,20); 
add(ext);
add(lbl); 
ext.addActionListener(this); 
} 
public void actionPerformed(ActionEvent ae) 
{ 
System.exit(0); 
} 
public static void main(String args[]) 
{ 
mywin ob=new mywin(); 
ob.setSize(800,800); 
ob.setTitle("My Frame"); 
ob.setVisible(true); 
ob.setBackground(Color.cyan); 
} 
}
