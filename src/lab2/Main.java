package lab2;

public class Main {
    public static void main(String[] args){
        //lab1 - Array
//        Array obj = new Array();
//        int[] arr = obj.readArray();
//        obj.printArray(arr);
//        obj.bubbleSort(arr);
//        obj.printArray(arr);
        //lba2 - IntLinkedList
        IntLinkedList list = new IntLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // remove
        list.remove(2);
        System.out.println(list);

        // find
        System.out.println(list.find(2));
        System.out.println(list.find(6));

    }
}
