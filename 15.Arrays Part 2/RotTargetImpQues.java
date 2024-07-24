public class RotTargetImpQues {
    public int search(int[] nums, int target) {
        // min will have index of minimum element of nums
        int min = minSearch(nums);
        // find in sorted left
        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            return search(nums, min, nums.length - 1, target);
        }
        // find in sorted right
        else {
            return search(nums, 0, min - 1, target);
        }
    }

    // binary search to find target in left to right boundary
    public int search(int[] nums, int left, int right, int target) {
        int l = left;
        int r = right;
        // System.out.println(left+" "+right);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    // smallest element index
    public int minSearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        RotTargetImpQues rotTargetImpQues = new RotTargetImpQues();
        
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println("Output: " + rotTargetImpQues.search(nums1, target1)); // Expected output: 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println("Output: " + rotTargetImpQues.search(nums2, target2)); // Expected output: -1

        int[] nums3 = {1};
        int target3 = 0;
        System.out.println("Output: " + rotTargetImpQues.search(nums3, target3)); // Expected output: -1
    }
}
