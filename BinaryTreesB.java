import java.util.*;

import javax.swing.plaf.nimbus.State;
public class BinaryTreesB{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
         if(nodes[idx]==-1){
            return null;
         }
         //create the newNode 
         Node newNode=new Node(nodes[idx]);
         newNode.left=buildTree(nodes);
         newNode.right=buildTree(nodes);
          return newNode;
        }

        //level order traverse
        public  static void  levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
    
            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode ==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left !=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    //preorder Traverse on the Binary tree
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    //Inorder Traverse on the Binary tree
     public static void InOrder(Node root){
        if(root==null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
     }

     //postorder Traverse on the Binary tree
     public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    
   
    public static void main(String[] args) {
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        //preorder(root);
        //InOrder(root);
        //postorder(root);
        //tree.levelOrder(root);


    }

}

   


