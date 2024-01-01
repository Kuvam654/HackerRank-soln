import java.util.Scanner;
class vamos {
    public void reversearr(int arr[]) {
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
class ARRAY_DS {
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int arr[] = new int[b];
        for (int i = 0; i < b; i++) {
            arr[i] = a.nextInt();
        }
        vamos c = new vamos();
        c.reversearr(arr);
    }
}