public class Singleton {
    private static final Singleton INSTANCE = new Singleton();   //Singleton作为字段在类加载时被实例化，类加载机制强制初始化时线程唯一
    private Singleton() { }
    public static Singleton getInstance() {
        return INSTANCE;
    }
}