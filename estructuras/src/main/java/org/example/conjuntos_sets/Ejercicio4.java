package org.example.conjuntos_sets;

import java.util.TreeSet;

public class Ejercicio4 {

    public static void main(String[] args) {

        TreeSet<Integer> nums1 = new TreeSet<>();
        TreeSet<Integer> nums2 = new TreeSet<>();

        nums1.add(1);
        nums1.add(3);
        nums1.add(9);
        nums1.add(4);
        nums1.add(5);

        nums2.add(6);
        nums2.add(7);
        nums2.add(2);
        nums2.add(8);
        nums2.add(10);
        nums2.add(11);

        System.out.println(nums1);
        System.out.println(nums2);

        TreeSet<Integer> nums3 = new TreeSet<>();

        while (!nums1.isEmpty() || !nums2.isEmpty()){
            if (!nums1.isEmpty()){
                nums3.add(nums1.pollFirst());
            } else {
                nums3.add(nums2.pollFirst());
            }
        }

        System.out.println(nums3);






    }

}
