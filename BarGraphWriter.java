import java.awt.*;
import javax.swing.*;

 public class BarGraphWriter extends JPanel
   {  private int bar_width = 50;
      private JFrame frame;//krijimi i kornizes
      private int x_pos;//the coordinate where the x axis begin
      private int  y_pos;//the coordinate where the x axis begin

     /**Constructor BarGraphWriter creates the Panel
       * @param w-the  window's width
       * @param h-the window's height */     
       public BarGraphWriter(int w,int h)
         {  frame = new JFrame();    
            frame.getContentPane().add(this);
            frame.setSize(w,h);
            frame.setVisible(true);
         }
     /**setTitle sets the title of the frame */  
       public void setTitle(String title)
         { frame.setTitle(title); }
     
     /**setAxes draw the x and y axes of the graph.
       * @param x_pos - state the coordinates where the x-axis begins
       * @param y_pos - state the coordinates where the y-axis begins
       * @param y_height - state the height of y-axis in pixels
       * @param top_label- is the label placed at the top of y-axis */
      public void setAxes(int x_pos,int y_pos, String top_label, int y_height)
        {  this.x_pos = x_pos;
           this.y_pos = y_pos;
           Graphics g = getGraphics();//the graphics pen that will draw the axes
           int diference = 300;//the length of x axis
           g.setColor(Color.black);
           g.drawLine(x_pos,y_pos,x_pos+diference,y_pos);//draw the x axis
           g.drawLine(x_pos,y_pos-y_height,x_pos,y_pos);//draw the y axis
           g.drawString(top_label,x_pos-15,y_pos-y_height);
           g.drawString("0", x_pos-15,y_pos);
        }

     /**setBar1 draw the first bar in the graph
       * @param label - is the label underneath
       * @param height - is the height of the bar */
     public void setBar1(String label,int height, Color c)
       { setBar(label,height,c,0);
      }
     
      /**setBar2 draw the second bar in the graph */
      public void setBar2(String label,int height, Color c)
        { setBar(label,height,c,1);
        }
     
    /**setBar3 draw the third bar */
      public void setBar3(String label,int height, Color c)
        {  setBar(label,height,c,2);
        }
     
    /**setBar4 draw the fourth bar */
      public void setBar4(String label,int height, Color c)
        {  setBar(label,height,c,3);
        }
    /**setBar5 draw the fifth bar in the graph. */ 
      public void setBar5(String label,int height, Color c)
        {  setBar(label,height,c,4);
        }
    
     /**setBar6 draw the sixth bar in the graph. */
      public void setBar6(String label,int height, Color c)
        {  setBar(label,height,c,5);        }
   
    private void  setBar(String label,int height,Color c, int t)
   {       Graphics g = getGraphics();
           g.setColor(c);
           g.fillRect(x_pos+bar_width*t,y_pos-height,bar_width,height);
           g.setColor(Color.black);
           g.drawRect(x_pos+bar_width*t,y_pos-height,bar_width,height);
           g.drawString(label,x_pos+bar_width*t+10,y_pos+10);}
           }

 