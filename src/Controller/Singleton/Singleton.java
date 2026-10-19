package Controller.Singleton;

public class Singleton {

    private Singleton(){
        System.out.println("Singleton object created");
    }

    private static class singletonHolder{
        private static Singleton instance = new Singleton();
    }

    public static Singleton instance(){
         return singletonHolder.instance;
    }
}
