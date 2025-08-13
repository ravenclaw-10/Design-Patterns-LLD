package Creational_Design_Patterns.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
        singleton.showMessage();
    }
}
