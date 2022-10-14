import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Cart extends Thread {
	String Report;
	int Total=0;
	public Cart(String report,int totalprice_of_bvg) {
		Report=report;
		Total=totalprice_of_bvg ;
	}
@Override
public void run() {
	  try{
          FileWriter fw = new FileWriter("Beverages.txt")  ;
PrintWriter pw = new PrintWriter(fw);

pw.println("*******************************************");
pw.println("              Hashim Beverages            ");
pw.println("");        pw.println("");
pw.println(Report);
pw.println("Total :"+Integer.toString(Total));
pw.println("*******************************************");
pw.println("Enjoy Your Drinks!");
pw.close();fw.close();
          }
          catch(IOException e){
              e.printStackTrace();}
}}
