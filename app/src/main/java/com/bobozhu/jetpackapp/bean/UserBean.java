package com.bobozhu.jetpackapp.bean;

/**
 * 功能描述：
 *
 * @author BoBoZhu
 * @date 2019/3/6 0006
 */
public class UserBean {

    String name;
    int age;

    public UserBean(String name, int age) {
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
        return "UserBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
