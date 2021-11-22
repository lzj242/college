#include <stdio.h>
int main()
{
    int resolve(int *nums, int numsSize);
    int count, result, t;
    scanf("%d", &count);
    int nums[count];
    for (int i = 0; i < count; i++)
    {
        /* code */
        scanf("%d", &nums[i]);
    }
    printf("%d\t", resolve(nums, count));
    for (int i = 0; i < resolve(nums, count); i++)
    {
        /* code */
        printf("%d\t", nums[i]);
    }
    return 0;
}
int resolve(int *nums, int numsSize)
{
    int i, cnt = 0;

    for (i = 0; i < numsSize; i++)
    {
        if (i == 0 || nums[i] != nums[i - 1])
            nums[cnt++] = nums[i];
    }
    return cnt;
}