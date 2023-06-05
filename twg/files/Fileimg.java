package twg.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Fileimg {
    public static void main(String[] args) throws Exception {
        //open the file in read mode
        FileInputStream obj1 = new FileInputStream("C:\\Users\\ACER\\Pictures\\IMG-20220504-WA0046.jpg");
        //open the file in write mode
        FileOutputStream obj2 = new FileOutputStream("C:\\Users\\ACER\\Pictures\\IMG-20220504-WA0046.jpg");
        int i;
        while((i=obj1.read())!=-1){
            obj2.write(i);
        }


    }

}
