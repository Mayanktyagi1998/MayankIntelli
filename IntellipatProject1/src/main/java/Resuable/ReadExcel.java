package Resuable;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {

    public static String getDataFromExcel(String sheetname,int rowIndex , int columnIndex) throws IOException {
        //to read file
        FileInputStream fis = new FileInputStream(new File("src/main/resources/TestData/TestDataSample.xlsx"));
        //to read excel and we are providing fis below so that HSSF wile get knowldge of the file
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet worksheet = workbook.getSheet(sheetname);
        return worksheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();

    }
}
