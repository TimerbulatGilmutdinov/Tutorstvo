public class Example3 {
    private int a = 5;

    public int getA() {
        return a; //геттер позволяет вам получить private-переменную вашего класса
    }

    public void setA(int a) {
        this.a = a; //сеттер позволяет вам присвоить private-переменной новое значение
    }

    public void writeMyNumber(){
        getMyNumber(5); //используете свою логику в публичном методе
    }

    private int getMyNumber(int a){
        return a*a; //в private-методе находится ваша логика, которую вы не хотите показывать другим и давать доступ к ней
    }

}
