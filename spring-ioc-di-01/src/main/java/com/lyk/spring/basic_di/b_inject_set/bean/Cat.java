package com.lyk.spring.basic_di.b_inject_set.bean;

/**
 * @author Mr.Liu
 * @description
 * @date 2021-08-06 23:18
 */
public class Cat {
    private String name;

    private Person master;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", master=" + master +
                '}';
    }
}
