package com.common;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {// dpendendecy apache poi and apache poi ooxml

		FileInputStream fs= new FileInputStream("./ExcelSheet/ExcelSheet.xlsx");
		
		Workbook wb=WorkbookFactory.create(fs);
		
		org.apache.poi.ss.usermodel.Sheet sh= wb.getSheet("Sheet1");
		String s=sh.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(s);
	}

}


