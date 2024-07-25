package singleton;
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager(); //aqui a instancia já é

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}