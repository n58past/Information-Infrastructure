public class nineteen_four {
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key)   {
        for (int i = 0; i < list.length; i++){
            if (list[i].equals(key))
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        Integer[] list = {-5,-3,-2,1,2,4,6};
        System.out.println(linearSearch(list, 3));
        System.out.println(linearSearch(list, -2));
    }
}
