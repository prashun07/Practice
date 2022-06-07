class Node{
    int data;
    Node left,right;
    public Node(int val)
    {   this.data=val;
        left=right=null;
    }
}
public class MinDepth {
//    Node root;
//    int mindepth(){
//        return mindepth(root);
//    }

    private int mindepth(Node root) {
        if(root==null)
            return 0;
        if(root.left==null & root.right==null)
            return 1;
    if(root.left==null)
        return mindepth(root.right);
    if(root.right==null)
        return mindepth(root.left);
    return Math.min(mindepth(root.left),mindepth(root.right))+1;
    }

    public static void main(String args[])
    {
//        MinDepth tree=new MinDepth();
//        tree.root=new Node(1);
//        tree.root.left=new Node(2);
//        tree.root.right=new Node(3);
//        tree.root.left.left=new Node(4);
//        tree.root.left.right=new Node(5);
//
//        System.out.println("Min depth of tree is: "+ tree.mindepth());
        Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);

    MinDepth tree =new MinDepth();
        System.out.println("Min depth of tree is: "+ tree.mindepth(root));
    }
}
