package Patterns;

public class PatternsAssignment{

    public static void pattern1(int n){

    int i = 1, j, k, l ,q,p;
    while(i <= n){
        
        j=n-i;
        k=1;
        p=i;
        l=1;
        q=2*(i-1);


        while(j !=0 ){
            System.out.print(" ");
            j--;

        }

        while(k<=i){
            System.out.print(p);
            p++;
            k++;
        }

        while(l<=i-1 && i!=1){

            System.out.print(q);
            q--;
            l++;
        }


        System.out.println();
        i++;

    }

    }

    public static void pattern2(int N){
        int i =1, j, k, p;

        while(i <=N){

            j = 1;
            k=1;
            p=i;


            while(j <= N-i){
                System.out.print(" ");
                j++;
            }

            while(k <=i){
                System.out.print(p);
                p++;
                k++;
            }

            System.out.println();
            i++;
        }
    }

    public static void pattern3(int N){

        int i =1, j, k,l, p;
        while(i<=N){
            j=1;
            k=2*(N-i);
            p=i;
            l=1;

            while(j<=i){
                System.out.print(j);
                j++;
            }

            while(k>=1){
                System.out.print(" ");
                k--;
            }
           while(l<=i){
               System.out.print(p);
               p--;
               l++;
           }



            System.out.println();
            i++;
        }

    }

    public static void pattern4(int N){
        int i =1 , j ,k;
        int  n = N/2+1;
        while(i <= n){
            j=1;
            k=1;

            while(j<= i-1 & i != 1){
                System.out.print(" ");
                j++;
            }

            while(k<=i){
                System.out.print("*" + " ");
                k++;
            }
            System.out.println();
            i++;
        }
        while(i <=N){
            j=1;
            k=N-n;

            while(j<=N-i && N-i !=0){
                System.out.print(" ");
                j++;
            }

           while(k >= i-n){
               System.out.print("*"+ " ");
               k--;
           }

            System.out.println();
            i++;
        }
    }

    public static void pattern5(int N) {

        int n = 2 * N - 1;
        int i = 1, j, k;
        int l = n - 1, p;
        int x, y, z;
        int X = n / 2 + 1;
        z = X;
        while (i <= n) {

            j = 1;
            p = N;
            k = i - 1;
            while (j <= l) {
                System.out.print(p);
                j++;
                if (k > 0) {
                    p--;
                    k--;
                }
            }


            x = 1;
            p = z;
            y = n - i;
            while (x <= i) {
                if (i <= X) {
                    System.out.print(p);
                    p++;
                    x++;
                } else if (i > X) {

                }
            }

            System.out.println();
            i++;
            l--;
            z--;
        }
    }
    public static void pattern6(int N) {

        int startValue = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = startValue; j < startValue + N; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            if (i == (N + 1) / 2) {
                if (N % 2 != 0)
                    startValue = N * (N - 2) + 1;
                else
                    startValue = N * (N - 1) + 1;
            } else if (i > (N + 1) / 2)
                startValue = startValue - 2 * N;
            else
                startValue = startValue + 2 * N;
        }
    }

        public static void pattern7(int N){

        int num = N;
        int count = 2*N-1;
        for(int i =1; i<= 2*N-1; i++){

            for(int j =N; j > num; j--)
                System.out.print(j + " ");

            for(int j =1; j <= count; j++)
                System.out.print(num + " ");

            for(int j =num+1; j <= N; j++)
                System.out.print(j + " ");

            if(i < N){
                num--;
                count = count-2;
            }

            else{
                num++;
                count=count+2;
            }

            System.out.println();
        }
    }





    public static void main(String[] args) {
       // pattern1(4);
       // pattern2(4);
        //pattern3(4);
       // pattern4(11);
        //pattern6(4);
        pattern7(4);
    }
}


