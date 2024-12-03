import java.util.Scanner; 
public class AppleTester {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Welcome to the Apple tester!!!"); 
		System.out.println("Creating the first apple!");
		Apple pc1 = new Apple(); 
		System.out.println("The default values of the first apple object\n"+pc1.writeOutput()); 
		System.out.println("Enter the type of the second apple object: "); 
		String type = sc.nextLine(); 
		System.out.println("Enter the Weight of the second apple object: "); 
		double weight = sc.nextDouble(); 
		System.out.println("Enter the Price of the second apple object: "); 
		double price = sc.nextDouble(); 
		Apple pc2 = new Apple(type, weight, price); 
		System.out.println("The values of the second apple object\n"+pc2.writeOutput()); 
		
		
		

	}

}
