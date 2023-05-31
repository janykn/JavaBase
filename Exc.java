class Class1{
int[] marks = new int[]{1,2,3,4,5,6};
String name = "Jana";
}

public class Exc{
    public static void main(String args[]){
        Class1 obj = new Class1();
        try{
            System.out.println(2*3);
            System.out.println(obj.name.charAt(4));//StringIndexOutOfBoundsException
            System.out.println(obj.marks[10]);//ArrayIndexOutOfBoundsException
            System.out.println(2/0);//ArithmeticException
            System.out.println("Hello");
        }
        catch(Exception e){
            System.out.println("Exception/Exceptions Found, Please Take care to Write code without exceptions");
        }
        finally{
            System.out.println("Hi");
        }
    }
}


