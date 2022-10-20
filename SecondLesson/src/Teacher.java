public class Teacher extends Human implements Sleep{
    public String subject;
    public Teacher(int age, String name, String job,String subject) {
        super(age, name, job);
        this.subject=subject;
    }

    public void doSubject(){
        System.out.println("i am teaching maths");
    }

    @Override
    public String doSleep() {
        return "im still not sleeping";
    }
}
