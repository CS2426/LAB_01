package org.example;
import java.util.ArrayList;
import java.util.List;

public class Learning {
private String name;
private int count;
List <String> friends;

    public Learning() {
    name = "TJ";
    count = 1;
    friends = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
}
