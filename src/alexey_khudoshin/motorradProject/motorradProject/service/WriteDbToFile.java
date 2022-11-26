package alexey_khudoshin.motorradProject.motorradProject.service;

import motorradProject.db.DbMotorrad;
import motorradProject.model.Motorrad;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.time.Instant;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor


public class WriteDbToFile {
    //    Вопросы : как правильно подружать import org.apache.poi?
//              как делается сборка проекта с помощью умника Mavin?
//    https://habr.com/ru/post/560520/
//    https://javadevblog.com/sozdanie-excel-fajla-v-java-s-pomoshh-yu-apache-poi.html


    //   *****************************************************************************
    public static void main(String[] args) throws ParseException {

        // создание самого excel файла в памяти
        HSSFWorkbook workbook = new HSSFWorkbook();
        // создание листа с названием "Motorrad"
        HSSFSheet sheet = workbook.createSheet("Motorrad");

        // заполняем список данными
        List<Motorrad> dataList = fillData();

        // счетчик для строк
        int rowNum = 0;

        // создаем подписи к столбцам (первая строчка в листе Excel файла "шапка")
        Row row = sheet.createRow(rowNum);
        row.createCell(0).setCellValue("Name");
        row.createCell(1).setCellValue("Age");
        row.createCell(2).setCellValue("Color");
        row.createCell(3).setCellValue("Volume");
        row.createCell(4).setCellValue("Max Speed");

        // заполняем лист данными
        for (Motorrad dataModel : dataList) {
            createSheetHeader(sheet, ++rowNum, dataModel);
        }

        // записываем созданный в памяти Excel документ в файл
        try (FileOutputStream out = new FileOutputStream(new File("Motorrad_DB.xls"))) {
            workbook.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Excel файл успешно создан!");
    }

    // заполнение строки (rowNum) определенного листа (sheet)
    // данными  из dataModel созданного в памяти Excel файла
    private static void createSheetHeader(HSSFSheet sheet, int rowNum, Motorrad dataModel) {
        Row row = sheet.createRow(rowNum);

        row.createCell(0).setCellValue(dataModel.getName());
        row.createCell(1).setCellValue(dataModel.getAge());
        row.createCell(2).setCellValue(dataModel.getColor());
        row.createCell(3).setCellValue(dataModel.getVolume());
        row.createCell(4).setCellValue(dataModel.getMaxSpeed());
    }

    // заполняем список данными
        private static <Motorrad> List<Motorrad> fillData() {

        List<Motorrad> dataModel = new ArrayList<>();
        for (int i = 0; i < dataModel.size(); i++) {

            dataModel.add(motorrad.getName());
            dataModel.add(motorrad.getAge());
            dataModel.add(motorrad.getColor());
            dataModel.add(motorrad.getVolume());
            dataModel.add(motorrad.getMaxSpeed());
        }
        return dataModel;
    }
}