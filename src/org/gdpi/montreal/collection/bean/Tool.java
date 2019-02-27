package org.gdpi.montreal.collection.bean;

public class Tool<Q> {
    private  Q q;

    public Q getQ() {
        return q;
    }

    public void setQ(Q q) {
        this.q = q;
    }

    public<T> void show(T t){
        System.out.println(t);
    }
}

