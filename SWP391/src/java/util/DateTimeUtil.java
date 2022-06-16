/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DateTimeUtil {

    public static LocalDate getStartDateDefault() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        LocalDate start = LocalDate.parse(sdf.format(date), DateTimeFormatter.ISO_LOCAL_DATE).minusDays(6);
        return start;
    }
    public static LocalDate getStartDate(String date) {
        LocalDate start = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        return start;
    }
    public static LocalDate getEndDate(String date) {
        LocalDate end = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        return end.plusDays(1);
    }
    public static LocalDate getEndDateDefault() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        LocalDate end = LocalDate.parse(sdf.format(date), DateTimeFormatter.ISO_LOCAL_DATE).plusDays(1);
        return end;
    }
    public static List<String> getStringOfDateItems(LocalDate start, LocalDate end){
        List<String> list = new ArrayList<>();
        for (LocalDate i = start; i.compareTo(end) < 0; i = i.plusDays(1)) {
            list.add(i.toString());
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(getStringOfDateItems(getStartDateDefault(), getEndDateDefault()).get(6));
    }
}
