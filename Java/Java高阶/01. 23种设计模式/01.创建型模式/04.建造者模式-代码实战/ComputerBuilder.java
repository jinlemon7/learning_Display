public abstract class ComputerBuilder {
    protected Computer computer = new Computer();

    public abstract void buildCpu();
    public abstract void buildMemory();
    public abstract void buildHardDisk();
    public abstract void buildGpu();

    public Computer getResult() {
        return computer;
    }
}