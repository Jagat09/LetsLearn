import java.awt.*;
import java.applet.*;
public class newpolygon extends Applet
{
  public void paint(Graphics g)
  {
     int x1[]={200,500,500,300,200};
     int y1[]={200,200,300,300,200};
     
     int x2[]={500,600,500,500};
     int y2[]={200,300,300,200};

     int x3[]={500,600,600,500,500};
     int y3[]={300,300,500,400,300};

     int x4[]={300,500,600,300,300};
     int y4[]={400,400,500,500,400};

     int x5[]={200,300,300,200};
     int y5[]={400,400,500,400};
   
     int x6[]={200,300,300,200,200};
     int y6[]={200,300,400,400,200};

     int x7[]={300,500,500,300,300};
     int y7[]={300,300,400,400,300};

     g.drawPolygon(x1,y1,5);
     g.setColor(Color.black);
     g.fillPolygon(x1,y1,5);

     g.drawPolygon(x2,y2,4);
     g.setColor(Color.pink);
     g.fillPolygon(x2,y2,4);

     g.drawPolygon(x3,y3,5);
     g.setColor(Color.blue);
     g.fillPolygon(x3,y3,5);

     g.drawPolygon(x4,y4,5);
     g.setColor(Color.green);
     g.fillPolygon(x4,y4,5);
   
     g.drawPolygon(x5,y5,4);
     g.setColor(Color.yellow);
     g.fillPolygon(x5,y5,4);

     g.drawPolygon(x6,y6,5);
     g.setColor(Color.orange);
     g.fillPolygon(x6,y6,5);
 
     g.drawPolygon(x7,y7,5);
     g.setColor(Color.red);
     g.fillPolygon(x7,y7,5);
   }
}






