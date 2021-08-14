import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
//<applet code=crect width=500 height=500 > </applet> 
public class crect extends Applet implements MouseListener 
{ 
int x1,y1,x2,y2; 
public void init() 
{ 
addMouseListener(this); 
setBackground(Color.cyan); 
} 
public void paint(Graphics g) 
{ 
int x,y;
if(x1<x2&&y1<y2) 
g.drawRect(x1,y1,x2-x1,y2-y1); 
else if(x1>x2&&y1>y2) 
g.drawRect(x2,y2,x1-x2,y1-y2); 
else if(x1>x2&&y1<y2) 
g.drawRect(x2,y1,x1-x2,y2-y1); 
else 
g.drawRect(x1,y2,x2-x1,y1-y2); 
} 
public void mouseClicked(MouseEvent me) 
{ 
} 
public void mousePressed(MouseEvent me) 
{ 
x1=me.getX(); 
y1=me.getY(); 
} 
public void mouseReleased(MouseEvent me) 
{ 
x2=me.getX(); 
y2=me.getY(); 
repaint(); 
} 
public void mouseEntered(MouseEvent me) 
{
} 
public void mouseExited(MouseEvent me) 
{ 
} 
}
