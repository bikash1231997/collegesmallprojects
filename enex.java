import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
//<applet code=enex width=500 height=500 > </applet> 
public class enex extends Applet implements MouseListener 
{ 
int x,y; 
public void init() 
{ 
addMouseListener(this); 
setBackground(Color.cyan); 
} 
public void paint(Graphics g) 
{
g.setColor(Color.blue); 
} 
public void mouseClicked(MouseEvent me) 
{ 
} 
public void mousePressed(MouseEvent me) 
{ 
} 
public void mouseReleased(MouseEvent me) 
{ 
} 
public void mouseEntered(MouseEvent me) 
{ 
setBackground(Color.red); 
} 
public void mouseExited(MouseEvent me) 
{ 
setBackground(Color.yellow); 
} 
}
