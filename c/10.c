// ��ʽ����a��ƽ�����ĵ�����ʽΪ:X[n + 1] = (X[n] + a / X[n]) / 2 Ҫ��ǰ����������Ĳ�ľ���ֵ����0 .00001�� �������3λС��
#include <stdio.h>
#include <math.h>
int main()
{
    double x, b, c;
    scanf("%lf",&x);
    b = x / 2;
    while (1)
    {
        c = (b + x / b) / 2;
        if (fabs(c - b) < 0.00001)
            break;
        b = c;
    }
    printf("%.3lf\n", c);
    return 0;
}