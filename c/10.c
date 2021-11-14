// 公式：求a的平方根的迭代公式为:X[n + 1] = (X[n] + a / X[n]) / 2 要求前后两次求出的差的绝对值少于0 .00001。 输出保留3位小数
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