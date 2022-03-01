package stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 쓰고 엔터를 누르세요ㅕ");
		int i=0;
		try {
		     while((i = System.in.read()) != '\n') { //in는 1바이트 씩 읽으므로 단어를 쓰면 에러가 난다
		    	 //해결책 ->scanner 클래스를 쓰기 
		    	 System.out.println((char)i);
		     }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println((char)i); //그냥 i하면 아스키값 97나옴

	}

}
