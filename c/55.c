// ����10�������ҳ����о���ֵ��С���������������һ����������Ȼ�������10������
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
int main()
{
    int nums[10], min = __INT_MAX__, t;
    for (int i = 0; i < 10; i++)
    {
        /* code */
        scanf("%d", &nums[i]);
        if (min > abs(nums[i]))
        {
            min = abs(nums[i]);
            t = i;
        }
    }
    if (t != 9)
    {
        int d;
        d = nums[t];
        nums[t] = nums[9];
        nums[9] = d;
    }
    for (int i = 0; i < 10; i++)
    {
        /* code */
        printf("%d ",nums[i]);
    }
}