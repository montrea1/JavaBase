package org.gdpi.montreal.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class Demo3_Vector {

    public static void main(String[] args) {
        Vector v=new Vector();
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        Enumeration en=v.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
