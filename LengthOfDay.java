import java.awt.*;
public class LengthOfDay
  {  public static void main(String[] a)
     { BarGraphWriter e = new BarGraphWriter(400,600);
       e.setTitle("Length of Day");
       e.setAxes(20, 480, "2106.12" , (int)(2106.12*0.2)); // x- and y-axes start at 20, 480
      // graph is 421 pixels high; top of graph is labelled "2106.12"
      double scale_factor = 0.2;
       e.setBar1("Mer",(int)(2106.12 * scale_factor), Color.red);//in the mercury the day lasts 2106.1 hour
       e.setBar2("Ven",(int)(718 * scale_factor), Color.white);
       e.setBar3("Ear",(int)(23.93  * scale_factor), Color.blue);
       e.setBar4("Mar",(int)(24.62 * scale_factor), Color.yellow);
       e.setBar5("Jup",(int)(9.83 * scale_factor),Color.blue);
       e.setBar6("Sat",(int)(10.03 * scale_factor),Color.red);
     }
  }
