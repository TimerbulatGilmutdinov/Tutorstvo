public class Human {
    public int age;
    public String name;
    public String job;

    protected int a;

    public Human(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }


    public void printHello(){
        System.out.println("Hello from human");
    }


    private String getString(){
        return "python";
    }

    public void f(){
        System.out.println(getString());
    }

    public void doF(){
        printHello();
    }
}
