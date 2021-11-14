// 键盘输入任意20个整型数，统计其中的负数个数并求所有正数的平均值。
//     保留两位小数
#include <stdio.h>
int main()
{
    int nums[20], t = 0;
    double average = 0, sum = 0;
    for (int i = 0; i < 20; i++)
    {
        /* code */
        scanf("%d", &nums[i]);
        if (nums[i] < 0)
        {
            t++;
        }
        else
        {
            sum += nums[i];
        }
    }
    average = sum / (20 - t);
    printf("%d %.2lf", t, average);
}