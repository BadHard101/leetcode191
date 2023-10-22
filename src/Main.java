public class Main {
    public static void main(String[] args) {
        System.out.println(hammingWeight(5));
    }
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        String binaryRepresentation = Integer.toBinaryString(n);
        System.out.println(binaryRepresentation);
        n = 0;
        for (int i = 0; i < binaryRepresentation.length(); i++) {
            if (binaryRepresentation.charAt(i) == '1')
                n++;
        }
        return n;
    }
}