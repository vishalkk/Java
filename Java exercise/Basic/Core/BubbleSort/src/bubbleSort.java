public class bubbleSort {

    public static void bubbleSort(int[] array){
        int n =array.length;
        int k;

        for (int m = n; m >= 0 ; m--){

            for (int i=0; i<n-1;i++){
                k = i+1;
                if (array[i]>array[k]){

                    swapMe(i,k,array);
                }
            }
            printNum(array);
        }

        }
        
    private static void swapMe(int i,int j, int[] array){

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printNum(int[] input){

        for (int i=0; i<input.length; i++){
            System.out.print("|" + input[i] +"|");

        }
        System.out.println('\n');
    }

    public static void main(String[] args){

       int[] input ={1,22,8,3,9,16,5,13};

       bubbleSort(input);
    }
}
