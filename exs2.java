

public class exs2 {
    public static void main(String[] args) {
       
        System.out.println("Простые числа от 1 до 1000:");
        System.out.print("1 ");
        for (int i = 2; i <= 1000; i++) {
            int devs = 0;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0){
                    devs++;
                }
            }
            if (devs == 0){
            System.out.print(i + " "); }
        }

    }
}