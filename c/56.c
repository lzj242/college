// ����һ������x��һ��������n����������ʽ��ֵ��Ҫ�����������ú�����fact(n) ����n�Ľ׳ˣ�mypow(x, n)
// ����x��n���ݣ���xn�������������ķ���ֵ������double��
//     x
//     - x2 / 2 !+x3 / 3 !+... + (-1)n - 1xn / n !

// ���������4λС����
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