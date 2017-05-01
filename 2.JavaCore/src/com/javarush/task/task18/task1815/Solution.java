package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface {

        private ATableInterface origin;

        public TableInterfaceWrapper(ATableInterface origin) {
            this.origin = origin;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            origin.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return origin.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            origin.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}