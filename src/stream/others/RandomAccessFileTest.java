package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random", "rw");
		//����
		rf.writeInt(100); //4����Ʈ
		System.out.println(rf.getFilePointer());
		rf.writeDouble(3.14); // 8����Ʈ
		System.out.println(rf.getFilePointer());
		rf.writeUTF("��¿�"); //���� 1���� 3����Ʈ ������ null 2����Ʈ  11����Ʈ
		System.out.println(rf.getFilePointer());
		//�б�
		rf.seek(0);
		int i= rf.readInt();
		double d= rf.readDouble();
		String k = rf.readUTF();
		System.out.println(i);
		System.out.println(d);
		System.out.println(k);
	}

}
