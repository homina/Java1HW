package Lesson01.online;

public class Lesson02 {

        public static void main(String[] args) {
// Номер 1
            System.out.println("Номер 1");
            int[] arr1 = {0, 1, 1, 1, 0, 1, 1, 0, 0, 1};
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = arr1[i] == 1 ? 0 : 1;
                System.out.print(arr1[i] + " ");
            }

// Номер 2      1 4 7 10 13 16 19 22
            int[] arr2 = new int[8];
            int j = 1;
            System.out.println (" ");
            System.out.println("Номер 2");
            for(int i = 0; i < arr2.length; i++, j = j+3)
            {arr2[i] = j;
            }
            for(int i = 0; i < arr2.length; i++)
            {
                System.out.print (arr2[i]+" ");
            }


// Номер 3    1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1

            System.out.println (" ");
            System.out.println("Номер 3");
            int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] < 6) arr3[i] *= 2;
                System.out.print(arr3[i] + " ");
            }
            
        }

}
