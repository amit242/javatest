package com.test.amit.deps;

/**
 * Created by Amit on 7/28/17.
 */
public class MathDep {
    public int add(int a, int b) {
        return a+b+100;
    }

    public int sub(int a, int b, int c) {
        return a-b-100+c;
    }
}
