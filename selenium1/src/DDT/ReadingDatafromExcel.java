package DDT;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDatafromExcel {
	public static void main(String[]args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
	File file=new File("./Textdata/ddata.xlsx");

	Workbook workbook=WorkbookFactory.create(file);
   Sheet sheet = workbook.getSheet("sheet1");
	Row row=sheet.getRow(1);
	Cell cell=row.getCell(0);
	String data=cell.toString();
	System.out.println(data);

	

}
}
