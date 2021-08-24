package com.zhayujie.learn.demo.design;

/**
 * @author yujiezha
 * @description
 * @date 2021/8/23
 */
public class Singleton {
    /**
     * 1.static + volatile
     */
    private static volatile Singleton instance;

    /**
     * 2.private 构造
     */
    private Singleton() {
    }

    public static Singleton newInstance() {
        if (instance == null) {
            // 3.双检索
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.newInstance());
    }
}
