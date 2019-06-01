import java.awt.*;
public class LengthOfTheYear
  {  public static void main(String[] a)
     {  double scale_factor = 0.05; 
        BarGraphWriter e = new BarGraphWriter(400,600);
        e.setTitle("Length of the year");
        e.setAxes(20, 550, "" +(29.46 * 365.3), (int)((29.46 * 365.3)*scale_factor)); // x- and y-axes start at 20, 550
       // graph is  538 pixels high; top of graph is labelled "10761.738"
       e.setBar1("Mer",(int)(88*scale_factor), Color.red);
       e.setBar2("Ven",(int)(224.7*scale_factor), Color.white);
       e.setBar3("Ear",(int)(365.3*scale_factor), Color.blue);
       e.setBar4("Mar",(int)(687*scale_factor), Color.yellow);
       e.setBar5("Jup",(int)((11.86*365.3)*scale_factor),Color.blue);
       e.setBar6("Sat",(int)((29.46 * 365.3)*scale_factor),Color.red);
     }
  }
