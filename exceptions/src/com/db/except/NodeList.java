package com.db.except;

public class NodeList {
    public Node start;

    public class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        Node(){

        }
    }

    public NodeList(){

    }

    void printList(){
        Node currentNode = start;
        while(currentNode != null){
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }

    }

    void addNode(int value){
        Node newNode = new Node(value);
        if(start == null){
            start = newNode;
        }else {
            Node currentNode = start;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public static void main(String[] args){
        NodeList nodeList = new NodeList();
        nodeList.addNode(13);
        nodeList.addNode(223);

        nodeList.printList();
    }

}
