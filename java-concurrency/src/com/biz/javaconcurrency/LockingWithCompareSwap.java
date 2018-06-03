package com.biz.javaconcurrency;

public class LockingWithCompareSwap {

	long count = 0;

    public void inc() {
        synchronized(this) {
            count++;
        }
    }

    public long count() {
        synchronized(this) {
            return this.count;
        }
    }
}
