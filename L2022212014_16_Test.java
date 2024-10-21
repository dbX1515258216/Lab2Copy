
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class L2022212014_16_Test {

    /*
     * 测试用例设计总体原则：
     * 1. 等价类划分原则：将输入分为有效等价类和无效等价类，确保涵盖各种情况。
     * 2. 边界值分析原则：测试输入边界的值，确保函数对临界值的处理满足预期。
     * 3. 需求覆盖原则：确保每个功能需求都对应至少一个测试用例。
     */

    /**
     * 测试目的：测试输入为普通情况的多个数字构成的数组。  
     * 用到的测试用例：[3, 30, 34, 5, 9]，预期输出："9534330"  
     */
    @Test
    public void testCase1() {
        Solution16 solution = new Solution16();
        int[] nums = {3, 30, 34, 5, 9};
        String result = solution.largestNumber(nums);
        assertEquals("9534330", result);
    }

    /**
     * 测试目的：测试输入为两个数字，其中一个数字为零的情况。  
     * 用到的测试用例：[0, 0]，预期输出："0"  
     */
    @Test
    public void testCase2() {
        Solution16 solution = new Solution16();
        int[] nums = {0, 0};
        String result = solution.largestNumber(nums);
        assertEquals("0", result);
    }

    /**
     * 测试目的：测试输入为只包含一个数字的情况。  
     * 用到的测试用例：[5]，预期输出："5"  
     */
    @Test
    public void testCase3() {
        Solution16 solution = new Solution16();
        int[] nums = {5};
        String result = solution.largestNumber(nums);
        assertEquals("5", result);
    }

    /**
     * 测试目的：测试输入为多个数字且包含重复数字的情况。  
     * 用到的测试用例：[1, 1, 1]，预期输出："111"  
     */
    @Test
    public void testCase4() {
        Solution16 solution = new Solution16();
        int[] nums = {1, 1, 1};
        String result = solution.largestNumber(nums);
        assertEquals("111", result);
    }

    /**
     * 测试目的：测试输入为非递增顺序的数字数组。  
     * 用到的测试用例：[21, 2, 1]，预期输出："2211"  
     */
    @Test
    public void testCase5() {
        Solution16 solution = new Solution16();
        int[] nums = {21, 2, 1};
        String result = solution.largestNumber(nums);
        assertEquals("2211", result);
    }
}