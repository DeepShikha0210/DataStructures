package Recursion;

public class GetCode {

    public static  String[] getCode(String input){
        // Write your code here
        if(input.length()==0){
            String ans[]={""};
            return ans;
        }
        String smallans1[]=getCode(input.substring(1));

        int first=input.charAt(0)-'0';
        char firstchar=(char)('a'+first-1);

        for(int i=0;i<smallans1.length;i++){
            smallans1[i] = firstchar+smallans1[i];
        }

        String smallans2[]=new String[0];
        if(input.length()>=2)
        {
            int ch1=input.charAt(0)-'0';
            int ch2=input.charAt(1)-'0';

            int firstTwo=(ch1*10)+ch2;

            if(firstTwo>=10 && firstTwo<=26){

                char firstTwoChar=(char)('a'+firstTwo-1);
                smallans2=getCode(input.substring(2));

                for(int i=0;i<smallans2.length;i++){
                    smallans2[i]=firstTwoChar+smallans2[i];}
            }
        }
        String output[]=new String[smallans1.length+smallans2.length];
        int k=0;
        for(int i=0;i<smallans1.length;i++){
            output[k]=smallans1[i];
            k++;
        }
        for(int i=0;i<smallans2.length;i++){
            output[k]=smallans2[i];
            k++;
        }
        return output;
    }

    public static void main(String[] args) {
        String[] output = getCode("1123");
        for(String s : output)
            System.out.println(s);
    }

}
