package day28_arraylist;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        list.add("computer");
        list.add("screen");
        list.add("keyboard");
        list.add("mouse");
        System.out.println(list);

        String str = list.remove(0);
        System.out.println(list.remove(0));

        System.out.println(list);

        boolean b = list.remove("mouse"); // remove first match
        System.out.println(list);

    }
}
