package arrays;

public class EasyProblems {

    public void Second_Largest_Problem() {
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        int arr[] = { 5, 9, 7, 2, 1 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] != firstMax && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println("second largest is = " + secondMax);
    }
}
