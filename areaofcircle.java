import java.util.*;
class solution {
    static float arealogic(float r) {
        return (float)(Math.PI*r*r);
    }
}
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float answer = solution.arealogic(r);
        System.out.printf("%.5f%n",answer);
    }
}
