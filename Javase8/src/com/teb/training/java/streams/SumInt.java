package com.teb.training.java.streams;


public class SumInt {

    private int total = 0;

    public void add(final int val) {
        this.total += val;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(final int totalParam) {
        this.total = totalParam;
    }
}
