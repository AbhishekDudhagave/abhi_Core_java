package DemoSerialization_Deseralization;

import java.io.*;

public class StudentSeralization_Main {
	public static void main(String[] args) throws IOException {
		Student s1=new Student(7,"Abhishek");

		try{
			//for Serialization --> File/Object OutputStream

			FileOutputStream fis=new FileOutputStream("C:/Abhishek/Study/core_java_git/abhi_Core_java/abhi7.txt");
//			FileOutputStream fis=new FileOutputStream("Documents/abhi7.txt");

			ObjectOutputStream oos=new ObjectOutputStream(fis);

			//.writeObject() is used to write the Object.

			oos.writeObject(s1);
			System.out.println("Object Written Successfully !");

			oos.flush();
			oos.close();


			//de-seralization readObject() is used Object/FileInputStream
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:/Abhishek/Study/core_java_git/abhi_Core_java/abhi7.txt"));
			Student s2=(Student)ois.readObject();

			System.out.println(s2.id+" "+s2.name);

		}catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
