package stream.SerializationTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{ /**
	 * 
	 */
	private static final long serialVersionUID = 1L; //�ø��� �ѹ�
//ǥ���������̽� �ܺη� �ø��� �����ϱ����� 
	String name;
	transient String Title; //�� ��������� ���������� ���������ʰڴ�!
	
	
	public Person(String name, String Title){
		this.name = name;
		this.Title = Title;
	}

	@Override
	public String toString() {
		return name + "," + Title;
	}
	
}

public class SerializaionTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person personLee = new Person("Lee", "Manager");
		//���Ͽ��ٰ� ��ü �����ϱ�
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
		
		} catch (IOException e) {
			System.out.println(e);
		}
		//data ����� ���� ���ڿ��� �б� 
		//write�� �ָ� �������ִ� �̰� ����ȭ
		//�ȵ���̵忡�� �Ǵ� ��Ʈ��ũ���� ������Ʈ�� �ְ������
		//���� ����� 
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Object obj = ois.readObject();
			if(obj instanceof Person) {
				Person p =(Person)obj;
				System.out.println(p);
			}
		
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
