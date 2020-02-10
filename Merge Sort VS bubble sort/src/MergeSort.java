import java.util.Random;

public class MergeSort {

    public static void main(String[] arrgs) {

        int [] x = new int[1];

        Random random = new Random();

        for (int j = 0; j < x.length; j++) {
            x[j] = Math.abs(random.nextInt(10000000));
        }
        Long t0 = System.nanoTime();


        print(mergeSort(x));
        Long t1 = System.nanoTime();
        System.out.println("");
        System.out.println(" El tiempo de ejecucion es de: "+(t1-t0)+" Milisegundos");

    }

    public static int [] mergeSort (int [] a){

        if (a.length <= 1){
            return a;
        }
        int [] inf = new int [a.length/2];
        int [] sup = new int [a.length - inf.length];

        int j = 0 ;

        for (int i = 0 ; i < inf.length; i++) {

            inf[i] = a[j++];

        }

        for (int i = 0; i < sup.length; i++) {

            sup [i] = a[j++];

        }

        return Merge(mergeSort(inf),mergeSort(sup));
    }










    public static int [] Merge (int [] arr, int [] arr2){

        int [] retval = new int [arr.length + arr2.length];

        int i = 0, j = 0, k = 0;

        for (  ; j < arr.length && k < arr2.length; i++) {

            if (arr[j] < arr2[k]) {

                retval[i] = arr[j++];

            } else {

                retval[i] = arr2[k++];
            }

            }

   if (j < arr.length){
       for ( ; i < retval.length; i++) {
           retval[i] = arr[j++];
       }
   }else if (k < arr2.length){
       for (; i < retval.length ; i++) {
           retval[i] = arr2[k++];

       }

   }

       return retval;
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



