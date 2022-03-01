package stream.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			int i=0;
			while((i=isr.read()) !=-1) {
				System.out.print((char)i);
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}
		Socket socket = new Socket(); //전화기

		try {//버퍼로 감싸기
			//소켓이 읽은걸 -reader가 문자로바꿔주고 - 버퍼리더가 버퍼로 바꿔주고
			BufferedReader br= new BufferedReader(
			 new InputStreamReader(socket.getInputStream()));
			br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
