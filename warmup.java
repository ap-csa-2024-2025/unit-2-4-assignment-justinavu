public class warmup {
    public static void main(String[] args) {

    System.out.println(firstLastN("danny", "justin", 3));
    stringManip("hello", "danny");


    }

    public static String firstLastN(String a, String b, int n)
    {
    int length = a.length();
    String firstB = b.substring(0, n);
    String lastA = a.substring(length-n);
    String join = lastA + firstB;
    return join;
    }
    public static void stringManip(String a, String b) 
    {
    a = a.toUpperCase();
    String firstB = (b.substring(0, 1));
    firstB = firstB.toUpperCase();
    String restB = b.substring(1);
    System.out.println(a);
    System.out.println(firstB + restB);
    }
}
