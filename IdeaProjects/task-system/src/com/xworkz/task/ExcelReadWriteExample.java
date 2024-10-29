package com.xworkz.task;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExcelReadWriteExample {

    // Method to write data to an Excel file
    public static void writeExcel(String filePath) {
        // Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("Product");

        // This data needs to be written (Object[])
        Map<String, Object[]> data = new TreeMap<>();
        data.put("1", new Object[]{"ID", "NAME", "PRICE"});
        data.put("2", new Object[]{1, "Mouse", 1000});
        data.put("3", new Object[]{2, "Keyboard", 1200});
        data.put("4", new Object[]{3, "Monitor", 5000});

        // Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) {
            Row row = sheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String)
                    cell.setCellValue((String) obj);
                else if (obj instanceof Number)
                    cell.setCellValue(((Number) obj).doubleValue());
            }
        }

        try {
            // Write the workbook to the file system
            FileOutputStream out = new FileOutputStream(new File(filePath));
            workbook.write(out);
            out.close();
            workbook.close();
            System.out.println("Excel file written successfully at " + filePath);
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found or cannot be created: " + filePath);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error: IO exception occurred while writing the Excel file.");
            e.printStackTrace();
        }
    }

    // Method to read data from an Excel file
    public static void readExcel(String filePath) {
        try {
            // Open the Excel file for reading
            FileInputStream file = new FileInputStream(new File(filePath));

            // Create Workbook instance for the file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            // Get the first sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Iterate through each row in the sheet
            for (Row row : sheet) {
                // For each row, iterate through each column (cell)
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        default:
                            System.out.print("Invalid data" + "\t");
                            break;
                    }
                }
                System.out.println();
            }
            workbook.close();
            file.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found: " + filePath);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error: IO exception occurred while reading the Excel file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Define the file path for the Excel file
        String filePath = "Product.xlsx";

        // Call the method to write data to the Excel file
        writeExcel(filePath);

        // Call the method to read data from the Excel file
        System.out.println("\nReading data from the Excel file:");
        readExcel(filePath);
    }
}
