public class Lcp {
    public static String longestCommonPrefix(String[] strs) {
 int n= strs.length;
 String ans = "";
 for(int i=0;i<n-1;i++)
 {
    ans=getCommon(strs[i],strs[i+1]);
    strs[i+1]=ans;
 }

     return ans;
    }

    private static String getCommon(String str, String str1) {
        String s="";
        int n1=str.length();
        int n2=str1.length();
        for(int i=0;i<Math.min(n1,n2);i++)
        { if(str.charAt(i)==str1.charAt(i))
            s+=str.charAt(i);
            else
                return s;
        }
        return s;
    }

    public static void main(String args[])
    {
       String strs[] = {"dog","racecar","car"};
       String answer=longestCommonPrefix(strs);
        System.out.println(answer);
    }
}
