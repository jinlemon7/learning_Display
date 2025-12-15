class ProcessNode {
    private String name;

    public ProcessNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ProcessNode{name='" + name + "'}";
    }
}