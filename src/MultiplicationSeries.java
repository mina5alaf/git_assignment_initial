
public class MultiplicationSeries implements ISubscriber {
	public void notifySubscriber(String input){	
		// TODO Auto-generated method stub
		System.out.print(" the multiplication series of  " + input);
	
		int n =Integer.parseInt(input);
		int result = n;
		while(n>0) {
			n-=1;
			result =result *n;
			
		}
		System.out.println(" is " + result );
	}
}