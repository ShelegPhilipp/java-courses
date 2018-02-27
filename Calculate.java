public class Calculate {
	
	public static void main( String[] arg){
		System.out.println("Calculate...");
		
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1  ]);
		
		int sum = first + second;
		System.out.println("sum = " + sum );
		
		int sub = first - second;
		System.out.println("Sub = " + sub );
		
		int mult = first*second;
		System.out.println("Mult = " + mult );
		
		int division = first/second;
		System.out.println("division = " + division );
		
		double power =  Math.pow(first, second);
		System.out.println("power = " + power );
		
	}
	
}