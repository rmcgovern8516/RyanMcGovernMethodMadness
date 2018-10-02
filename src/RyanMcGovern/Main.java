package RyanMcGovern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("The date converted in dd-mm-yyyy form is: "+RyanMcGovernLib.dateStr("04/15/2001")); //dateStr method

        System.out.println("The final result after the cut is: "+RyanMcGovernLib.cutOut("catatonic cat", "cat")); //cutOut method

        System.out.println("The sum of the numbers from 0 to the input is: "+RyanMcGovernLib.sumUpTo(6)); //sumUpTo method

        System.out.print("The multiplication table for this base from 0 to the range is: "); //multiplicationTable method
        RyanMcGovernLib.multiplicationTable(5,3); //multiplicationTable method
        System.out.println(""); //multiplicationTable method

        System.out.println("True or false, the inputted word is a Palindrome: "+RyanMcGovernLib.isPalindrome("racecar")); //isPalindrome
    }
}
