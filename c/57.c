// ����x �����㲢������зֶκ��� f(x) ��ֵ�����Ե�����ѧ�⺯����ƽ��������sqrt(), ����ֵ����fabs() ���ݺ��� pow()��

//     ����2λС��
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main()
{
    int x;
    double y;
    scanf("%d", &x);
    if (x < 0)
    {
        y = abs(x);
    }
    else if (x >= 0 && x < 2)
    {
        /* code */
        y = sqrt((x+1));
    }
    else if (x >= 2 && x < 4)
    {
        /* code */
        y = pow((x + 2), 5);
    }
    else
    {
        y = (2 * x) + 5;
    }
    printf("%.2lf", y);
}