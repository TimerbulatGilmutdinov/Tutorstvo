package package1;

public class Example {
    protected int a = 5;

    protected void doSomething(){
        System.out.println("hello from example");
    }

    public void f() {
        System.out.println(a);
        doSomething();
    }

}
