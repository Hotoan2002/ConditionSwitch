package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" nhap vao thang trong nam");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		switch (n) {
		case 1,  3, 5, 7, 8, 10, 12: 
			System.out.println(" thang co 31 ngay ");
			break;
		case 4,  6, 9, 11: 
			System.out.println(" thang co 30 ngay ");
			break;
		case 2: 
			System.out.println(" thang co 28 ngay ");
			break;
			default: 
				System.out.println(" thang nhap vao ko hop le ");
		   }
		System.out.println("ket thuc chuong trinh");
		System.out.println("Nhap so a = ");
		int a;
		a = sc.nextInt();
		if (a >= 0) {
			switch (a) {
			case 0: {					
				System.out.println("So 0");
				break;
			}
			default:
				System.out.println("a la so nguyen duong ");
			}
		}
		else if (a < 0) System.out.println(" so nguyen am");
		System.out.println("Ket thuc chuong trinh.");
		System.out.println("-----------------------------------");
		//BAI10.2
		int number;
		number = sc.nextInt();
		
		int x = number % 3;
		int y = number % 5;
		
		switch (x) {
		case 0: {
			switch (y) {
			case 0: {
				
				System.out.println("chia het cho 3 va 5");
				break;
			}
			default:
				System.out.println("chia het cho 3");
				break;
			}
			break;
		}
		default:
			switch (y) {
			case 0: {
				
				System.out.println("chia het cho 5");
				break;
			}
			default:
				System.out.println("khong chia het cho 5");
				break;
			}
		}
		System.out.println("Ket thuc chuong trinh.");
		System.out.println("----------------------------------");
	}

}
