import java.util.Scanner;
import java.util.ArrayList;

public class View {

	public ArrayList<Datab> main(Scanner scan, ArrayList<Datab> data) {
		// TODO Auto-generated method stubS
		Datab datatp = new Datab();
		System.out.println("|-----|---------------|---------------|");
		System.out.println("| No  |     Type      |      Name     |");
		System.out.println("|-----|---------------|---------------|");
		for (int j = 0; j < data.size(); j++) {
			datatp = data.get(j);
			
			int x = 15-datatp.type.length();
			int y = 15-datatp.name.length();
			System.out.print("|"+(j+1));
			for (int i = 0; i < 5-j/10-1; i++) {
				System.out.print(" ");
			}
			System.out.print("|"+datatp.type);
			for (int i = 0; i < x; i++) {
				System.out.print(" ");
			}
			System.out.print("|"+datatp.name);
			for (int i = 0; i < y; i++) {
				System.out.print(" ");
			}
			System.out.println("|");
			
			System.out.println("|-----|---------------|---------------|");
		}
		System.out.println("|-----|---------------|---------------|");
		
		int choice = -1;
		do {
			System.out.print("Pick a vehicle number to test drive[Enter '0' to exit]: ");
			choice = scan.nextInt();
			scan.nextLine();
			if (choice>0 && choice<=data.size()) {
				datatp = data.get(choice-1);
				System.out.println("Vehicle number #"+choice);
				System.out.println("---------------------");
				System.out.println("Brand: "+datatp.brand);
				System.out.println("Name: "+datatp.name);
				System.out.println("License Plate: "+datatp.license);
				System.out.println("Type: "+datatp.tipe);
				System.out.println("Gas Capacity: "+datatp.gas);
				System.out.println("Top Speed: "+datatp.speed);
				System.out.println("Wheel(s): "+datatp.wheel);
				if(datatp.type.equals("Car")) {
					System.out.println("Entertainment System: "+datatp.entsys);
					System.out.println("Turning on entertainment system...");
					if(datatp.tipe.equals("Supercar")) {
						System.out.println("Boosting!");
					}
				}
				else {
					System.out.println(datatp.name+" is standing!");
				}
				System.out.print("Price: ");
				datatp.price = scan.nextInt();
				scan.nextLine();
				data.set(choice-1, datatp);
				System.out.println("Price: "+datatp.price);
			}
		} while (choice<0 || choice>data.size());
		return data;
	}

}
