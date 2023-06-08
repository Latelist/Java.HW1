// Задан массив, например, nums = [1,7,3,6,5,6].
// Написать программу, которая найдет индекс i для этого массива такой, что сумма элементов с индексами < i 
// равна сумме элементов с индексами > i.

public class SixthTask {
    SixthTask() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(finder(nums));
    }

    public boolean comparer(int[] nums, int n) {
        int res1 = 0;
        for (int i = 0; i < n; ++i) {
            res1 += nums[i];
        }
        int res2 = 0;
        for (int i = n + 1; i < nums.length; ++i) {
            res2 += nums[i];
        }
        if (res1 == res2) {
            return true;
        } else {
            return false;
        }
    }

    public int finder(int[] nums) {
        int res = -1;
        for (int i = 0; i < nums.length; ++i) {
            if (comparer(nums, i)) {
                res = i;
            }
        } 
        return res;
    }
}



