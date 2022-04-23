package pl.sdacademy.java.basic.day3.task8;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Tuwim", "PL");
        Author author2 = new Author("Brzechwa", "PL");
        Author author3 = new Author("Chotomska", "PL");

        Poem[] poems = new Poem[3];
        poems[0] = new Poem(author1, 50);
        poems[1] = new Poem(author2, 100);
        poems[2] = new Poem(author3, 75);

        String result = getSurnameWithMaxStropheNumbers(poems);
        System.out.println(result);
    }

    private static String getSurnameWithMaxStropheNumbers(Poem[] poems) {
        int max = 0;
        String author = null;
        for(Poem poem : poems) {
            int currentStropheNumbers = poem.getStropheNumbers();
            if(max < currentStropheNumbers) {
                max = currentStropheNumbers;
                author = poem.getCreator().getName();
            }
        }
        return author;
    }
}