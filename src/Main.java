public class Main {
    public static void main(String[] args) {
        //================FirstTask================
        //System.out.println("================FirstTask================");

        //----------SubTask_1----------
        int[] arr = new int[] {1, 2, 3};

        //----------SubTask_2----------
        double[] arr2 = new double[] {1.57, 7.654, 9.986};

        //----------SubTask_3----------

        int[] arr3 = new int[3];
        arr3[0] = 2;
        arr3[1] = 4;
        arr3[2] = 6;

        //================SecondTask================
        System.out.println("================SecondTask================");

        for (int i = 0; i < 3; i++) {
            if (i != 0) System.out.print(", ");
            System.out.print(arr[i]);
        }
        System.out.print("|");
        for (int i = 0; i < 3; i++) {
            if (i != 0) System.out.print(", ");
            System.out.print(arr2[i]);
        }
        System.out.print("|");
        for (int i = 0; i < 3; i++) {
            if (i != 0) System.out.print(", ");
            System.out.print(arr3[i]);
        }
        System.out.println();
        //================ThirdTask================
        System.out.println("================ThirdTask================");

        for (int i = 2; i > -1; i--) {
            if (i != 2) System.out.print(", ");
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i = 2; i > -1; i--) {
            if (i != 2) System.out.print(", ");
            System.out.print(arr2[i]);
        }
        System.out.println();
        for (int i = 2; i > -1; i--) {
            if (i != 2) System.out.print(", ");
            System.out.print(arr3[i]);
        }
        System.out.println();
        //================FourthTask================
        System.out.println("================FourthTask================");

        for (int i = 0; i < 3; i++) {
            if (arr[i] % 2 == 1) arr[i] = arr[i] + 1;
            if (i != 0) System.out.print(", ");
            System.out.print(arr[i]);
        }
    }
}