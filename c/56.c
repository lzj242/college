// ����һ������x��һ��������n����������ʽ��ֵ��Ҫ�����������ú�����fact(n) ����n�Ľ׳ˣ�mypow(x, n)
// ����x��n���ݣ���xn�������������ķ���ֵ������double��
//     x
//     - x2 / 2 !+x3 / 3 !+... + (-1)n - 1xn / n !

// ���������4λС����
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