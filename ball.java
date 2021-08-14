import java.applet.*;
import java.awt.*;
public class ball extends Applet
{ 
public void init()
{
setBackground(Color.cyan);
setForeground(Color.red);
}
public void paint(Graphics g) 
{ 
for(int i=0;i<900;i++) 
{ 
g.setColor(Color.red); 
g.fillOval(i,40,100,100); 
try{ 
Thread.sleep(50); 
}catch(Exception e) 
{} 
g.setColor(Color.cyan); 
g.fillOval(i,40,100,100); 
} 
}
}
<applet code=ball.class width=400 height=300> </applet>
