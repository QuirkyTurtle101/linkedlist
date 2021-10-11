public class llprog{
    public static void main(String []args){
        int[] ints = {5, 13, 2, 7, 198, 83, 1, 24};
        
        LinkedList test;
        for(int num : ints){
            if(test == null){
                test = new LinkedList();
                test.initialize(ints[num]);
            } else {
                test.add(num);
            }
        }
        
    }
    
    
}

private class LinkedList{
    Node first;
    
    void initialize(int value){
        first = new node(value);
    }
    
    void append(int value){
        getLastNode().next = new Node(value);
    }
    
    Node getLastNode(){
        Node current = first;
        while(current.link != null){
            current = current.link;
        }
        return current;
    }
    
    public void listAll(){
        Node current = first;
        
        System.out.println(current.getValue());
        if(link != null){
            link.listAll();
        }
    }
}

private class Node{
    int value;
    Node link;
    
    public Node(int _value){
        value = _value;
    }
    
    public void search(int target){
        if(value == target){
            return value;
        } else if(link != null){
            link.search(target);
        }
    }
    
    public void setValue(int input){
        value = input;
    }
    
    public int getValue(){
        return value;
    }
}