public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        char c = 'c';
        char t = 'c';

        System.out.println(a == b); //true
        System.out.println(c == t); //true

        String str = "abc";
        String str1 = "abc";

        String str2 = new String("abc");

        System.out.println(str == str1); // true
        System.out.println(str == str2); // false

        Example3 example3 = new Example3();
        Example4 example4 = new Example4();
        System.out.println(example3.equals(example4)); //false - мы не переопределили equals, в следующий раз переопределим и получим true

        Human human = new Human(18, "Ivan");
        Human human1 = new Human(19, "Katya", false);

        System.out.println(human.getAge());
        System.out.println(human.getName());

        System.out.println(human1.isOld());
    }
}
