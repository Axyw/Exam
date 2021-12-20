public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] count = count(numbers);
        array(numbers, count);
    }

    public static int[] count(int[] numbers) { // Method that returns the amount of odd and even numbers.
        int evenCounter = 0; // Even counter initialized
        int oddCounter = 0; // Odd conter initialized
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCounter++;
                System.out.println(numbers[i] + ": Es Par");
            } else {
                oddCounter++;
                System.out.println(numbers[i] + ": Es Impar");
            }
        }
        System.out.println("------------------------------");
        int[] count = new int[] { evenCounter, oddCounter };
        return count;
    }

    public static void array(int[] numbers, int[] count) { // Void method with parameters that generates a new array for
                                                           // odd and even numbers.
                                                           // After taht, add the values of each array and return the
                                                           // result.
        int evenCounter = 0;
        int oddCounter = 0;
        int sumEvenNumbers = 0; // Initialized variable for the sum Even numbers
        int sumOddNumbers = 0; // Initialized variable for the sum odd numbers
        int[] evenNumbers = new int[count[0]]; // New array with size of even numbers
        int[] oddNumbers = new int[count[1]]; // New array with size of odd numbers

        for (int i = 0; i < numbers.length; i++) { // For loop to assign even and odd values in Arrays
            if (numbers[i] % 2 == 0) {
                evenNumbers[evenCounter] = numbers[i];
                evenCounter++;
            } else {
                oddNumbers[oddCounter] = numbers[i];
                oddCounter++;
            }
        }
        System.out.println("Array of Even Numbers: ");
        for (int i = 0; i < evenCounter; i++) {
            System.out.print(evenNumbers[i] + "-");
        }
        System.out.println("\nArray of Odd Numbers: ");
        for (int i = 0; i < oddCounter; i++) {
            System.out.print(oddNumbers[i] + "-");
        }

        for (int i = 0; i < evenNumbers.length; i++) { // for loop to um the array values
            sumEvenNumbers = sumEvenNumbers + evenNumbers[i];
        }

        for (int i = 0; i < oddNumbers.length; i++) {
            sumOddNumbers = sumOddNumbers + oddNumbers[i];
        }

        System.out.println("\n----------------------");
        System.out.println("\nSuma Total Pares: " + sumEvenNumbers);
        System.out.println("Suma Total Impares: " + sumOddNumbers);

    }
}
