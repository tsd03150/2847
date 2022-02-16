import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int answer = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] <= arr[i - 1]) {
                answer += arr[i - 1] - (arr[i] - 1);
                arr[i - 1] = arr[i] - 1;
            }
        }

        System.out.println(answer);

    }
}
