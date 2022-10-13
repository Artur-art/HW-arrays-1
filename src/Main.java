import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
        double [] numbers1 = new double[3];
        numbers1 [0] = 1.57;
        numbers1 [1] = 7.654;
        numbers1 [2] = 9.986;
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);

        }
        short [] numbers2 = new short[3];
        numbers2[0] = 10000;
        numbers2[1] = 20000;
        numbers2[2] = 30000;
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);

        }
        System.out.println("Задача №2");
        System.out.println(numbers[0]+","+numbers[1]+","+numbers[2]);
        System.out.println(numbers1[0]+","+numbers1[1]+","+numbers1[2]);
        System.out.println(numbers2[0]+","+numbers2[1]+","+numbers2[2]);

        System.out.println("Задача №3");
        System.out.print(numbers[2]+",");
        System.out.print(numbers[1]+",");
        System.out.println(numbers[0]+",");
        System.out.print(numbers1[2]+",");
        System.out.print(numbers1[1]+",");
        System.out.println(numbers1[0]+",");
        System.out.print(numbers2[2]+",");
        System.out.print(numbers2[1]+",");
        System.out.println(numbers2[0]+",");

        System.out.println("Задача №4");
        int[]numbers3 = {1,2,3};
        for (int i = 0; i < numbers3.length; i++) {
            if(numbers3[i] % 2 != 0){
                numbers3[i] += 1;
            }

        }
        System.out.println(Arrays.toString(numbers3));

        System.out.println("Задача №4 мой вариант");
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2!=0){
                numbers[i] += 1;
            }

        }
        System.out.println(Arrays.toString(numbers));


        }




        }








