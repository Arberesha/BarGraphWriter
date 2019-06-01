import java.awt.*;
public class Mass
  {  public static void main(String[] a)
     {  BarGraphWriter e = new BarGraphWriter(400,800);
        e.setTitle("Mass");
        e.setAxes(20, 700, "319", 2*319); // x- and y-axes start at 20, 700
       // graph is 2*319 pixels high; top of graph is labelled "319"
       int scale_factor = 2;
       e.setBar1("Mer",(int)(0.05 * scale_factor), Color.red);//compared to the mass of the earth the mass of mercury is 0.5
       e.setBar2("Ven",(int)(0.81 * scale_factor), Color.white);
       e.setBar3("Ear",(int)(1.00  * scale_factor), Color.blue);
       e.setBar4("Mar",(int)(0.11 * scale_factor), Color.yellow);
       e.setBar5("Jup",(int)(318.4 * scale_factor),Color.blue);
       e.setBar6("Sat",(int)(95.3 * scale_factor),Color.red);
     }
  }
