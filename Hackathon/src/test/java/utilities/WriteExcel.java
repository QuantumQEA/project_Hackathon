package utilities;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
public class WriteExcel {
    public static void healthListExcel(List<String> healthInsuranceList, String fileName, String sheetName) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
        int rowNum = 0;
        // Write headers
        XSSFRow headerRow = sheet.createRow(rowNum++);
        headerRow.createCell(0).setCellValue("Health Insurance");
        // Write data
        for (String insurance : healthInsuranceList) {
            XSSFRow row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(insurance);
        }
        // Write to file
        try (FileOutputStream fileOut = new FileOutputStream(fileName)) {
            workbook.write(fileOut);
        } 
        // Close workbook
        workbook.close();
    }
    public static void TravelListExcel(List<String> threepolicy, String fileName, String sheetName) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
        int rowNum = 0;
        // Write headers
        XSSFRow headerRow = sheet.createRow(rowNum++);
        headerRow.createCell(0).setCellValue("three lowest international travel insurance plan");
        // Write data
        for (String insurance : threepolicy) {
            XSSFRow row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(insurance);
        }
        // Write to file
        try (FileOutputStream fileOut = new FileOutputStream(fileName)) {
            workbook.write(fileOut);
        } 
        // Close workbook
        workbook.close();
    }

	
}