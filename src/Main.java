public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("task 1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        float[] array = {1.57f, 7.654f, 9.986f};

        byte[] array1 = {57, 54, 98, 110};


        //task 2
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i < weight.length - 1) {
                System.out.print(",");
            }

        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }

        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i < array1.length - 1) {
                System.out.print(",");
            }
        }
    }
}