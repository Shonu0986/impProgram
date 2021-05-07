package demoR;

import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readExcel {
	public static void main(String[] args) throws Exception {

		File fsi = new File("./Data/framework.xlsx");
		Workbook wb = WorkbookFactory.create(fsi);
		Sheet sh = wb.getSheet("login");
		int rowcount = sh.getPhysicalNumberOfRows();
		Row firstRow = sh.getRow(0);

		for (int r = 1; r < rowcount; r++) {

			for (int c = 0; c < firstRow.getLastCellNum(); c++) {

				Cell c1 = sh.getRow(r).getCell(c);
				System.out.print(c1 + "  ");

			}
			System.out.println(" ");
			//String s=sh.getRow(1).getCell(0).toString();
		}

	}
}