// 编写程序，输入一批学生的成绩，遇0或负数则输入结束，要求统计并输出优秀（大于85）、通过（60～84）和不及格（小于60）的学生人数。

//     运行示例：
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