// ��д��������һ��ѧ���ĳɼ�����0���������������Ҫ��ͳ�Ʋ�������㣨����85����ͨ����60��84���Ͳ�����С��60����ѧ��������

//     ����ʾ����
#include <stdio.h>
int main()
{
    int nums[60];
    int excellent = 0, adopt = 0, fail = 0;
    for (int i = 0; i < 60; i++)
    {
        /* code */
        scanf("%d", &nums[i]);
        if (nums[i] <= 0)
        {
            break;
        }
        else if (nums[i] >= 85)
        {
            /* code */
            excellent++;
        }
        else if (nums[i] >= 60 && nums[i] <= 84)
        {
            /* code */
            adopt++;
        }
        else if (nums[i] < 60)
        {
            /* code */
            fail++;
        }
    }
    printf(">=85:%d\n",excellent);
    printf("60-84:%d\n",adopt);
    printf("<60:%d", fail);
}