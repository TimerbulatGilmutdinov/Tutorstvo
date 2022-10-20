public abstract class AbstractHuman {
    public int age;
    public String name;
    public String job;

    public AbstractHuman(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    public void g(){
        System.out.println("hello from abstract");
    }

    public abstract void h();

}
