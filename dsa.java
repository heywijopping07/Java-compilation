/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ 
package main;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author EdWin
 */
public class dsa {   
    //for nodes
    static class Node {
        int item;
        Node left, right;

        public Node(int key) {
            item = key;
            left = right = null;
        }
    }
    //for tree and binary tree
    static class Tree {
        // root of Tree
        Node root;

        Tree() {
            root = null;
        }

        // method to count leaf nodes
        public int countLeaf(Node node) {
            if (node == null) {
                return 0;
            }
            // if left and right of the node are null
            // it is a leaf node
            if (node.left == null && node.right == null) {
                return 1;
            } else {
                return countLeaf(node.left) + countLeaf(node.right);
            }
        }
    }
    //for linked list
    static class CircularLinkedList {
        public class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
            }
        }
        public Node head = null;
        public Node tail = null;

        public void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
                newNode.next = head;
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }
        public void display() {
            Node current = head;
            if (head == null) {
                System.out.println("List is empty");
            } else {
                System.out.println("\nNodes of the circular linked list: ");
                do {
                    System.out.print(" " + current.data);
                    current = current.next;
                } while (current != head);
                System.out.println();
            }
        }
    }
    //for queue ciphertext
    private static String encrypt(String plaintext, int k){
        StringBuilder encryptedText = new StringBuilder();
        for(int i=0; i<plaintext.length(); i++){
            char currentChar = plaintext.charAt(i);
            if(Character.isLetter(currentChar)){
                char encryptedChar = (char)
                        ((currentChar-'A'+k)% 26+'A');
                        encryptedText.append(encryptedChar);
            } else {
                encryptedText.append(currentChar);
            }
        }
        return null;
    }
     //for graphs
    static class Graph {
    // inner class
    // to keep track of 
        class Edge {
             int src, dest;
         }
        // number of vertices and 
        int vertices, edges;  
        // array to store all 
        Edge[] edge;  
        Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;
    
        // initialize the edge array 
        edge = new Edge[edges]; 
        for(int i = 0; i < edges; i++) {
            // each element of the edge array
            // is an object of Edge 
            edge[i] = new Edge();
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.print("\t    Portfolio in DSA");
        System.out.println("\n\tWindy Pausanos - BSIS 202");
        System.out.println("----------------------------------------");
        System.out.println("Menu: ");
        System.out.println("[1] List ");
        System.out.println("[2] Linked List ");
        System.out.println("[3] Stack ");
        System.out.println("[4] Queue ");
        System.out.println("[5] Tree ");
        System.out.println("[6] Binary Tree ");
        System.out.println("[7] Graph ");
        System.out.println("----------------------------------------");
        System.out.print("Choose a number you want to open: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("\nList ");
                List<String> list = new ArrayList<>();
                list.add("please");
                list.add("don't");
                list.add("be");
                list.add("inlove");
                list.add("with");
                list.add("someone");
                list.add("else!!");
                System.out.println("List: " + list.toString());
                break;
            }
            
            case 2: {
                System.out.println("\nLinked List ");
                System.out.print("Enter data for 1st node: ");
                int data1 = in.nextInt();
                System.out.print("Enter data for 2nd node: ");
                int data2 = in.nextInt();
                System.out.print("Enter data for 3rd node: ");                
                CircularLinkedList cl = new CircularLinkedList();
                int data3 = in.nextInt();
                System.out.print("Enter data for 4th node: ");
                int data4 = in.nextInt();
                System.out.print("Enter data for 5th node: ");
                int data5 = in.nextInt();
                System.out.print("Enter data for 6th node: ");
                int data6 = in.nextInt();
                System.out.print("Enter data for 7th node: ");
                int data7 = in.nextInt();
                System.out.print("Enter data for 8th node: ");
                int data8 = in.nextInt();
                System.out.print("Enter data for 9th node: ");
                int data9 = in.nextInt();
                System.out.print("Enter data for 10th node: ");
                int data10 = in.nextInt();
        
                //Adds data to the circular link list  
                cl.add(data1);  
                cl.add(data2);  
                cl.add(data3); 
                cl.add(data4);
                cl.add(data5);
                cl.add(data6);
                cl.add(data7);
                cl.add(data8);
                cl.add(data9);
                cl.add(data10);
                cl.display();
                int sum;
                sum = data1 + data2 + data3 + data4 + data5 + data6 + data7 + data8 + data9 + data10;
                System.out.print("\nThe sum of all data is " + sum);
                break;
            }
            
            case 3: {
                System.out.println("\nStack ");
                Stack<Integer> stack = new Stack<>();

                while (true) {
                    System.out.println("STACK OPERATIONS");
                    System.out.println("[1] - Push");
                    System.out.println("[2] - Pop");
                    System.out.println("[3] - Print");
                    System.out.println("[4] - Top");
                    System.out.println("[0] - Exit");
                    System.out.print("ENTER YOUR CHOICE: ");
                    int ch = in.nextInt();

                    switch (ch) {
                        case 1: {
                            System.out.print("ENTER THE ELEMENT TO PUSH: ");
                            int element = in.nextInt();
                            stack.push(element);
                            System.out.println(element + " got pushed onto the stack. \n");
                            break;
                        }
                        case 2: {
                            if (!stack.isEmpty()) {
                                int poppedElement = stack.pop();
                                System.out.println("Popped element: \n" + poppedElement);
                            } else {
                                System.out.println("Stack is empty. Cannot pop.\n");
                            }
                            break;
                        }
                        case 3: {
                            if (!stack.isEmpty()) {
                                System.out.print("Stack: ");
                                for (Integer item : stack) {
                                    System.out.print(item + " ");
                                }
                                System.out.println();
                            } else {
                                System.out.println("Stack is empty. \n");
                            }
                            break;
                        }
                        case 4: {
                            System.out.println("Top: \n " + stack.peek());
                            break;
                        }
                        case 0: {
                            System.out.println("Exiting Stack operations.");
                            System.exit(0);
                        }
                        default:
                            System.out.print("\nInvalid input!!\n");
                            break;
                    }
                }
            }
               
            case 4: {
                System.out.println("\nQueue ");                     
                        System.out.println("Cipher Text");
                        System.out.print("Enter the plaintext: ");
                        String plaintext = in.nextLine().toUpperCase();
                        System.out.print("\nEnter the value of k: ");
                        int k = in.nextInt();
                        System.out.println("----------------------------------------");
                        String ciphertext = encrypt(plaintext, k);
                        System.out.println("Ciphertext: "+ ciphertext); //the output
                        System.out.println("Cipher Done ");
                        in.close();                             
                break;
            }
            
            case 5: {
                System.out.println("\nTree ");
                Tree tree = new Tree();

                // create nodes of tree
                tree.root = new Node(1);
                tree.root.left = new Node(2);
                tree.root.right = new Node(3);
                // create child nodes of left child 2
                tree.root.left.left = new Node(4);
                tree.root.left.right = new Node(5);
                // create child nodes of right child 3
                tree.root.right.left = new Node(6);
                tree.root.right.right = new Node(7);

                // call method to count leaf nodes
                int leafNodes = tree.countLeaf(tree.root);
                System.out.println("Total Leaf Nodes = " + leafNodes);
                break;
            }
            
            case 6: {
                System.out.println("\nBinary Tree ");
                Tree tree = new Tree();

                // create nodes of tree
                tree.root = new Node('P');
                tree.root.left = new Node('G');
                tree.root.right = new Node('W');
                // create child nodes of left child g
                tree.root.left.left = new Node('c');
                tree.root.left.right = new Node('k');
                // create child nodes of right child w
                tree.root.right.left = new Node('s');
                tree.root.right.right = new Node('y');
                // create child nodes of left left child c
                tree.root.left.left.left = new Node('a');
                tree.root.left.left.right = new Node('e');
                // create child nodes of left right child k
                tree.root.left.right.left = new Node('i');
                tree.root.left.right.right = new Node('e');
                // create child nodes of right left child s
                tree.root.right.left.left = new Node('q');
                tree.root.right.left.right = new Node('u');
                // create child nodes of right right child y
                tree.root.right.right.left = new Node('x');
                tree.root.right.right.right = new Node('z');

                // call method to count leaf nodes
                int leafNodes = tree.countLeaf(tree.root);
                System.out.println("Total Leaf Nodes = " + leafNodes);
                break;
            }
            
            case 7: {
                System.out.println("\nGraph ");
                // create an object of Graph 
                int noVertices = 10;
                int noEdges = 13;
                
                Main.Tree.Graph g = new Main.Tree.Graph(noVertices, noEdges);
                // create graph
                g.edge[0].src = 1; // edge 1---2
                g.edge[0].dest = 2;
                g.edge[1].src = 1; // edge 1---3
                g.edge[1].dest = 3;
                g.edge[2].src = 1; // edge 1---4
                g.edge[2].dest = 4;
                g.edge[3].src = 2; // edge 2---4
                g.edge[3].dest = 4;
                g.edge[4].src = 2; // edge 2---5
                g.edge[4].dest = 5;
                g.edge[5].src = 3; // edge 3---4
                g.edge[5].dest = 4;
                g.edge[6].src = 3; // edge 3---5
                g.edge[6].dest = 5;
                g.edge[7].src = 4; // edge 4---5
                g.edge[7].dest = 5;
                g.edge[8].src = 5; // edge 5---6
                g.edge[8].dest = 6; 
                g.edge[9].src = 6; // edge 6---7
                g.edge[9].dest = 7; 
                g.edge[10].src = 7; // edge 7---8
                g.edge[10].dest = 8; 
                g.edge[11].src = 8; // edge 8---9
                g.edge[11].dest = 9; 
                g.edge[12].src = 9; // edge 9---10
                g.edge[12].dest = 10; 
                
                // print graph
                for(int i = 0; i < noEdges; i++) { 
                    System.out.println(g.edge[i].src + " - " + g.edge[i].dest);
                }
                break;
            }
            default:
                System.out.println("\nInvalid input!! ");
        }
    }
}

