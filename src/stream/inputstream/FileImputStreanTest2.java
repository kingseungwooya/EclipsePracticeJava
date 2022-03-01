package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileImputStreanTest2 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];
			int i;
			while((i=fis.read(bs))!= -1 ) {
				for(int j =0; j<i; j++) {
					System.out.print((char)bs[j]); //읽은 갯수만큼만 출력 가비지메모리 없음
				}
				System.out.println();
			}
		} 
		catch (IOException e) {
			System.out.println(e);
		}

	}

}
