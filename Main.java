package kurko.andrey;
import java.util.Scanner;
public class Main {
    public static Boolean FizzBuzzSecondTask() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.print("Fizz");
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(i);
            }
            System.out.print("," + "");
        }

        return false;
    }
    public static boolean AdrFirstTask(int size, int[] array)
    {
        boolean Adr =false;
        for(int i = 1; i < size; i++)
        {
            if(array[i]>=array[i-1])
            {
                Adr=true;
            }
            else
            {
                Adr=false;
                break;
            }
        }
        return Adr;
    }

    public static void main(String[] args) {
        Scanner fit = new Scanner(System.in);
        System.out.print("Введіть розмір масиву: ");
        int size = fit.nextInt();
        int[] array = new int [size];
        if(size<=2)
        {
            System.out.print("Розмір повинен бути > 2");
        }
        else {
            System.out.println("Вставити елементи масиву: ");
            for(int i = 0; i<size; i++)
            {
                array[i] = fit.nextInt();

            }
            System.out.print("Array: ");
            for(int i = 0; i<size; i++)
            {
                System.out.print(" " +array[i]);
            }
            System.out.println();
        }

        System.out.println(AdrFirstTask(size, array));
        System.out.print(FizzBuzzSecondTask());
    }
}
