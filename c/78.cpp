#include <stdio.h>

// ����funP��ʵ����ѧ����P����
// ����ֵ������P(n,x)��ֵ
double funP(int n, double x)
{
    // �������ﲹ����룬ʵ�ֵݹ麯��funP
    /********** Begin *********/
    double t;
    if(n==0)	return 1;
    else if (n==1)	{t=x;return t;}
    else {	t=((2*n-1)*funP(n-1,x)-(n-1)*funP(n-2,x))/n;
	return t;}
    
    /********** End **********/
}

int main()
{
    int n;
    double x;
    scanf("%d %lf", &n, &x);
    printf("P(%d, %lf)=%.4lf\n", n, x, funP(n,x));
    return 0;
}

