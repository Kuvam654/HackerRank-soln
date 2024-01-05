import java.util.Scanner;
class compare_triplets {
    public void compare() {
        Scanner b = new Scanner(System.in);
        int arr1[] = new int[3];
        int arr2[] = new int[3];
        int point1 = 0;
        int point2 = 0;
        int equal = 0;
        for (int j = 0; j < 3; j++) {
            arr2[j] = b.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            arr1[i] = b.nextInt();
            if (arr1[i] > arr2[i]) {
                point1++;
            }
            else if (arr1[i] < arr2[i]) {
                point2++;
            }
            else {
                equal++;
            }
        }
        System.out.print(point2 + " ");
        System.out.print(point1);
    }
}
class COMPARE_THE_TRIPLETS {
    public static void main(String args[]) {
        compare_triplets a = new compare_triplets();
        a.compare();   
    }
}

