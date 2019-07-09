package org.avinash.sequence_using_thread;

/**
 * Hello world!
 *
 */
public class App 
{
	public static int compute(int a) {
	
		if(a == 0) {
			return 0;
		}
		return a + compute(a-1);
	}
	
	private static String getString() {
		return "CONDITION";
	}
    public static void main( String[] args )
    {
        System.out.println( compute(5) );
        
        switch(getString()) {
        case "CONDITION":
        	System.out.println("CONDITION");
        	break;
        default :
        	System.out.println("Not CONDITION");
        }
    }
}
