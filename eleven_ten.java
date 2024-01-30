import java.util.Scanner;
import java.util.ArrayList;

public class eleven_ten {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String sentence;
        MyStack Strings = new MyStack();

        // User input
        for (int i = 1; i < 6; i++){
            System.out.print("Enter string " + i + " for reversal: ");
            sentence = input.nextLine();
            Strings.push(sentence);
        }
        
        // Output
        System.out.println("In reverse order");
        
        // Takes top element of stack and displays
        // thus reverse order
        for (int i = 0; i < 5; i++){
            System.out.println(Strings.pop());
        }
    }
}

// MyStack class 
class MyStack extends java.util.ArrayList {
    private ArrayList<Object> list = new ArrayList<>();

    // Returns True/False for if list is empty
    public boolean isEmpty() { 
        return list.isEmpty();
    }

    // Returns length of list
    public int getSize() {
        return list.size();
    }

    // Returns top of stack element
    public Object peek() {
        return list.get(0);
    }

    // Returns and removes top of stack element
    public Object pop() {
        Object o = list.get(0); 
        list.remove(0);
        return o;
    }

    // Adds element to top of stack
    public void push(Object o) {
        list.add(0, o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}