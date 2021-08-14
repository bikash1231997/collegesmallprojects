import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
//<applet code=hello width=500 height=500 > </applet> 
public class hello extends Applet implements MouseListener 
{ 
int x,y; 
public void init() 
{ 
addMouseListener(this); 
setBackground(Color.cyan); 
} 
public void paint(Graphics g) 
{ 
g.drawString("HELLO",x,y); 
} 
public void mouseClicked(MouseEvent me) 
{ 
x=me.getX(); 
y=me.getY(); 
repaint(); 
}
public void mousePressed(MouseEvent me) 
{ 
} 
public void mouseReleased(MouseEvent me) 
{ 
} 
public void mouseEntered(MouseEvent me) 
{ 
} 
public void mouseExited(MouseEvent me) 
{ 
} 
}
