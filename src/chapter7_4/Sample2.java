package chapter7_4;

public class Sample2 {
    public static void main(String[] args) {
        NoConstructor nc = new NoConstructor();
        System.out.println(nc.getStr());
        System.out.println(nc.getStr());
    }
}
