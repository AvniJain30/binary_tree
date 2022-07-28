import java.util.Queue;
import java.util.LinkedList;

public class levelOrderTraversal {
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

    public void levelOrder(treeNode root){
        if(root == null){
            return;
        }
        Queue<treeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            treeNode temp = q.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null){
                q.offer(temp.left);
            }
            if(temp.right != null){
                q.offer(temp.right);
            }
        }
    }

    public static void main(String[] args){
        levelOrderTraversal l = new levelOrderTraversal();
        l.createBinaryTree();
        l.levelOrder(l.root);
    }
}
