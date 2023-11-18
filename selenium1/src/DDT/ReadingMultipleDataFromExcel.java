package DDT;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDataFromExcel {
	public static void main(String[]args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		File file=new File("./Textdata/ddata.xlsx");

		Workbook workbook=WorkbookFactory.create(file);
	   Sheet sheet = workbook.getSheet("sheet1");
	  int rowcount=sheet.getPhysicalNumberOfRows();
	  int cellcount =sheet.getRow(0).getPhysicalNumberOfCells();
	  for(int i=0;i<rowcount;i++) {
		  for(int j=0;j<cellcount;j++) {
			  System.out.println(sheet.getRow(i).getCell(j).toString());
		  }
	  }

	}
}
