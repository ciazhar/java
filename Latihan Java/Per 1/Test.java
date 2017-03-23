public class Test{
	public static void main(String args[]){
		int a,b;
		a =10;
		b = (a==1) ? 20:30;
		System.out.println("Value of b is :"+b);
		
		b= (a==10) ? 20:30;
		System.out.println("Value of b is :"+b);
		
		int [] numbers = {10,20,30,40,50};
		
		for(int x:numbers){
			System.out.print(x);
			System.out.print(",");
		}
		System.out.println("\n");
		String [] names = {"James", "Larry", "Tom", "Lacy"};
		
		for(String name : names){
			System.out.print(name);
			System.out.print(",");
		}
	}
}