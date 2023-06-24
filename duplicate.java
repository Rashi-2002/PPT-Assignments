
    import java.io.*;
    import java.lang.String;
    import java.lang.System;

    class duplicate{

        public boolean containsDuplicate(int[] nums) {

            for(int i = 0; i < nums.length; i++) {
                for(int j = i + 1; j < nums.length; j++) {
                    if(nums[i] == nums[j]) {
                        return true;
                    }
                }
            }

            return false;
        }

        public static void main (String[] args) {

            duplicate sol = new duplicate();

            int nums[]= {1, 2, 3, 1};

            boolean res = sol.containsDuplicate(nums);

            // printing the result
            System.out.println(res);
        }
    }

