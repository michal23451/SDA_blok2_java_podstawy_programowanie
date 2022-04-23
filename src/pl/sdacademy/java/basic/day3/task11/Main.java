package pl.sdacademy.java.basic.day3.task11;

public class Main {
    public static void main(String[] args) {
        Email email = new Email.Builder()
                .receiver("sda@sda.sd")
                .title("New JAVA course")
                .bodyMsg("Hello!")
                .attachment("introduction.pdf")
                .build();
        System.out.println(email);

        Email email2 = new Email.Builder()
                .receiver("sda@sda.sd")
                .build();
        System.out.println(email2);


        //niestatycznie - moje testy
        Email email3 = new Email().new NotStaticBuilder()
                .receiver("test")
                .bodyMsg("22222")
                .build();
        System.out.println(email3);
        //lub
        Email email4 = new Email();
        Email.NotStaticBuilder builder = email4.new NotStaticBuilder()
                .receiver("222")
                .title("3333");
        builder.title("titleeee");
        email4 = builder.build();


        System.out.println(email4);
    }
}
