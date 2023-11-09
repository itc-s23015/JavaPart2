package exercise;

import chapter7_2.Joining;

public class E721_1 {
    public static void main(String[] args) {

        Joining j = new Joining("-");
        j.add("apple");
        j.add("banana");
        j.add("peach");
        System.out.println(j.getCsv());
    }
}
