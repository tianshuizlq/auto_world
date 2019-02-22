public class Test01 {

    public static void main(String[] args) {
        int sum = 2;
        int dasum = 0;
        for(int i = 1;i < 13;i++) {
            if(i>2) {
                dasum+=2;
            }
            sum += dasum;
        }
    }
}
