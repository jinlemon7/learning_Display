class Workflow {
    private ProcessNode[] nodes;
    private int size;

    public Workflow(int capacity) {
        nodes = new ProcessNode[capacity];
        size = 0;
    }

    // 添加节点到流程中
    public void addNode(ProcessNode node) {
        if (size < nodes.length) {
            nodes[size++] = node;
        }
    }

    // 返回流程的迭代器
    public Iterator iterator() {
        return new WorkflowIterator();
    }

    // 具体的迭代器实现类
    private class WorkflowIterator implements Iterator {
        private int index;

        public WorkflowIterator() {
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return nodes[index++];
            }
            return null;
        }
    }
}