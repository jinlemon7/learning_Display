public class Computer {
    private String cpu;
    private String memory;
    private String hardDisk;
    private String gpu;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
            "cpu='" + cpu + '\'' +
            ", memory='" + memory + '\'' +
            ", hardDisk='" + hardDisk + '\'' +
            ", gpu='" + gpu + '\'' +
            '}';
    }
}