package com.zhayujie.learn.demo.infra;

/**
 * @author yujiezha
 * @description
 * @date 2021/8/19
 */
public class IntegerTest {

    public static boolean compare(Integer a, int b) {
        return a == b;
    }

    public static boolean compare(Integer a, Integer b) {
        return a == b;
    }

    public static void main(String[] args) {
        Integer a = 100;
        Integer a1 = 100;
        Integer b = 129;
        Integer b1 = 129;
        Integer c = new Integer(100);
        Integer c1 = new Integer(100);
        Integer d = new Integer(129);
        Integer d1 = new Integer(129);

        System.out.println(compare(b, 129));
        System.out.println(compare(a, a1));
        System.out.println(compare(b, b1));
        System.out.println(compare(a, c));
        System.out.println(compare(c, c1));
    }
}
