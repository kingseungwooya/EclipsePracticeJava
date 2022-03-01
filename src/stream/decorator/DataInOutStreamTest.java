package stream.decorator; //보조스트림 종류들

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInOutStreamTest {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)){
			dos.write(100);
			dos.writeInt(10);
			dos.writeChar('a');
			dos.writeUTF("Helo");
			
		} catch (IOException e) {
			System.out.println(e);
		}
		try(FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)){
			System.out.println(dis.read());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
			//각각의 자료형에 대한 read write 메소드 맞춰줘야함 !!!!!
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
