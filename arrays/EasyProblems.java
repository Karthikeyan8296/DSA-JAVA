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
        System.out.println("second largest number is = " + secondMax);
    }

    public void Third_Largest_Problem() {
        int arr[] = { 1, 14, 2, 16, 10, 20 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] != firstMax && arr[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] != secondMax && arr[i] != firstMax && arr[i] > thirdMax) {
                thirdMax = arr[i];
            }
        }
        System.out.println("third largest number is = " + thirdMax);
    }

    // Maximum product of a triplet (subsequence of size 3) in array
    // ThreeGreatCondidates
    public void MaxProductOfTriplet() {
        int arr[] = { -10, -3, -5, -6, -20 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] != firstMax && arr[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] != secondMax && arr[i] != firstMax && arr[i] > thirdMax) {
                thirdMax = arr[i];
            }
        }
        System.out.println("Three Great Candidates is = " + firstMax * secondMax * thirdMax);
    }
}
