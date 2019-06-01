import java.awt.*;
public class Weight
  {  public static void main(String[] a)
     {  int scale_factor = 20; 
        BarGraphWriter e = new BarGraphWriter(400,200);
        e.setTitle("Weight of 1 kg object");
        e.setAxes(20, 140, "2.64", (int)((2.64)*scale_factor)); // x- and y-axes start at 20, 140
       // graph is 5280 pixels high; top of graph is labelled "2.64"
       e.setBar1("Mer",(int)(0.25*scale_factor), Color.red);//the object that in earth weights 1 kg in mercury weights 0.25kg
       e.setBar2("Ven",(int)(0.85*scale_factor), Color.white);
       e.setBar3("Ear",(int)(1.0*scale_factor), Color.blue);
       e.setBar4("Mar",(int)(0.36*scale_factor), Color.yellow);
       e.setBar5("Jup",(int)(2.64*scale_factor),Color.blue);
       e.setBar6("Sat",(int)(1.17 *scale_factor),Color.red);
     }
  }
