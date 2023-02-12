import java.util.Scanner;
import java.util.ArrayList;

public class HomePage {
	public void main(ArrayList<Datab> data) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Database Otomotif");
			System.out.println("-------------------");
			System.out.println("1. Menambah tipe kendaraan");
			System.out.println("2. Test drive & input harga");
			System.out.println("3. Keluar");
			System.out.print("Input pilihan: ");
			choice = scan.nextInt();
			scan.nextLine();
			
			if (choice==1) {
				Input input = new Input();
				System.out.println("Data Kendaraan");
				System.out.println("----------------");
				data = input.main(scan,data);
			}
			else if (choice==2) {
				View view = new View();
				System.out.println("Data Kendaraan");
				System.out.println("----------------");
				data = view.main(scan,data);
			}
			System.out.println("");
		} while (choice != 3);
		if (scan!=null) {
			scan.close();
		}
		System.out.println("Sampai jumpa. Semoga harimu menyenangkan.");
	}

}
