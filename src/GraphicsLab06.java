/*William Schiesswohl
 * Mr. Kiedes
 * AP Computer Science Period 2
 * 10/9/15
 */
import java.awt.*;
import java.applet.*;
import java.util.*; 
																
public class GraphicsLab06 extends Applet
{
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
			
		// Draw Random Lines
		
		for (int k = 0; k <= 200; k++)
		{
		    //random colors
			int red = (int)(Math.random()*255);
			int green = (int)(Math.random()*255);
			int blue = (int)(Math.random()*255);
			g.setColor(new Color(red,green,blue));
			
			//drawing the lines
			int X = (int)(Math.random()*391 + 10); 
			int Y = (int)(Math.random()*291 + 10); 
			int XX = (int)(Math.random()*391 + 10); 
			int YY = (int)(Math.random()*291 + 10);
			g.drawLine(X, Y, XX, YY);
		}
		
		// Draw Random Squares
		for (int k = 0; k <= 75; k++)
		{
		    //random colors
			int red = (int)(Math.random()*255);
			int green = (int)(Math.random()*255);
			int blue = (int)(Math.random()*255);
			g.setColor(new Color(red,green,blue));
			
			//drawing the squares
			int X2 = (int)(Math.random()*355 + 400); 
			int Y2= (int)(Math.random()*257 + 10); 
			int LxW = (int)(Math.random()*10 + 30); 
			g.fillRect(X2,Y2,LxW,LxW);
		}
		// Draw Random Circles
		for (int k = 0; k <= 100; k++)
		{
		    //random colors
			int red = (int)(Math.random()*255);
			int green = (int)(Math.random()*255);
			int blue = (int)(Math.random()*255);
			g.setColor(new Color(red,green,blue));
			
			//drawing the circles
			int X3 = (int)(Math.random()*300 + 10);
			int Y3 = (int)(Math.random()*190 + 302);
			int LxW = (int)(Math.random()*95 + 6);
			g.drawOval(X3, Y3, LxW, LxW);
		}
		/////////////// Draw 3-D Box ///////////////////
		//yellow square
		g.setColor(Color.yellow);
		g.fillRect(550,400,100,100);
		//blue polygon
		Polygon blueQuad = new Polygon();
		blueQuad.addPoint(650,400);
		blueQuad.addPoint(650,500);
		blueQuad.addPoint(690,545);
		blueQuad.addPoint(690,445);
		g.setColor(Color.blue);
		g.fillPolygon(blueQuad);
		//green polygon
		Polygon greenQuad = new Polygon();
		greenQuad.addPoint(550,400);
		greenQuad.addPoint(550,500);
		greenQuad.addPoint(590,545);
		greenQuad.addPoint(590,445);
		g.setColor(Color.green);
		g.fillPolygon(greenQuad);
		//red square
		g.setColor(Color.red);
		g.fillRect(590,445,101,101);

	}	
}  
