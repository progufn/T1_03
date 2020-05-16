
/**
 * Mastery Test Week 3 Exercise 2. Thread 1.
 * - Shift FOUR elements one place to the left.
 * 
 * @author (your name) 
 */
public class Exercise2
{
    public static int[] shiftLeft(int[] numbers)
    {
        int temp;
        
        // In the coming weeks, the lecturer will explain all of the code above. But for now here is an explanation:
        // 1. In the code above we have provided an integer array "numbers", containing FOUR elements.
        // 2. In the code above we have also provided another integer variable called "temp".
        // In the space provided below, write code to shift each element one position to the left,
        // with the leftmost element moving around to the rightmost position.
        // 
        // Do NOT initialise "numbers[0]" ... "numbers[3]". Just write the five lines that shift the values.
        // Add your code BELOW this line. Do NOT change anything ABOVE this comment line.
        temp = numbers[0];
        
        for(int i = 1; i < numbers.length; i++)
        {
            numbers[i-1] = numbers[i];
        }
        numbers[numbers.length-1] = temp;
        
        // Add your code ABOVE this line. Do NOT change anything BELOW this comment line.
        return numbers;
    }
}
