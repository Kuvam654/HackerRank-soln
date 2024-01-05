import java.util.Scanner;
class array_sum {
    public void calculate_sum() {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = a.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
class SIMPLE_ARRAYSUM {
    public static void main(String args[]) {
        array_sum b = new array_sum();
        b.calculate_sum();
    }
}
