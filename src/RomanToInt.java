class Solution {
    public static int romanToInt(String s) {
        int prev=0;
        int num=0;
        int n=s.length();
        for(int i=n-1;i>=0;i--)
        {   char c=s.charAt(i);
            int curr=getTheInt(c);
            if(curr!=0){    if( curr>=prev)
            {
                num+=curr;
            }else if(curr<prev)
            {
                num-=curr;
            }
            }
            prev=curr;
        }

        return num;
    }
    public static int getTheInt(char c)
    {
        switch (c){
            case 'I': return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:
                return 0;

        }
    }
    public static void main(String args[])
    {
        String s="LVIII";
        int answer=romanToInt(s);
        System.out.println(answer);
    }
}
