package com.sums.excel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFrom {
	
	//public String filePath = "\\home\\sumanyu\\Downloads\\Sheet1.xlsx";
	
	public ArrayList<String> readExcelSheet(String filePath) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		ArrayList<String> cdbFromSheet = new ArrayList<String>();
		Workbook workbook = WorkbookFactory.create(new File(filePath));
		Sheet sheet = workbook.getSheetAt(0);
		DataFormatter dataFormatter = new DataFormatter();
		Iterator<Row> rowIterator = sheet.rowIterator();
		rowIterator.next();
		while(rowIterator.hasNext()) {
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			if(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				String cdb = dataFormatter.formatCellValue(cell);
				//System.out.println(cdb);
				cdbFromSheet.add(cdb);
			}
		}
		
		return cdbFromSheet;
	}
}
