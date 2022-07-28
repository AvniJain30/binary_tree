import java.util.Stack;
public class inOrderTraversal {
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

    public void inOrder(treeNode root){       //recursive traversal method
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void inOrderTraverse(treeNode root){       // iterative traversal method
        if(root == null){
            return;
        }
        Stack<treeNode> stack = new Stack<>();
        treeNode temp = root;

        while(!stack.isEmpty() || temp != null){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;
            }
            else{
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public static void main(String[] args){
        inOrderTraversal p = new inOrderTraversal();
        p.createBinaryTree();
        p.inOrder(p.root);
        p.inOrderTraverse(p.root);
    }
}
