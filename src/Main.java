public class Main {

    public static void main(String[] args) {

//        int[] arr = new int[]{1,2,3,4,5};
//        int[] newArr = ArrayRotate.rotate(arr, 2);
//        System.out.println(newArr[2]);

        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(7);
        list.print();
        System.out.println(list.search(7));

    }
}
