import java.util.Scanner;
import java.util.ArrayList;

public class nineteen_two<E> {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        GenericStack<String> testStack = new GenericStack<String>();

        // User input
        System.out.print("Enter 5 strings: ");
        for (int i = 0; i < 5; i++){
            testStack.push(input.nextLine());
        }

        System.out.println();

        // Display in reverse order
        while (!testStack.isEmpty()){
            System.out.println(testStack.pop() + " ");
        }

    }
}

class GenericStack<E> extends ArrayList<E>{

    // Returns item on the top of stack
    public E peek() {
        return get(size() - 1);
    }

    // Adds item to top of the stack
    public void push(E o) {
        add(o);    
    }

    // Removes and returns item on top of stack
    public E pop() {
        E o = get(size() - 1); 
        remove(size() - 1); 
        return o;
    }


    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}