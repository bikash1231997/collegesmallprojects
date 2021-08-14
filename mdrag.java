import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
//<applet code=mdrag width=500 height=500 > </applet> 
public class mdrag extends Applet implements MouseMotionListener 
{
int x1,y1,x2,y2; 
int v=0; 
public void init() 
{ 
addMouseMotionListener(this); 
setBackground(Color.cyan); 
} 
public void paint(Graphics g) 
{ 
g.drawLine(x1,y1,x2,y2); 
} 
public void mouseMoved(MouseEvent me) 
{ 
} 
public void mouseDragged(MouseEvent me) 
{ 
if(v==0) 
{ 
x1=me.getX(); 
y1=me.getY(); 
v++; 
} 
else 
{
x2=me.getX(); 
y2=me.getY(); 
repaint(); 
} 
} 
}
