package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        
        String res="";
        if(a>=b)
        {
            if(b >= c)
            {
                res = c+"," + b +"," +a;
            }
            else if(c >= a)
            {
                res = b+"," + a +"," +c;
            }
            else
            {
                res = b+"," + c +"," +a;
            }
        }
        else if(b>a)
        {
            if(c>=b)
            {
                res =a+"," + b +"," +c;
            }
            else if(c>=b)
            {
                res = a+"," + c +"," +b;
            }
            else
            {
                res = c+"," + a +"," +b;
            }
        }
        return res;
    }
}
