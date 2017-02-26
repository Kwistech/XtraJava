/*
	Calculate tip amount from a 
	percentage of a bill.
 */
class TipCalc {
	public static void main(String args[]) {
		double amount; // bill amount
		double percent; // tip percentage
		
		amount = 22.50;
		percent = 25;
		
		double tip;
		
		tip = amount * (percent / 100);
		
		System.out.println("Tip on $" + amount + " is $" + tip);
	}
}
