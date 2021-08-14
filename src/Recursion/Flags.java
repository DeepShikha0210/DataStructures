package Recursion;

public class Flags {

    public static long find_Ways(int N)
    {
        if(N==1 || N==2)
            return 2;

        long ans=find_Ways(N-1)+find_Ways(N-2);

        return ans;

    }
}
