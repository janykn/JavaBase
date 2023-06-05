package twg.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileEx {
    public static void main(String[] args) throws Exception {

        FileWriter obj3 = new FileWriter("D:\\JavaTrash\\foods.txt", true); //if we don't write true, filewriter removes old content. since we wrote true, it appends
        BufferedWriter obj4 = new BufferedWriter(obj3);

        //char[] c = {'h', 'e', 'l', 'l', 'o'};
        //obj4.write(c, 3, 2);

        String str = "HI";
        obj4.write(str);


        FileReader obj = new FileReader("D:\\JavaTrash\\foods.txt");
        BufferedReader obj2 = new BufferedReader(obj);

        String s;
        while((s = obj2.readLine()) != null){
            System.out.println(s);
        }

    }
    }
