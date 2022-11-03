package programmers.lv1;

public class Pibonachi {

    public int solution(int n) {
        double rst = 0;
        double rst2 = 1;
        double result =0;
        for(int b=2;b<=n;b++){
            result = (rst + rst2)%1234567;
            rst = rst2;
            rst2 = result;
        }
        return (int)result % 1234567;

    }

}


