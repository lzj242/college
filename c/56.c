// 输入一个正数x和一个正整数n，求下列算式的值。要求定义两个调用函数：fact(n) 计算n的阶乘；mypow(x, n)
// 计算x的n次幂（即xn），两个函数的返回值类型是double。
//     x
//     - x2 / 2 !+x3 / 3 !+... + (-1)n - 1xn / n !

// ×输出保留4位小数。
#include <stdio.h>
int main()
{
    double fact(int n);
    double mypow(double x,int n);
    double x;
    int n;
    scanf("%lf %d",&x,&n);
    fact(n);
    mypow(x,n);
}