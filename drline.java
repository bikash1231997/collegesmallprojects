import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
//<applet code=drline width=500 height=500> </applet> 
public class drline extends Applet implements MouseListener 
{
int x1,y1,x2,y2; 
public void init() 
{ 
addMouseListener(this); 
setBackground(Color.cyan); 
} 
public void paint(Graphics g) 
{ 
g.drawLine(x1,y1,x2,y2); 
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
