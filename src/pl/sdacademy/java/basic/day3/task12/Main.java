package pl.sdacademy.java.basic.day3.task12;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer();

        Computer.Processor proc = comp.new Processor(4,"intel");
        Computer.Memory mem = comp.new Memory(32,"ddr4","Kingston");
        Computer.ExternalPort extport = new Computer.ExternalPort("USB");

        comp = new Computer(proc, mem, extport);

        System.out.println(comp);

        //drugi sposób - testy, w porównaniu do powyższego, poniżej tworzymy trzy obiekty Computer
        Computer comp2 = new Computer(
                new Computer().new Processor(4,"intelxx"),
                new Computer().new Memory(32,"ddr4xx","Kingstonxx"),
                new Computer.ExternalPort("USBxx")
        );

        System.out.println(comp2);
    }
}
