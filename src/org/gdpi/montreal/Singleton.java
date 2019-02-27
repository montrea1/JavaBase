package org.gdpi.montreal;

public class Singleton {
    private Singleton(){}

    private  static  class SingletonInstance{
        private static final Singleton INSTANCE=new Singleton();
    }

    private  static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}


