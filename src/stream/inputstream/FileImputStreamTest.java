package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileImputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null; //read 바이트 단위로 
		try {
			int i=0;
			fis = new FileInputStream("input.txt");  //문자는 FileReader로 읽어야함 
			while((i=fis.read())!= -1) {
				System.out.println((char)i);  //바이트 단위라 한글 읽을 수 업승ㅁ
			}
			
			
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}

}
