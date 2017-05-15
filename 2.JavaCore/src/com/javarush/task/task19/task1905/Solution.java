package com.javarush.task.task19.task1905;

import javafx.print.Collation;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        Customer customer1=new Customer() {
            @Override
            public String getCompanyName() {
                return "JavaRush Ltd";
            }

            @Override
            public String getCountryName() {
                return "Ukraine";
            }
        };
        Contact contact1=new Contact() {
            @Override
            public String getName() {
                return "Ivanov, Ivan";
            }

            @Override
            public String getPhoneNumber() {
                return "+38(050)123-45-67";
            }
        };
        DataAdapter dataAdapter=new DataAdapter(customer1,contact1);

        System.out.println(dataAdapter.getCountryCode());
    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;
        public DataAdapter(Customer customer, Contact contact) {
            this.contact = contact;
            this.customer = customer;
        }

        @Override
        public String getCountryCode()
        {
            String countryCode = "";
            String countryName = customer.getCountryName();
            for (Map.Entry<String, String> pair : countries.entrySet()) {
                if (pair.getValue().equals(countryName)) countryCode = pair.getKey();
            }
            return countryCode;
        }

        @Override
        public String getCompany()
        {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName()
        {
            return contact.getName().split(", ")[1];
        }

        @Override
        public String getContactLastName()
        {
            return contact.getName().split(", ")[0];
        }

        @Override
        public String getDialString()
        {
            return "callto://" + contact.getPhoneNumber().replaceAll("[()-]", "");
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}