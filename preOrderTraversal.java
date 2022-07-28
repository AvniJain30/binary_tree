import java.util.Stack;
public class preOrderTraversal {
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
        treeNode first = new treeNode(9);
        treeNode second = new treeNode(2);
        treeNode third = new treeNode(3);
        treeNode fourth = new treeNode(4);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
    }
    public void preOrder(treeNode root){      // recursive traversal method
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void preOrderTraverse(treeNode root){      // iterative traversal method
        if(root == null){
            return;
        }
        Stack<treeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            treeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }

    public static void main(String[] args){
        preOrderTraversal p = new preOrderTraversal();
        p.createBinaryTree();
        p.preOrder(p.root);
        p.preOrderTraverse(p.root);
    }
}
