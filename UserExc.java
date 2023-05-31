import java.util.Scanner;

class MyException extends Exception{
   MyException(){
      System.out.println("Don't Spoil the bright age by entering this website");
   }
   MyException(String str){
      super(str);//MyException superclass Exception constructor is called, in implementation of Exception class, there is constructor that should be called if string is passed as argument to that constructor, which is getMessage() method. This constructor has str as argument to call getMessage() => getMessage(str).
   }
}
public class UserExc {
   public static void main(String args[]) throws MyException{
      Scanner Sc = new Scanner(System.in);
      System.out.println("Please Enter your Country");
      String country = Sc.nextLine();
      Scanner Sc1 = new Scanner(System.in);
      System.out.println("Please Enter your age");
      int age = Sc1.nextInt();
      if((age>21) && (age<28)){
         throw new MyException();
      }
      if(age<18){
         throw new MyException("Please Enter if you are only above 18");
      }
      else if((country.equals("India"))||(country.equals("INDIA"))){
         throw new MyException("PH is Banned in your Country. Kindly use a VPN to connect to this site");
      }
      else{
         System.out.println("Welcome to PHub");
      }
   }

}
