import java.util.Scanner;

public class HomePage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("Database Otomotif");
			System.out.println("-------------------");
			System.out.println("1. Menambah tipe kendaraan");
			System.out.println("2. Test drive & input harga");
			System.out.println("3. Keluar");
			System.out.print("Input pilihan: ");
			choice = scan.nextInt();
			
			if (choice==1) {
				Input input = new Input();
				System.out.println("Data Kendaraan");
				System.out.println("----------------");
				input.main();
			}
			else if (choice==2) {
				View view = new View();
				System.out.println("Data Kendaraan");
				System.out.println("----------------");
				view.main();
			}
		} while (choice != 3);
		if (scan!=null) {
			scan.close();
		}
		System.out.println("Sampai jumpa. Semoga harimu menyenangkan.");
	}

}
