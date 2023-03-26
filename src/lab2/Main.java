package lab2;

public class Main {
    public static void main(String[] args){
        //lab1 - Array
//        Array obj = new Array();
//        int[] arr = obj.readArray();
//        obj.printArray(arr);
//        obj.bubbleSort(arr);
//        obj.printArray(arr);
        //lba2 - Rational
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 4);
        Rational r3 = r1.multiply(r2);
        Rational r4 = r1.divide(r2);
        Rational r5 = r1.plus(r2);
        Rational r6 = r1.minus(r2);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

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
