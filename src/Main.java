public class Main {

    // 1. Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0

    public static int countEvents(int[] nums) {
        int evenCount = 0;
        for (final int i : nums) {
            if (i % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }
    // 2. Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.

    public static int getDiff(int[] number) {
        int diff = Integer.MIN_VALUE;
        int n = number.length;
        if (n == 0) {
            return diff;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (number[j] > number[i]) {
                    diff = Integer.max(diff, number[j] - number[i]);

                }
            }
        }
        return diff;
    }

    public static boolean doubleZero(int[] arr, int position) {
        if (position < 1) {
            return doubleZero(arr, 1);
        }
        if (position == arr.length) {
            return false;
        }
        if (arr[position] == 0 && arr[position - 1] == 0) {
            return true;
        } else {
            return doubleZero(arr, position + 1);
        }
    }

    // 3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.

    public static void main(String[] args) {

        int[] number = {2, 3, 5, 9, 24, 6};
        int diff = getDiff(number);
        if (diff != Integer.MIN_VALUE) {
            System.out.println("Разница составляет:" + diff);

        }

        int[] nums = {2, 1, 2, 3, 4};
        int evenCount = countEvents(nums);
        System.out.println("Четных элементов в массиве:" + evenCount);


    }
}

