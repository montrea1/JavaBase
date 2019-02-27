package org.gdpi.montreal.collection.bean;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        Person p= (Person) o;
//        return this.name.equals(p.name)&&this.age==p.age;
//    }
//
//    @Override
//    public int hashCode() {
//        return 10;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

//    @Override
//    public int compareTo(Person o) {
//        int num=this.age-o.age;
//        return num==0?this.name.compareTo(o.name):num;
//    }

    @Override
    public int compareTo(Person o) {
        int num=this.name.compareTo(name);
        return num==0?this.age-o.age:num;
    }

}