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

    public static String cutOut (String mainStr, String subStr) {
        int cutIndex = mainStr.indexOf(subStr);
        String mainStrBefore = mainStr.substring(0, cutIndex);
        String mainStrAfter = mainStr.substring(cutIndex + subStr.length());
        return mainStrBefore+mainStrAfter;
    }

    public static int sumUpTo(int n){
        for (int i=0; i<n; i++){
            n+=i;
        }
        return n;
    }
}
