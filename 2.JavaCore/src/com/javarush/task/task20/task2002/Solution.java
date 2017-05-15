package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("D:/your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут

            javaRush.users.add(new User());
            javaRush.users.get(0).setFirstName("Olex");
            javaRush.users.get(0).setLastName("Figel");
            javaRush.users.get(0).setBirthDate(new Date(31312313));
            javaRush.users.get(0).setMale(true);
            javaRush.users.get(0).setCountry(User.Country.UKRAINE);


            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            if (this.users.size() > 0)
            {
                for (int i = 0; i < users.size(); i++) {
                    writer.println(users.get(i).getFirstName());
                    writer.println(users.get(i).getLastName());
                    writer.println(users.get(i).getBirthDate().getTime());
                    writer.println(users.get(i).isMale());
                    writer.println(users.get(i).getCountry());

                }
            }
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String userLine;
            int count = 0;
            while (reader.ready())
            {
                this.users.add(new User());
                this.users.get(count).setFirstName(reader.readLine());
                this.users.get(count).setLastName(reader.readLine());
                this.users.get(count).setBirthDate(new Date(Long.parseLong(reader.readLine())));
                if (reader.readLine().equals("true")) {
                    this.users.get(count).setMale(true);
                } else {
                    this.users.get(count).setMale(false);
                }
                this.users.get(count).setCountry(User.Country.valueOf(reader.readLine()));
                count++;
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
