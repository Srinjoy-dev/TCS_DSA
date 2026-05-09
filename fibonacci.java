import java.util.Scanner;

public class fibonacci {
    static int solution(int n) {
        if (n<=1) return n;
    return solution(n-1) + solution(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = solution(n);
        System.out.println("the nth elment is: "+answer);
        //if counting starts from 1st index(not from 0th index as in here)use "answer-1"
        //printing the series
        for(int i=0;i<=n;i++) {
            System.out.print(solution(i)+" ");
        }
        }
}
