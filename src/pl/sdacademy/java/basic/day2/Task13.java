package pl.sdacademy.java.basic.day2;

public class Task13 {

    public static void main(String[] args) {
        int[] inputs = {12, 19, 7};

        int[] inputs2 = new int[3];
        inputs2[0] = 5;
        System.out.println(getMinValue(inputs));
        System.out.println(getMaxValue(inputs));
        System.out.println(sum(inputs));
    }

    private static int getMinValue(int[] inputs) {
        int minValue = inputs[0];
        //int minValue = Integer.MAX_VALUE;
//        for(int i = 1; i < inputs.length; i++) {
//            int currentElement = inputs[i];
//            if(currentElement < minValue) {
//                minValue = currentElement;
//            }
//        }

        for(int element : inputs) {
            if(element < minValue) {
                minValue = element;
            }
        }
        return minValue;
    }

    private static int getMaxValue(int[] inputs) {
        int maxValue = inputs[0];
        for(int element : inputs) {
            if(element > maxValue) {
                maxValue = element;
            }
        }
        return maxValue;
    }

    private static int sum(int[] inputs) {
        int sum = 0;
        for(int i : inputs) {
            sum += i;
        }
//        for(int i = 0; i < inputs.length; i++) {
//            sum += inputs[i];
//        }
        return sum;
    }

}