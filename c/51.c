// ������������20����������ͳ�����еĸ���������������������ƽ��ֵ��
//     ������λС��
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