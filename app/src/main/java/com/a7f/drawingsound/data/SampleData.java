package com.a7f.drawingsound.data;

import com.a7f.drawingsound.model.Sheet;

import java.util.ArrayList;

public class SampleData {
    ArrayList<Sheet> items = new ArrayList<>();

    public ArrayList<Sheet> getItems() {

        Sheet movie1 = new Sheet("https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwiwtcjMhPjhAhVwx4sBHSHFB7IQjRx6BAgBEAU&url=https%3A%2F%2Fantmusic.tistory.com%2F987&psig=AOvVaw2UFiFPVJ_8AYlI6zjjfN-C&ust=1556720328814960",
                "action", "Black Panther", "this movie open in 2018.01");

        Sheet movie2 = new Sheet("https://t1.daumcdn.net/cfile/tistory/0138F14A517F77713A",
                "action", "Iron Man 3", "this movie open in 2013.04");

        Sheet movie3 = new Sheet("https://i.ytimg.com/vi/5-mWvUR7_P0/maxresdefault.jpg",
                "action", "Ant Man", "this movie open in 2015.06");

        items.add(movie1);
        items.add(movie2);
        items.add(movie3);

        items.add(movie1);
        items.add(movie2);
        items.add(movie3);

        items.add(movie1);
        items.add(movie2);
        items.add(movie3);

        return items;
    }
}
