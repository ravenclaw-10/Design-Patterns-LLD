package Creational_Design_Patterns.Singleton;

public class Singleton {

// ===========EAGER LOADING===================
//
//    private static Singleton singleton;
//
//    public static Singleton getInstance() {
//        if(singleton == null) {
//            singleton = new Singleton();
//            System.out.println("Singleton instance created");
//        }
//        return singleton;
//    }


//==========LAZY LOADING (Bill Pugh Singleton)======================

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
        static {
            System.out.println("Instance created");
        }
    }
    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }

    public void showMessage() {
        System.out.println("showMessage called");
    }
}
