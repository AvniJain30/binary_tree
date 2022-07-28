public class findMaxValue {
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
        treeNode third = new treeNode(8);
        treeNode fourth = new treeNode(4);
        treeNode fifth = new treeNode(5);
        treeNode sixth = new treeNode(6);
        treeNode seventh = new treeNode(9);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }

    public int findMax(treeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if(left > result){
            result = left;
        }
        if(right > result){
            result = right;
        }

        return result;
    }

    public static void main(String[] args){
        findMaxValue f = new findMaxValue();
        f.createBinaryTree();
        System.out.println(f.findMax(f.root));
    }
}
