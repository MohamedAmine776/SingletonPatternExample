public class Singleton {
    public static Singleton instance =new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Singleton message");
    }
}
