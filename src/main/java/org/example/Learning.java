package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Learning {
private String name;
private int count;
List <String> friends;

    public Learning(String name) {
        this.name = name;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Learning)) return false;
        Learning learning = (Learning) o;
        return count == learning.count && Objects.equals(name, learning.name) && Objects.equals(friends, learning.friends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count, friends);
    }
}
