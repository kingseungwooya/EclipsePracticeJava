package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileImputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null; //read ����Ʈ ������ 
		try {
			int i=0;
			fis = new FileInputStream("input.txt");  //���ڴ� FileReader�� �о���� 
			while((i=fis.read())!= -1) {
				System.out.println((char)i);  //����Ʈ ������ �ѱ� ���� �� ���¤�
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
