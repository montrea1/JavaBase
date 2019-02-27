package org.gdpi.montreal.collection.bean;

public class Student extends Person{

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int compareTo(Person o) {
        return super.compareTo(o);
    }
}
