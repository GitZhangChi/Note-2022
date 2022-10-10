package com.example.gof;

public class Singleton {
    private volatile static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstanceV1() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    private static class InstanceHolder {
        private static final Singleton INNER = new Singleton();
    }

    public static Singleton getInstanceV2() {
        return InstanceHolder.INNER;
    }

}
