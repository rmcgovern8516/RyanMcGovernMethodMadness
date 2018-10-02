package RyanMcGovern;

public class RyanMcGovernLib {
    public static String dateStr (String date){
            String month = date.substring(0,2);
            String day = date.substring(3,5);
            String year = date.substring(6);
            return (day+"-"+month+"-"+year);

    }

    public static String cutOut (String mainStr, String subStr) {
        int cutIndex = mainStr.indexOf(subStr);
        String mainStrBefore = mainStr.substring(0, cutIndex);
        String mainStrAfter = mainStr.substring(cutIndex + subStr.length());
        return mainStrBefore+mainStrAfter;
    }

    public static int sumUpTo (int n){
        int out = 0;
        int i=1;
        while (i<=n){
            out+=i;
            i++;
        }
        return out;
    }

    public static int multiplicationTable(int base, int range){
        int n = 0;

        while (n<=range) {
            System.out.print(base * n + " ");
            n++;
        }
        return n;
    }

    public static boolean isPalindrome (String str){
        String reverse = "";

        for (int i = str.length()-1; i>=0; i--){
            reverse+= str.substring(i,i+1);
        }
        if (reverse.equals(str)){
            return true;
        } else {
            return false;
        }
    }
}
