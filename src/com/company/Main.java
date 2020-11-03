package com.company;

//import java.lang.reflect.Array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] a1 = new int[]{3, 4, 5, 6};
        int[] a2 = new int[]{3, 4, 5, 6};
        System.out.println("a1数组和a2数组是否相等:" + Arrays.equals(a1, a2));

        int[] b = Arrays.copyOf(a1, 6);
        System.out.println("a1数组和b数组的元素是否相等：" + Arrays.equals(a1, b));
        System.out.println("b数组的元素为：" + Arrays.toString(b));
        Arrays.fill(b, 2, 4, 1);
        System.out.println("b数组的元素为：" + Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("b数组的元素为：" + Arrays.toString(b));

        System.out.println("===================================");

        Num2Rmb nr = new Num2Rmb();
        System.out.println(Arrays.toString(nr.ddd(236711.123)));

        System.out.println(nr.toHanStr("6109"));
        String s="abcd#1234#aabb";
        String[] arr=s.split("#");
        for(String aaaa:arr)
            System.out.println(aaaa);

    }
}
