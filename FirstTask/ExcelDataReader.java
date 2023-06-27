package FirstTask;

	import org.apache.poi.ss.usermodel.*;


	import java.io.File;

	import java.io.FileInputStream;

	import java.io.IOException;


	public class ExcelDataReader {

	    public static void main(String[] args) {

	        // Specify the path of the Excel file

	        String filePath = "path/to/excel/file.xlsx";


	        // Load the Excel file

	        try (FileInputStream fileInputStream = new FileInputStream(new File(filePath))) {

	            // Create a Workbook object for the Excel file

	            Workbook workbook = WorkbookFactory.create(fileInputStream);


	            // Get the first sheet in the workbook

	            Sheet sheet = workbook.getSheetAt(0);


	            // Iterate through each row in the sheet

	            for (Row row : sheet) {

	                // Iterate through each cell in the row

	                for (Cell cell : row) {

	                    // Get the cell value and print it

	                    String cellValue = cell.getStringCellValue();

	                    System.out.print(cellValue + "\t");

	                }

	                System.out.println(); // Move to the next line after printing a row

	            }


	            // Close the workbook

	             workbook.close();

	        } catch (IOException e) {

	            e.printStackTrace();

	        }

	    }

	}

