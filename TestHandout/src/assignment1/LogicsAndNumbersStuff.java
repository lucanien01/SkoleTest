package assignment1;

public class LogicsAndNumbersStuff {

    // This method returns the difference between a and b multiplied by c.

    public int diffMultipliedByC(int a, int b, int c)
    {
        return (a - b) * c;
    }

    // Returns true if you can stay in bed this morning. You can stay in bed if it is not a weekday, or if you are on vacation.

    public boolean canYouStayInBed(boolean weekday, boolean vacation)
    {
        if(!weekday || vacation){
            return true;
        }

        return false;
    }

    // This method returns the sum of all the given numbers

    public int sumOfNumbers(int[] numbers)
    {
        int sum = 0;

        for (int number : numbers){
            sum += number;
        }

        return sum;
    }

    // This method returns the average of all the given numbers.

    public double averageOfNumber(int[] numbers)
    {
        double average, sum = 0;

        int length = numbers.length;

        for (int age : numbers) {
            sum += age;
        }

        return average = sum / length;
    }

    // Return The number that occurs most often in the array.

    public int numberWithMostOccurrences(int[] numbers) {
        int result = numbers[0], max = 0;

        for (int n : numbers) {
            int count = 0;
            for (int m : numbers)
                if (n == m) count++;
            if (count > max) {
                max = count;
                result = n;
            }
        }
        return result;
    }

}
