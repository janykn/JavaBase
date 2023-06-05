import java.util.Scanner;
class MyExc extends Exception{
    MyExc(String str){
        super(str);//str is passed to Exception superclass constructor, in implementation of Exception class, there is constructor that should be called if string is passed as argument to that constructor, which is getMessage() methodwith. This constructor has str as argument to call getMessage() => getMessage(str).
    }
}
public class UserExcep {
    public static void main(String args[]) throws MyException, MyExc {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Please Enter your Country");
        String country = Sc.nextLine();
        Scanner Sc1 = new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age = Sc1.nextInt();
        try {
            if (age < 18) {
                throw new MyExc("Please Enter if you are only above 18");
            }
            if ((country.equals("India")) || (country.equals("INDIA"))) {
                throw new MyExc("PH is Banned in your Country. Kindly use a VPN to connect to this site");
            }
            else{
                System.out.println("Welcome to PHub");
            }
        }
        catch(Exception e){
            System.out.println("Exceptions Caught");
        }
        finally{
            System.out.println("Hello and Welcome to PHub");
        }

    }

}
