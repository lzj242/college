// ��д��������һ��������n����������ʽ��ֵ��Ҫ����͵��ú���fact(k) ����k�Ľ׳ˣ���������ֵ��������double��

//     1 +
//     1 / 2 + ....+ 1 / n !

//                       �������5λС����
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