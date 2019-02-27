package org.gdpi.montreal;

public class HSingleton {
    private final static HSingleton  INSTANCE=new HSingleton();

    private HSingleton(){};

    public static HSingleton getInstance(){
        return INSTANCE;
    }

}
