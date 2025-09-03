package viikko1;

public class NumberProperties {
    public static String describe(int n) {

        String res ="";
        if(n==0)
        {
            res= "nolla";
        }

        if(n>0)
        {
            if(n%2==0)
            {
                res= "positiivinen parillinen";
            }
            else
            {
                res= "positiivinen pariton";
            }
        }

        else if(n<0)
        {
           if(n%2==0)
            {
                res= "negatiivinen parillinen";
            }
            else
            {
                res= "negatiivinen pariton";
            }
        }
        return res;
    }
}
