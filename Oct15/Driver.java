import java.util.Scanner;
//main 
public class Driver {
	
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		String finished = "Y";
		
	do {
		System.out.println("What is the Manufacturer?");
		String manufacturer = Scan.nextLine();
		
		System.out.println("What model of phone is it?");
		String model = Scan.nextLine();
		
		System.out.println("How much does " + manufacturer + "'s " + model + " cost?");
		double price = Scan.nextDouble();
		String clear = Scan.nextLine();
		
		System.out.println("What carrier is " + manufacturer + "'s " + model + " using?" );
		String carrier = Scan.nextLine();
		
		System.out.println("Who do you want to call?");
		double number = Scan.nextDouble();
		clear = Scan.nextLine();
		
		System.out.println("What do you want to say?");
		String text = Scan.nextLine();
		

		
		Phone phone = new Phone(manufacturer, model, price, carrier);
		System.out.println(phone.call(number));
		System.out.println(phone.text(text));
		System.out.println(phone.toString());
		System.out.println("Do you want to make another phone? y/n");
		finished = Scan.next();
		clear = Scan.nextLine();
	}while(finished.equalsIgnoreCase("Y"));
	}

}
