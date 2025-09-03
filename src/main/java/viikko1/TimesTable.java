package viikko1;

public class TimesTable {
    public static String table(int n) {
        
        String kertotaulu ="";
        for(int i =1; i<=10; i++)
        {
            kertotaulu +=  n +" x " + i + " = " + n*i +"\n";
        }

        return kertotaulu;
    }
}
