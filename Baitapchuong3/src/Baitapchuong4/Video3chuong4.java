package Baitapchuong4;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Video3chuong4 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5,3,2,0,1,4,7,8,9,10,13};
        String[] names = {"Than", "Hoa", "Hung", "Khanh", "Trung", "Nam", "Tran"};
        String res = Arrays.toString(names);
        System.out.println(res);
//        Arrays.sort(arr);
//        Arrays.sort(names);
//        //int index = Arrays.binarySearch(names, "Tran");
//
//        int index = Arrays.binarySearch(names,0,5, "Tran");
//
//        System.out.println("Sau khi sap xep: ");
//        System.out.println(Arrays.toString(names));

        String[] names2 = Arrays.copyOf(names, 5);

        System.out.println("Names = " + Arrays.toString(names));

        System.out.println("Names2 = " + Arrays.toString(names2));

        System.out.println("is names equals name2 ? "+Arrays.equals(names,names2));

        int [] myArray = new int[20];
        Arrays.fill(myArray, 99);
        System.out.println(Arrays.toString(myArray));
    }

}
