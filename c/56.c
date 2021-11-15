// 输入一个正数x和一个正整数n，求下列算式的值。要求定义两个调用函数：fact(n) 计算n的阶乘；mypow(x, n)
// 计算x的n次幂（即xn），两个函数的返回值类型是double。
//     x
//     - x2 / 2 !+x3 / 3 !+... + (-1)n - 1xn / n !

// ×输出保留4位小数。
#include <stdio.h>
#include <math.h>
int main()
{
    double fact(int x);
    double mypow(double x, int n);
    double x;
    int n;
    double sum = 0.0;
    scanf("%lf %d", &x, &n);
    for (int i = 1; i <= n; i++)
    {
        /* code */
        if (i % 2 == 0)
        {
            sum -= (mypow(x, i) / fact(i));
        }
        else
        {
            sum += mypow(x, i) / fact(i);
        }
    }
    printf("%.4lf", sum);
}
double fact(int n)
{
    double d = 1;
    for (int i = 1; i <= n; i++)
    {
        /* code */
        d *= i;
    }
    return d;
}
double mypow(double x, int n)
{
    double y = (double)n;
    return pow(x, y);
}