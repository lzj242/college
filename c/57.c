// 输入x ，计算并输出下列分段函数 f(x) 的值。可以调用数学库函数：平方根函数sqrt(), 绝对值函数fabs() 和幂函数 pow()。

//     保留2位小数
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