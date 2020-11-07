import java.io.Console;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

    }

    private static  int possibleWays(int totalFeet) {
        // check if totalFeet is less than zero then that single way will not be counted since it will have exceeded the given number of ways
        // else if it is equals to zero it means that the given feet would have been completed and the way will be counted as possible way
        //else the function will be recurred until 0 or 1 is returned
        if (totalFeet < 0) {
            return 0;
        }
        else if (totalFeet == 0) {
            return 1;
        }
        else {
            // at the first jump the mouse can jump either 1 feet or 2 feet hence totalFeet will reduce by either 1 or 2 feet
            //the next jump will also be the same till the total number of possible ways is reached
            return possibleWays(totalFeet - 1) + possibleWays(totalFeet - 2);
        }
    }
}




