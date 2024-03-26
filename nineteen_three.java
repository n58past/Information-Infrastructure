import java.util.Scanner;
import java.util.ArrayList;

public class nineteen_three {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> initialList = new ArrayList<Integer>();

        initialList.add(1);
        initialList.add(4);
        initialList.add(3);
        initialList.add(4);
        initialList.add(2);

        System.out.println("Initial list:  " + initialList);

        ArrayList<Integer> distinctList = removeDuplicates(initialList);

        System.out.println("Distinct list: " + distinctList);
    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> resultList = new ArrayList<E>();
        
        list.stream().filter((e) -> (!resultList.contains(e))).forEachOrdered((e) -> {
            resultList.add(e);
            });
        
        return resultList;
    }
}