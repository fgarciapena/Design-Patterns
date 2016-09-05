package patterns.singleton;

public class ASingleton {
    private static ASingleton instance;

    private ASingleton(){}

    public static ASingleton getInstance(){
        if(instance == null)
            instance = new ASingleton();
        return instance;
    }
}
