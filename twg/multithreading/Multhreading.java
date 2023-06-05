package twg.multithreading;

//Thread class provide constructors and methods to create and perform operations on a thread.
// Thread class extends Object class and implements Runnable interface.
class Mythread extends Thread{ //you can write implements Runnable or extends Thread

    @Override
    public void run() {//tell the main agenda of thread (what this thread should do) in run() method)
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        for (int i:nums) {
            System.out.println(i);
        }
    }
}
public class Multhreading {//like normal, in multithreading also, at a time one thread is executed only. If that thread stops even for 1ms, then the 2nd thread starts executing

    public static void main(String[] args) {

        //below 3 lines are used to create a thread
        Mythread obj2 = new Mythread();// create object of your thread class
        Thread obj3 = new Thread(obj2);
        obj3.start();//to start execution of thread
    }


}
