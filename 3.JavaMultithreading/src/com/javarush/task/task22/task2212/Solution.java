package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
//        return  (telNumber.matches("^\\+(\\d[\\-\\(\\)]?){11}\\d$") || telNumber.matches("^[\\(\\d]-?(\\d[\\-\\)]?){8}\\d$"))
//                && telNumber.matches("^(\\+)?(\\d)*(\\(\\d{3}\\))?(\\d+-?\\d+-?)?\\d+$");
        if (telNumber != null)
        {
            if (telNumber.matches("^\\+[0-9]{12}")) {
                return true;
            } else if (telNumber.matches("^\\+\\d{2}\\(\\d{3}\\)\\d{7}")) {
                return true;
            } else if (telNumber.matches("^\\+\\d{8}-\\d{2}-\\d{2}")) {
                return true;
            } else if (telNumber.matches("\\d{6}-\\d{4}")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
