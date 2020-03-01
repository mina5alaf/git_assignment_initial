
public class MultiplicationSeries implements ISubscriber {
	public void notifySubscriber(String input){	
		// TODO Auto-generated method stub
		System.out.print(" the multiplication series of  " + input);
	
		int n =Integer.parseInt(input);
		int result = n;
		System.out.println(n);
		
		while(n>1) {
			n-=1;
			result =result *n;
			System.out.println(n);
			System.out.println(result);

		}
		System.out.println(" is " + result );
	}
}