package com.fil.basic;

import java.io.*;
class MyData implements Serializable{
	int i;
	String s;
	MyData(int i,String s){
		this.i = i;
		this.s = s;
	}
	public String toString(){
		
		return this.i + ":" + this.s;
		
	}
}

public class SerializationDemo{
	
	public static void main(String args[]){
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
			MyData m1 = new MyData(12,"Sums");
			oos.writeObject(m1);
			m1= new MyData(15,"Chuvam");
			oos.writeObject(m1);
			m1 = new MyData(6666,"Dalla");
			oos.writeObject(m1);
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
			Object obj =   ois.readObject();
			System.out.println(obj);
			obj = (MyData)  ois.readObject();
			System.out.println(obj);
			obj = (MyData)  ois.readObject();
			System.out.println(obj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
