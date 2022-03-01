package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random", "rw");
		//쓰기
		rf.writeInt(100); //4바이트
		System.out.println(rf.getFilePointer());
		rf.writeDouble(3.14); // 8바이트
		System.out.println(rf.getFilePointer());
		rf.writeUTF("김승우"); //글자 1개당 3바이트 마지막 null 2바이트  11바이트
		System.out.println(rf.getFilePointer());
		//읽기
		rf.seek(0);
		int i= rf.readInt();
		double d= rf.readDouble();
		String k = rf.readUTF();
		System.out.println(i);
		System.out.println(d);
		System.out.println(k);
	}

}
