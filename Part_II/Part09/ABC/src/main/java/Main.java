
public class Main {

    public static void main(String[] args) {
        // write your test code here
        
        A a = new A();
        B b = new B();
        C c = new C();
        
        c.b();
        a.a();
        b.a();
        
        int n = a.num;
        System.out.println(n);
    }
}
