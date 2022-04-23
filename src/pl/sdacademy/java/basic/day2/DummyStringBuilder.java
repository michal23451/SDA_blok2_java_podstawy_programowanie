package pl.sdacademy.java.basic.day2;

public class DummyStringBuilder {

    public static void main(String[] args) {
        String str = "ala";
        str = str.concat("kot");
        System.out.println(str);

        StringBuilder sb = new StringBuilder("ala");
        sb.append("kota");
        System.out.println(sb);
    }
}
