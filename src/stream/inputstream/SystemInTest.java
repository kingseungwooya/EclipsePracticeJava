package stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		System.out.println("���ĺ� �������� ���� ���͸� ���������");
		int i=0;
		try {
		     while((i = System.in.read()) != '\n') { //in�� 1����Ʈ �� �����Ƿ� �ܾ ���� ������ ����
		    	 //�ذ�å ->scanner Ŭ������ ���� 
		    	 System.out.println((char)i);
		     }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println((char)i); //�׳� i�ϸ� �ƽ�Ű�� 97����

	}

}
