package RyanMcGovern;

public class RyanMcGovernLib {
    public static boolean Test(int number){
        if (number >= 0){
            System.out.println("The number "+number+" is positive.");
            return true;
        } else {
            System.out.println("The number "+number+" is negative.");
            return false;
        }
    }
}
