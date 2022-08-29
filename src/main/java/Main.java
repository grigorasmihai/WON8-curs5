import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
    }

    private static int sumOfArray(int[] array){
        int sum = 0;
        for (int number: array) {
            sum += number;
        }
        return sum;
    }

    private static int oddCount(int[] array){
        int count = 0;
        for (int number: array) {
            if (number%2 != 0){
                count++;
            }
        }
        return count;
    }

    private static List<int> biggerThan(int[] array, int a){
        List<int> bigger = new ArrayList<int>();
        for (int number: array) {
            if (number> a){
                bigger.add(number);
            }
        }
        return bigger;
    }

    private static void donatii(int target){
        Random r = new Random();
        int sum = 0;
        while (sum < target){
            sum += r.nextInt();
        }
        System.out.println("Am atins targetul de donatii");
    }

    private static void donatii(int target, int maxNumberOfDonations){
        Random r = new Random();
        int donations = 0;
        int sum = 0;
        while (sum < target || donations < maxNumberOfDonations){
            sum += r.nextInt();
            donations++;
        }
        if (sum >= target) {
            System.out.println("Am atins targetul de donatii");
        }
        else{
            System.out.println("Nu s-a atins targetul de donatii");
        }
    }

    private static void print(String fraza){
        String[] frazaSplit = fraza.split("[.]");
        for (String propozitie: frazaSplit){
            System.out.println(propozitie);
        }
    }

}
