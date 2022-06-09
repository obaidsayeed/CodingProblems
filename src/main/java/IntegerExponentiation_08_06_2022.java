//Asked by Google.
//
//Implement integer exponentiation. That is, implement the pow(x, y) function, where x and y are integers and returns x^y.
//
//Do this faster than the naive method of repeated multiplication.
//
//For example, pow(2, 10) should return 1024.
public class IntegerExponentiation_08_06_2022 {
    public static int solution(int m, int n) {
        if(n < 0){
            return 1/solution(m,n*-1);
        }
        if(n == 0){
            return 1;
        }
        if(n % 2 != 0) {
            return m * solution(m, (n - 1)/2) * solution(m,(n - 1)/2);
        }

        return solution(m, n / 2) * solution(m, n / 2);
    }
}
