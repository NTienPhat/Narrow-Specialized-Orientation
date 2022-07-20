/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.student;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import sample.validation.Validation;

/**
 *
 * @author Hoang Tam
 */
public class ReadExcelStudent {

    public static final int COLUMN_INDEX_USERID = 0;
    public static final int COLUMN_INDEX_NAME = 1;
    public static final int COLUMN_INDEX_EMAIL = 2;
    public static final int COLUMN_INDEX_PHONENUMBER = 3;
    public static final int COLUMN_INDEX_ADDRESS = 4;
    public static final int COLUMN_INDEX_ROLEID = 5;
    public static final int COLUMN_INDEX_SEMESTERID = 6;
    public static final int COLUMN_INDEX_MAJORID = 7;
    public static final int COLUMN_INDEX_NARROWID = 8;

    public static List<StudentDTO> readExcel(String excelFilePath) throws IOException {
        List<StudentDTO> listStudent = new ArrayList<>();

        // Get file
        InputStream inputStream = new FileInputStream(new File(excelFilePath));

        // Get workbook
        try {
            Workbook workbook = getWorkbook(inputStream, excelFilePath);
            Sheet sheet = workbook.getSheet("sheet1");

            // Get all rows
            Iterator<Row> iterator = sheet.iterator();
            while (iterator.hasNext()) {
                Row nextRow = iterator.next();
                if (nextRow.getRowNum() == 0) {
                    // Ignore header
                    continue;
                }

                // Get all cells
                Iterator<Cell> cellIterator = nextRow.cellIterator();

                // Read cells and set value for book object
                StudentDTO student = new StudentDTO();
                boolean check = true;
                String majorID = "";
                while (cellIterator.hasNext()) {
                    //Read cell
                    Cell cell = cellIterator.next();
                    Object cellValue = getCellValue(cell);
                    if (cellValue == null || cellValue.toString().isEmpty()) {
                        continue;
                    }
                    // Set value for book object
                    int columnIndex = cell.getColumnIndex();
                    switch (columnIndex) {
                        case COLUMN_INDEX_USERID:
                            String userID = (String) getCellValue(cell);
                            if (!Validation.checkDuplicateUserID(userID)) {
                                student.setUserID(userID);
                            } else {
                                check = false;
                            }
                            break;
                        case COLUMN_INDEX_NAME:
                            String name = (String) getCellValue(cell);
                            if (name.length() > 8 || name.length() < 50) {
                                student.setName(name);
                            }
                            break;
                        case COLUMN_INDEX_EMAIL:
                            String email = (String) getCellValue(cell);
                            email = email + "@fpt.edu.vn";
                            if (Validation.checkVaildEmail(email)) {
                                student.setEmail(email);
                            } else {
                                check = false;
                            }
                            break;
                        case COLUMN_INDEX_PHONENUMBER:
                            String phoneNumber = (String) getCellValue(cell);
                            if (Validation.checkPhone(phoneNumber)) {
                                student.setPhoneNumber(phoneNumber);
                            } else {
                                check = false;
                            }
                            break;
                        case COLUMN_INDEX_ADDRESS:
                            String address = (String) getCellValue(cell);
                            student.setAddress(address);
                            break;
                        case COLUMN_INDEX_ROLEID:
                            String roleID = (String) getCellValue(cell);
                            student.setRoleID(roleID);
                            break;
                        case COLUMN_INDEX_SEMESTERID:
                            String semesterID = (String) getCellValue(cell);
                            if (Validation.checkSemesterID(semesterID)) {
                                student.setSemesterID(semesterID);
                            } else {
                                check = false;
                            }
                            break;
                        case COLUMN_INDEX_MAJORID:
                            majorID = (String) getCellValue(cell);
                            if (Validation.checkMajorID(majorID)) {
                                student.setMajorID(majorID);
                            } else {
                                check = false;
                            }
                            break;
                        case COLUMN_INDEX_NARROWID:
                            String narrowID = (String) getCellValue(cell);
                            if (Validation.checkMajorID(majorID)) {
                                if (Validation.checkNarrowID(majorID, narrowID)) {
                                    student.setNarrowID(narrowID);
                                }
                            } else {
                                check = false;
                            }
                            break;
                        default:
                            break;
                    }

                }
                if(student.getUserID().equals("")){
                    continue;
                }
                if (check) {
                    listStudent.add(student);
                }
                workbook.close();

                inputStream.close();

            }
        } catch (Exception e) {
            if (e.toString().contains("file is not Excel file")) {
                System.out.println("File is invalid");
            }
        }

        // Get sheet
        return listStudent;

    }

// Get Workbook
    private static Workbook getWorkbook(InputStream inputStream, String excelFilePath) throws IOException {
        Workbook workbook = null;
        if (excelFilePath.endsWith("xlsx")) {
            workbook = new XSSFWorkbook(inputStream);
        } else if (excelFilePath.endsWith("xls")) {
            workbook = new HSSFWorkbook(inputStream);
        } else {
            throw new IllegalArgumentException("The specified file is not Excel file");
        }

        return workbook;
    }

    // Get cell value
    private static Object getCellValue(Cell cell) {
        CellType cellType = cell.getCellType();
        Object cellValue = null;
        switch (cellType) {
            case BOOLEAN:
                cellValue = cell.getBooleanCellValue();
                break;
            case FORMULA:
                Workbook workbook = cell.getSheet().getWorkbook();
                FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
                cellValue = evaluator.evaluate(cell).getNumberValue();
                break;
            case NUMERIC:
                cellValue = cell.getNumericCellValue();
                break;
            case STRING:
                cellValue = cell.getStringCellValue();
                break;
            case _NONE:
            case BLANK:
            case ERROR:
                break;
            default:
                break;
        }

        return cellValue;
    }
}
