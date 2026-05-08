public class arithmeticprogression {
    public static float AP(float a, float d, int n) {
        float sum = 0;
        for(int i=0;i<n;i++) {
            sum = sum+a;
            a = a+d;
        }
        return sum;
    }
    public static void main(String[]args) {
        float a = 2.5f;
        float d = 1.25f;
        int n = 4;
        float answer = AP(a, d, n);
        System.out.print(answer);
    }
}
