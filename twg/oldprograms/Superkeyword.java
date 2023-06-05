class Superclass1{
    int p, q, r;
    int x = 450; // initializing instance variable manually. This is static work. computers don't work like this. it has to read user inputs
    Superclass1(){} // initializing instance variable using default constructor.
    Superclass1(int p, int q, int r){ // initializing instance variable using parameterized constructor. This is dynamic work. computers work like this. it has to read user inputs
        this.p =p;
        this.q = q;
        this.r = r;
    }
    int add(){
        return (p+q+r);
    }
}

class SubClass1 extends Superclass1{
    int s,t;
    SubClass1(){}
    SubClass1(int p, int q, int r, int s, int t){
        /*instead of writing
        this.p = p;
        this.q = q;
        this.r = r;
        since we already wrote this in superclass, we can reuse that constructor in subclass in child class using super keyword
         */
        super(p,q,r);
        this.s = s;
        this.t = t;
    }
    int newadd(){
        return (super.add()+super.x+s+t); //calling superclass method and superclass variable
    }

}
    public class Superkeyword{
    public static void main(String... janykn){
        SubClass1 obj = new SubClass1(9,6,7,3,45);
        System.out.println(obj.newadd());
        }
    }


