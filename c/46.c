// 输入一个华氏温度，要求输出摄氏温度。公式为c=(5/9)(F-32)
//     保留两位小数
#include<stdio.h>
int main()
{
    double F;
    scanf("%lf",&F);
    double c;
    c=(5.0/9)*(F-32);
    printf("%.2lf",c);
}