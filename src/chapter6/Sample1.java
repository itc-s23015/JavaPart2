package chapter6;

public class Sample1 {
    public static void main(String[] args) {
        Tax tax = new Tax(100, "田中宏", 300_000, 100_000);

        System.out.println("納税番号=" + tax.getNumber());
        System.out.println("氏名=" + tax.getName());
        System.out.println("所得額=" + tax.getShotoku());
        System.out.println("控除額=" + tax.getKoujo());

        System.out.println(tax.zeigaku());
    }
}