class C1{
    int p;
    C1(){}
    C1(int p){
        this.p = p;
    }
}

class C2 extends C1{
    int q;
    C2(){}
    C2(int p, int q){
        this.p = p;
        this.q = q;
    }
}

class C3 extends C2{
    int r;
    C3(int p, int q, int r){
        this.p = p;
        this.q = q;
        this.r = r;
    }
    void add(){
        System.out.println(p+q+r);
    }
}
public class MultiLevelInherit {
    public static void main(String args[]){
        C3 obj = new C3(18,45,63);
        System.out.println(obj.p+obj.q+obj.r);
    }
}
