package Sideback;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Fnc_1 {
    private int id;
    private String name;
    private int age;
    private String phone;
    private List<User> Listof = new ArrayList<User>();

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        Listof = new ArrayList<>();
    }

    public User() {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        Listof = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void make_new(User user) {
        Listof.add(user);
    }

    @Override
    public void cehck_all() {
        for (User u : Listof) {
            System.out.println(u);
        }
    }

    @Override
    public void edit_user(User user, User updated) {
        for (User u : Listof) {
            if (u.getId() == user.getId() && u.getName().equals(updated.getName())) {
                u.setName(updated.getName());
                System.out.println("Succes action");
            }
        }
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
