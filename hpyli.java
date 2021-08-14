import java.awt.*; 
import java.applet.*; 
//<applet code=hpyli width=300 height=200> </applet> 
public class hpyli extends Applet implements Runnable 
{ 
Thread ob; 
String nm="HAPPY HOLI "; 
boolean flag; 
public void init() 
{ 
setBackground(Color.cyan); 
setForeground(Color.blue); 	
setFont(new Font("Arial",Font.BOLD,24)); 
} 
public void paint(Graphics g) 
{
g.drawString(nm,40,120); 
} 
public void start() 
{ 
flag=true; 
ob=new Thread(this); 
ob.start(); 
} 
public void stop() 
{ 
flag=false; 
} 
public void run() 
{ 
char ch; 
while(flag) 
{ 
ch=nm.charAt(0); 
nm=nm.substring(1); 
nm+=ch; 
try{ 
Thread.sleep(400); 
}catch(Exception e) 
{} 
repaint();
} 
} 
}

