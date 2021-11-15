// 编写程序，输入一个正整数n，求下列算式的值。要求定义和调用函数fact(k) 计算k的阶乘，函数返回值的类型是double。

//     1 +
//     1 / 2 + ....+ 1 / n !

//                       输出保留5位小数。
#include <stdio.h>
int main()
{
    double fact(int k);
    int n;
    scanf("%d", &n);
    double sum = 0;
    for (int i = 1; i <= n; i++)
    {
        /* code */
        sum += 1/fact(i);
    }
    printf("sum=%.5lf", sum);
}
double fact(int k)
{
    double d = 1.0;
    for (int i = 1; i <= k; i++)
    {
        /* code */
        d *= i;
    }
    return d;
}