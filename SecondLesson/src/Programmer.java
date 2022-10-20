public class Programmer extends Human implements Sleep {
    public String language;

    public Programmer(int age, String name, String job, String language) {
        super(age, name, job);
        this.language = language;
    }

    @Override
    public void printHello(){
        System.out.println("Bye from programmer");
    }

    public void doJob(){
        System.out.println("i'm writing some code");
    }


    @Override
    public String doSleep() {
        return "im sleeping";
    }
}
