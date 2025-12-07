public class GamingComputerBuilder extends ComputerBuilder {
    @Override
    public void buildCpu() {
        computer.setCpu("Intel i9");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("32GB DDR5");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("1TB NVMe SSD");
    }

    @Override
    public void buildGpu() {
        computer.setGpu("NVIDIA RTX 4090");
    }
}