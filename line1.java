import java.awt.*; 
import java.applet.*; 
//<applet code=line1 width=500 height=500> </applet> 
public class line1 extends Applet 
{ 
public void init() 
{ 
setBackground(Color.cyan); 
} 
public void paint(Graphics g) 
{ 
int x=250;
int y=200;
for(int i=0;i<=800;i++) 
{ 
double j=i*Math.PI/360; 
int x1=(int)(250-100*Math.sin(j)); 
int y1=(int)(200+100*Math.cos(j)); 
g.setColor(Color.red); 
g.drawLine(x1,y1,x,y);
try{ 
Thread.sleep(50); 
}catch(Exception e) 
{} 
g.setColor(Color.cyan); 
g.drawLine(x1,y1,x,y); 
} 
} 
}
