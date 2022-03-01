package stream.others;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine(); //한 줄 읽기 
		int num= scanner.nextInt(); //한 정수  읽기 
		
		System.out.println(name);
		System.out.println(num);

	}

}
