public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer(18, "oleg", "back ender", "java");
        Teacher teacher = new Teacher(40,"alex","teacher", "physics");

        System.out.println(programmer.age);
        programmer.printHello();
        /*
        Восходящее преобразование, то есть потомка мы приравниваем в функционале к родителю (обрезаем
        функционал потомка), тогда в объекте human не будут доступны методы, которые реализованы
        в классе Programmer, но не
        реализованы в классе Human, реализация пересекающихся методов будет взята из класса,
        указанного после оператора new, в этом случае у Programmer, поэтому
         */
        Human human = new Programmer(29,"oleg","programmer","php");

        // ошибка, потому что функционал потомка обрезается до родительского и этот метод стал недоступен
        // human.doJob();

        register(human); // передаем Human
        register(programmer); // передаем наследника Human
        register(teacher); //передаем наследника Human

        t(programmer);
        t(teacher);

        Sleep sleep;
        Sleep sleep1;

        // можем подставить объект любого класса, реализующего интерфейс sleep
        sleep = programmer;
        sleep1 = teacher;

        System.out.println(sleep1.doSleep());

    }

    /*
    В качестве параметров метода мы можем передать интерфейс, тогда метод принимает в себя объекты
    всех классов, которые реализуют этот интерфейс, таким образом достигается гибкость и независимость
    метода от конкретной реализации
     */
    public static void t(Sleep sleep){
        System.out.println(sleep.doSleep());
    }

    /*
    В качестве параметра мы также можем передать объект какого-то класса, тогда метод принимает в себя
    как объекты заявленного класса, так и любой класс который является наследником этого класса.
    То есть в этом примере метод register принимает в себя как класс Human, так и все классы, которые
    наследуются от этого класса, в нашем случае мы можем спокойно передать Programmer, Teacher
     */
    public static void register(Human human){
        human.doF();
    }
}
