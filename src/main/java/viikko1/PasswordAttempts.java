package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {

        int counter =0;

        for(int i =0; i<tries.length; i++)
        {
            if(tries[i] =="java123" && counter < 3)
            {
                return "Tervetuloa!";
            }
            counter++;
        }
        
            return "Liian monta virheellistä yritystä.";
        

      
        
    }
}
