/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.validation;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;
import sun.rmi.runtime.Log;

/**
 *
 * @author Hoang Tam
 */
public class Validation {

    public static boolean isInteger(String val) {
        boolean check = true;
        try {
            int i = Integer.parseInt(val);
            if (i < 0) {
                check = false;
            }
        } catch (NumberFormatException e) {
            check = false;
        }
        return check;

    }

    public static boolean checkcatogoryID(String val, int min, int max) {
        if (min > max) {
            int t = min;
            min = max;
            max = t;
        }
        boolean check = true;
        int i = 0;
        try {
            i = Integer.parseInt(val);
            if (i < 0) {
                check = false;
            }
        } catch (NumberFormatException e) {
            check = false;
        }
        if (i < min || i > max) {
            check = false;
        }

        return check;
    }

    public static boolean isDouble(String val) {
        boolean check = true;
        try {
            double result = Double.parseDouble(val);
            if (result < 0) {
                check = false;
            }
        } catch (NumberFormatException e) {
            check = false;
        }
        return check;
    }

    public static int checkDate(String inputDate) {
        int check = 0;
        LocalDate dateObj = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = dateObj.format(formatter);
        check = date.compareTo(inputDate);
        return check;
    }

    public static Timestamp takeCurrentDate() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp;
    }

    public static Timestamp dateStringToTimestamp(String date) {
        Timestamp examDateTime = null;
        if (date != null && !"".equals(date)) {
            String dateTimeString = date.replace("T", " ");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
            examDateTime = Timestamp.valueOf(dateTime);
        }
        return examDateTime;
    }

    public static int compareDate(Timestamp date1, Timestamp date2) {
        return date1.compareTo(date2);
    }

    public static boolean testImage(String url) throws IOException {
        boolean check = true;
        try {
            BufferedImage image = ImageIO.read(new URL(url));
            //BufferedImage image = ImageIO.read(new URL("http://someimage.jpg"));  
            if (image == null) {
                check = false;
            }

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block  
            System.err.println("URL error with image");
            e.printStackTrace();
            check = false;
        } catch (IOException e) {
            System.err.println("IO error with image");
            // TODO Auto-generated catch block  
            e.printStackTrace();
            check = false;
        }
        return check;
    }

    public static boolean testFullName(String fullName) {
        boolean check = false;
        if (fullName.length() >= 5 && fullName.length() <= 50) {
            check = true;
        }
        return check;
    }

    public static boolean testPassword(String password) {
        boolean check = false;
        if (password.length() >= 8 && password.length() <= 50) {
            check = true;
        }
        return check;
    }

    public static boolean checkPhone(String str) {
        // Bieu thuc chinh quy mo ta dinh dang so dien thoai
        String reg = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";

        // Kiem tra dinh dang
        boolean check = str.matches(reg);

        return check;
    }

    public static boolean checkSemesterID(String semesterID) {
        ValidationDAO dao = new ValidationDAO();
        boolean check = false;
        try {
            check = dao.checkSemesterID(semesterID);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }

    public static boolean checkDuplicateUserID(String userID) {
        ValidationDAO dao = new ValidationDAO();
        boolean check = false;
        try {
            check = dao.checkDuplicateUserID(userID);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }
    public static boolean checkDuplicateEmail(String email) {
        ValidationDAO dao = new ValidationDAO();
        boolean check = false;
        try {
            check = dao.checkDuplicateEmail(email);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }

    public static boolean checkVaildEmail(String email) {
        boolean check = false;
        try {
            check = email.matches("^\\w+[a-z0-9]*@fpt.edu.vn");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }

    public static boolean checkMajorID(String majorID) {
        ValidationDAO dao = new ValidationDAO();
        boolean check = false;
        try {
            check = dao.checkMajorID(majorID);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }

    public static boolean checkNarrowID(String majorID, String narrowID) {
        ValidationDAO dao = new ValidationDAO();
        boolean check = false;
        try {
            check = dao.checkNarrowID(majorID, narrowID);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }

}
