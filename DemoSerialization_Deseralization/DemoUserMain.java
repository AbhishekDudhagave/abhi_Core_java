package DemoSerialization_Deseralization;

import java.io.*;

public class DemoUserMain  {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//serializatrion
		DemoUser dm=new DemoUser(7,"Abhishek");

		FileOutputStream fos=new FileOutputStream("C:/Users/Edify/Documents/serialization_deserialization/abhi7.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		oos.writeObject(dm);
		oos.flush();
		oos.close();

		System.out.println("object Seralized");

		//de-serializable

		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:/Users/Edify/Documents/serialization_deserialization/abhi7.txt"));
		DemoUser du=(DemoUser) ois.readObject();

		System.out.println(du.userId+" "+du.userName);
		System.out.println("object de-serialized");
	}
}
