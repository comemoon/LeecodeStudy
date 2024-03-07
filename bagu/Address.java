package bagu;

import lombok.Data;

/**
 * @program: niukecode
 * @description: 浅拷贝
 * @author: comemoon_win001
 **/

public class Address implements Cloneable{
    private  String name;

    public Address(String name) {
        this.name = name;
    }

    @Override
    public Address clone()  {
        try {
            return (Address)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person(new Address("武汉"));
        Person person1Copy = person1.clone();
// true
        System.out.println(person1.getAddress() == person1Copy.getAddress());

    }
}

class Person implements Cloneable {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public Person(Address address) {
        this.address = address;
    }

    // 省略构造函数、Getter&Setter方法
    @Override
    public Person clone() {
        try {
            Person person = (Person) super.clone();
            return person;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
