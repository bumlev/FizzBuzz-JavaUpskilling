import java.util.Scanner;

public class MultipleNumber {

    private int [] numbers;
    private final Scanner sc;

    /**
     * Constructor of MultipleNumber
     */
    public MultipleNumber() {
        this.sc = new Scanner(System.in);
    }

    /**
     * Inputting Numbers of checking FizzBuzz
     */
    public void inputtingNumbers() {

        System.out.println("Give me the number of integer elements that you want");
        try{
            short length = Short.parseShort(this.sc.nextLine());
            this.numbers = new int[length];
        }catch (NumberFormatException e) {
            System.out.println("Your value is not a number");
            System.exit(0);
        }
        inputIntegerElements(0);
    }

    /**
     *Inputting of Integer elements of an array
     * @param i  , the counter of elements of an array
     */
    private void inputIntegerElements(int i) {

        for (int e= i; e < this.numbers.length; e ++)
        {
            try {
                System.out.printf("Give me an integer number %d%n" , e+1);
                this.numbers[e] = Integer.parseInt(this.sc.nextLine());
            }catch(NumberFormatException exception) {
                System.out.println("Your integer is not a number");
                inputIntegerElements(e);
                break;
            }
        }
    }

    /**
     * Displaying of fizzBuzz elements
     */
    public void displayFizzOrBuzzState() {

        for (int number : this.numbers) {
            System.out.println(getFizzOrBuzzMessage(number));
        }
    }

    /**
     * get the message of fizzBuzz value or nothing
     * @param number , the element that is used if it is FizzBuzz value
     * @return , the message that announces if a number is fizzBuzz or nothing
     */
    private String getFizzOrBuzzMessage(int number) {

        if(number % 3 == 0 && number % 5 == 0)
            return number + " is FizzBuzz" ;

        else if (number % 3 == 0)
            return number + " is Fizz";

        else if (number % 5 == 0)
            return number + " is Buzz";
        else
            return "the number is " + number;
    }

}
