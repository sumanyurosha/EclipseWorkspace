package com.fil.basic;

import java.io.*;

public class FileDemo {

	public static void main(String args[]){
		try {
			FileReader fr = new FileReader("file.txt");
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("copyfile.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			int i=0;
			while(true){
				br.readLine();
				String str = br.readLine();
				if(str == null)
					break;
				System.out.println(str);
				bw.write(str);
				bw.write("\n");
			}
			br.close();fr.close();
			bw.close();fw.close();
			System.out.println("file copied");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
