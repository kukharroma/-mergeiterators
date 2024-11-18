package org.merge.proxy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        testCase1();

        testCase2();

        testCase3();
    }


    private static void testCase1(){
        List<Integer> list1 = Arrays.asList(6, 8, 19, 21, 32, 66, 67, 77, 89);
        List<Integer> list2 = Arrays.asList(1, 3, 5, 24, 33, 45, 57, 59, 89);
        List<Integer> list3 = Arrays.asList(2, 4, 9, 18, 22, 44, 46, 89, 89);

        testMerge(list1, list2, list3);

    }

    private static void testCase2(){
        List<Integer> list1 = Arrays.asList(11, 14, 19, 44, 82, 916, 1227, 7411, 9999);
        List<Integer> list2 = Arrays.asList(111, 123, 140, 244, 333, 445, 570, 590, 890);
        List<Integer> list3 = Arrays.asList(20, 40, 90, 108, 120, 144, 186, 223, 244);

        testMerge(list1, list2, list3);
    }

    private static void testCase3(){
        List<Integer> list1 = Arrays.asList(123, 413, 1232, 13423, 123322, 125322, 143322, 193322);
        List<Integer> list2 = Arrays.asList(11, 13, 15, 124, 133, 145, 157, 159, 189);
        List<Integer> list3 = Arrays.asList(12, 14, 19, 118, 122, 144, 146, 189, 1289);

        testMerge(list1, list2, list3);
    }

    private static void testMerge(List<Integer> list1, List<Integer> list2, List<Integer> list3) {
        Iterator<Integer> it1 = list1.iterator();
        Iterator<Integer> it2 = list2.iterator();
        Iterator<Integer> it3 = list3.iterator();

        MergedIterator mergedIterator = new MergedIterator(Arrays.asList(it1, it2, it3));

        while (mergedIterator.hasNext()) {
            System.out.print(mergedIterator.next() + " ");
        }

        System.out.println();
    }

}
