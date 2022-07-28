import java.util.Stack;

public class postOrderTraversal {
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
        treeNode sixth = new treeNode(6);
        treeNode seventh = new treeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }

    public void postOrder(treeNode root){       //recursive traversal method
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }

    public void postOrderTraverse(treeNode root){     // iterative traversal method
        treeNode current = root;
        Stack<treeNode> stack = new Stack<>();

        while(current != null || !stack.isEmpty()){
            if(current != null){
                stack.push(current);
                current = current.left;
            }
            else{
                treeNode temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while(!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                }
                else{
                    current = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        postOrderTraversal p = new postOrderTraversal();
        p.createBinaryTree();
        //p.postOrder(p.root);
        p.postOrderTraverse(p.root);
    }
}
