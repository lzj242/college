// 给定一个整数数组 nums?和一个整数目标值 target，请你在该数组中找出 和为目标值 target? 的那?两个?整数，并返回它们的数组下标。
//     你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//     你可以按任意顺序返回答案。
#include <stdio.h>
#include <string.h>
int main()
{
    int target;
    int n;
    int first, second;
    scanf("%d",&n);
    int nums[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &nums[i]);
    }
    scanf("%d", &target);
    for (int k = 0; k < n; k++)
    {
        /* code */
        for (int j = 0; j < n; j++)
        {
            /* code */
            if (nums[j] != -1 && nums[k] != -1)
            {
                if (k != j && (nums[j] + nums[k] == target))
                {
                    first = k > j ? k : j;
                    second = k < j ? k : j;
                    nums[j] = -1;
                    nums[k] = -1;
                    printf("[%d %d]\n", second, first);
                }
            }
        }
    }
}