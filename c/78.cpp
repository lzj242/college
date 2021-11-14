#include <stdio.h>

// 函数funP：实现数学函数P函数
// 返回值：返回P(n,x)的值
double funP(int n, double x)
{
    // 请在这里补充代码，实现递归函数funP
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

