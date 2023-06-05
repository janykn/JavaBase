class A{
    int p;
    A(){}
    A(int p){
        this.p = p;
    }
}
class B extends A{
    int q;
    B(){}
    B(int p, int q){
        this.p = p;
        this.q = q;
    }
}
class C extends A{
    int r;
    C(){}
    C(int p, int r){
        this.p = p;
        this.r = r;
    }
}
public class HierarchialInheritance {
    static public void main(String... janykn){
        C obj = new C(23, 16);
        System.out.println(obj.p+obj.r);
    }
}