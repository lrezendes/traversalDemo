public class TraversalDemo {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.leftChild = new Node(1);
        root.rightChild = new Node(3);
        System.out.println("3 TREE\nINORDER\n-------");
        inorder(root);
        System.out.println("\nPREORDER\n--------");
        preorder(root);
        System.out.println("\nPOSTORDER\n---------");
        postorder(root);

        root = createExample();
        System.out.println("\n\n7 TREE\nINORDER\n-------");
        inorder(root);
        System.out.println("\nPREORDER\n--------");
        preorder(root);
        System.out.println("\nPOSTORDER\n---------");
        postorder(root);
    }

    public static void inorder(Node current) {
        // left
        if(current.leftChild != null)
            inorder(current.leftChild);

        // root
        System.out.println(current.number);

        // right
        if(current.rightChild != null)
            inorder(current.rightChild);
    }

    public static void preorder(Node current) {
        //root
        System.out.println(current.number);

        //left
        if(current.rightChild != null)
            inorder(current.rightChild);

        //right
        if(current.rightChild != null)
            inorder(current.rightChild);
    }

    public static void postorder(Node current) {
        //left
        if(current.rightChild != null)
            inorder(current.rightChild);

        //right
        if(current.rightChild != null)
            inorder(current.rightChild);

        //root
        System.out.println(current.number);
    }

    public static Node createExample() {
        Node ten = new Node(1);
        Node three = new Node(2);
        Node fifteen = new Node(3);
        Node one = new Node(4);
        Node seven = new Node(5);
        Node twelve = new Node(6);
        Node twenty = new Node(7);

        ten.leftChild = three;
        ten.rightChild = fifteen;
        three.leftChild = one;
        three.rightChild = seven;
        fifteen.leftChild = twelve;
        fifteen.rightChild = twenty;

        return ten;
    }
}