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
	private static final long serialVersionUID = 1L; //시리얼 넘버
//표시인터페이스 외부로 시리얼 공유하기위한 
	String name;
	transient String Title; //이 멤버변수는 내부적으로 저장하지않겠다!
	
	
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
		//파일에다가 객체 저장하기
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
		
		} catch (IOException e) {
			System.out.println(e);
		}
		//data 저장된 정보 문자열로 읽기 
		//write한 애를 복원해주는 이게 직렬화
		//안드로이드에서 또는 네트워크에서 오브젝트를 주고받을때
		//많이 사용함 
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
