package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutPutStreamTest { //���� ����� 

	public static void main(String[] args) {
		
		byte[] bs = new byte[26];
		byte data = 65;
		for(int i =0; i<bs.length; i++) {
			bs[i] = data++;
		}
		
		try(FileOutputStream fos =new FileOutputStream("output.txt", true) ){ //true������ false������ ��� ������ ����� ������ �� true�ؾ� append�������Ή�
			//fos.write(65); //���� ����ϱ� ���� �ƽ�Ű�� �Է��ؾߴ�
			fos.write(bs);
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");

	}

}
