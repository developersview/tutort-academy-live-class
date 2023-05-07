public class Arrays {
    public static void main(String[] args) {
//        maxElement();
//        maxAndMinElement();
//        reverseCharArrayMethod1();
//          reverseCharArrayMethod2();
        sortArrayMethod1();
        System.out.println();
        firstAndSecondMax();

    }

    public static void maxElement() {
        int[] array = {1, -10, 8, 6, 89, 51, 12};
        int max = array[0];
        for (int element = 0; element < array.length; element++) {
            if (array[element] > max)
                max = array[element];
        }
        System.out.println(max);
    }

    public static void maxAndMinElement() {
        int[] array = {2, -3, 4, -6, 10};
        int maxAns = array[0];
        int minAns = array[0];
        for (int element = 0; element < array.length; element++) {
            if (array[element] > maxAns)
                maxAns = array[element];
            if (array[element] < minAns)
                minAns = array[element];
        }
        System.out.println("Max Element: " + maxAns);
        System.out.println("Max Element: " + minAns);
    }

    public static void reverseCharArrayMethod1() {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f'};
        char[] result = new char[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j] = array[i];
            j++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }

    public static void reverseCharArrayMethod2() {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f'};
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void reverseCharArrayMethod3() {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f'};
        for (int i = 0; i < array.length / 2; i++) {
            char temp = 0;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void sortArrayMethod1() {
        int[] array = {10,9,8,70,59};
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i; j <= array.length - 1; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void firstAndSecondMax() {
        int[] array = {10,9,8,70,59,30,100};
        int max1= Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
           if(array[i]>=max1){
               max2=max1;
               max1=array[i];
           } else if(array[i]>=max2){
               max2=array[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
