import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
//<applet code=cstar width=500 height=500> </applet> 
public class cstar extends Applet implements MouseListener
{ 
int x,y; 
public void init() 
{ 
addMouseListener(this); 
setBackground(Color.cyan); 
} 
public void update(Graphics g) 
{ 
paint(g); 
} 
public void paint(Graphics g) 
{ 
g.drawString("*",x,y); 
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
