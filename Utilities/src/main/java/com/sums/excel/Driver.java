package com.sums.excel;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class Driver {

	public static void main(String args[]) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		ReadFrom readFrom = new ReadFrom();
		ArrayList<String> cdbFromSheet = new ArrayList<String>(readFrom.readExcelSheet("/home/sumanyu/Downloads/Sheet1.xlsx"));
		ArrayList<String> cdbInDb = new ArrayList<String>(readFrom.readExcelSheet("/home/sumanyu/Downloads/Sheet2.xlsx"));
		//for(int i=0;i<cdbInDb.size();i++)
			//System.out.println(cdbInDb.get(i));
		
		for(int i=0;i<cdbFromSheet.size();i++) {
			if(!cdbInDb.contains(cdbFromSheet.get(i))) {
				System.out.println(cdbFromSheet.get(i));
			}
		}
	}
}
