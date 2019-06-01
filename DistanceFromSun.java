import java.awt.*;
public class DistanceFromSun
  {  public static void main(String[] a)
    {  BarGraphWriter e = new BarGraphWriter(400,400);
       e.setTitle("Distance from sun");
       e.setAxes(-20, 220, "9.5", 15*10); // x- and y-axes start at 20, 220
       // graph is 150 pixels high; top of graph is labelled "10"
     int scale_factor = 15;
     e.setBar1("Mer",(int)(0.387 * scale_factor), Color.red);//the distance of Mercury from the sun is 0.387 astromical units
     e.setBar2("Ven",(int)(0.723 * scale_factor), Color.white);
     e.setBar3("Ear",(int)(1.00  * scale_factor), Color.blue);
     e.setBar4("Mar",(int)(1.524 * scale_factor), Color.yellow);
     e.setBar5("Jup",(int)(5.203 * scale_factor),Color.blue);
     e.setBar6("Sat",(int)(9.539 * scale_factor),Color.red);
    }
  }
