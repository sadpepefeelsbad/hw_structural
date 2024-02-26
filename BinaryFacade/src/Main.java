public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String a = "110101";
        String b = "101100";

        System.out.println(bins.sum(a, b));
        System.out.println(bins.mult(a, b));
    }
}