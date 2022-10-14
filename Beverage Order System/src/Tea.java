import javax.swing.JOptionPane;

public class Tea extends Beverage {
	private boolean sugar;

	public Tea(String size,int amount,Main lbl) {
		super(size,amount);
		if(JOptionPane.showConfirmDialog(lbl, "Would you like sugar?","Sugar",JOptionPane.YES_NO_OPTION)==0) sugar=true;
		else sugar=false;
		double price;
		if(size.equals("Small")) price=30;
		else if(size.equals("Medium")) price=50;
		else price=70;
		if(sugar) price*=1.25;
		setPrice(price);
	}
	
	@Override
	public String toString() {
		if(sugar) return super.toString()+"Tea with sugar";
		else return super.toString()+"Tea";
	}
}