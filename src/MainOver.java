public class MainOver {
    public static void main(String args[]) {
        System.out.println(" Main Method");
        main(1);
    }
    public static void main(int[] args){
        System.out.println("Overloaded Integer array Main Method");
    }
    public static void main(char[] args){
        System.out.println("Overloaded Character array Main Method");
    }
    public static int main(double[] args){
        System.out.println("Overloaded Double array Main Method");
        return 0;
    }
    public static void main(float args){
        System.out.println("Overloaded float Main Method");
    }
}
