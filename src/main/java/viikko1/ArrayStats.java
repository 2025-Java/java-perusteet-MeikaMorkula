package viikko1;

public class ArrayStats {

    public static double average(int[] arr) {
        double avg =0.0;

        if(arr.length < 1)
        {
            return 0.0;
        }

        for(int i = 0; i< arr.length; i++)
        {
            avg += arr[i];
        }

        avg = avg/arr.length;
        return avg;
    }

    public static int max(int[] arr) {
        
        int biggest =0;
        if(arr.length < 1)
        {
            return Integer.MIN_VALUE;
        }

        for(int i =0; i< arr.length; i++)
        {
            if(arr[i] > biggest)
            {
                biggest = arr[i];
            }
        }
        return biggest;

    }
}
