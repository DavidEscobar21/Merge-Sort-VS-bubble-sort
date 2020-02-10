import java.util.Random;

public class BubbleSort {

    public static void main(String[] arrgs) {

        int [] x = new int[100000];

        Random random = new Random();

        for (int j = 0; j < x.length; j++) {
            x[j] = Math.abs(random.nextInt(10000000));
        }
        Long t0 = System.nanoTime();

        print(BubbleSort(x));
        Long t1 = System.nanoTime();

        System.out.println("");
        System.out.println("El tiempo de ejecucion es de: "+(t1-t0)+" Milisegundos");

    }

    public static int [] BubbleSort (int [] a){

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                if (a[i] < a[j]){

                    int c = a[i];
                    a[i] = a[j];
                    a[j] = c;

                }
            }
        }

        return a;
    }

    public static void print (int[] a) {

        for (int i = 0; i < a.length; i++) {

            if (i < a.length-1) {
                System.out.print(a[i] + ", ");
            }else {
            System.out.print(a[i]);
        }}
    }

}
