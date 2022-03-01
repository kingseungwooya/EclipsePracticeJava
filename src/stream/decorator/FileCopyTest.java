package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		long milliseconds = 0;
		int len =0;
		
		try(FileInputStream fis= new FileInputStream("a.exe");			
				FileOutputStream fos = new FileOutputStream("b.exe");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)
				){
			milliseconds = System.currentTimeMillis();
			int i;
			while( (i=fis.read())!=-1) { //파일끝의 반환값은 -1임
                 bos.write(i);	 //버퍼쓰기전 fos.write할땐 5분걸림
                 //버퍼 쓰고 하니 1.4초 걸림ㅁ 
                 len++;
			}
			milliseconds = System.currentTimeMillis() - milliseconds;
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println(len);
		System.out.println(milliseconds);
		

	}

}
