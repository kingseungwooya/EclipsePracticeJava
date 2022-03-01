package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutPutStreamTest { //파일 만들기 

	public static void main(String[] args) {
		
		byte[] bs = new byte[26];
		byte data = 65;
		for(int i =0; i<bs.length; i++) {
			bs[i] = data++;
		}
		
		try(FileOutputStream fos =new FileOutputStream("output.txt", true) ){ //true없을시 false임으로 계속 위에다 덮어쓰는 구조로 됌 true해야 append형식으로됌
			//fos.write(65); //문자 출력하기 위해 아스키값 입력해야댐
			fos.write(bs);
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");

	}

}
