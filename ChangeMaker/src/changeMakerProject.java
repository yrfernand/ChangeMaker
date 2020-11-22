import java.util.Scanner;

 public class changeMakerProject {
	 
	 public static void main(String[] args) {
			int amount = 0;
			
			while(amount < 1 || amount > 99) {
			System.out.println("Please Enter A non decimal Change Amount Between 1cent And 99cents: ");
			Scanner scanner = new Scanner(System.in);
			amount = scanner.nextInt();
			}

			int totalQuarters = amount / 25;
			int quarterChange = amount % 25;
			int totalDimes = quarterChange / 10;
			int dimeChange = quarterChange % 10;
			int totalNickels = dimeChange / 5;
			int nickelChange = dimeChange % 5;
			int totalPennies = nickelChange;
			
			if (totalQuarters > 0)
				System.out.println("Quarters: " + totalQuarters);
			if (totalDimes > 0)
				System.out.println("Dimes: " + totalDimes);
			if (totalNickels > 0)
				System.out.println("Nickels: " + totalNickels);
			if (totalPennies > 0)
				System.out.println("Pennies: " + totalPennies);
			
		}

	}



	