public class class5 {
    public static void main(String[] args) {
        question3();

    }
    static void question2(){
        boolean isPrime = true;
        int n=4;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (!isPrime) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }
    static void question3(){
        for (int i=0; i<5;i++){
            for (int j=i;j<=5;j++){
                System.out.print(i+" "+j);
            }
        }
    }


}
