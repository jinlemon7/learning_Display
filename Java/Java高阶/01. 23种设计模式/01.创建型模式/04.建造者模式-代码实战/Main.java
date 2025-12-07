public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new GamingComputerBuilder();
        Director director = new Director(builder);
        Computer gamingPc = director.construct();
        System.out.println(gamingPc);
    }
}