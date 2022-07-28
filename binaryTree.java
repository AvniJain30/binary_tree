public class binaryTree {
    private treeNode root;

    private class treeNode{
        private treeNode left;
        private treeNode right;
        private int data;

        public treeNode(int data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
        treeNode first = new treeNode(1);
        treeNode second = new treeNode(2);
        treeNode third = new treeNode(3);
        treeNode fourth = new treeNode(4);
        treeNode fifth = new treeNode(5);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }
}
