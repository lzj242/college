<<<<<<< HEAD
#include <stdio.h>
#include <math.h>
int main()
{
    int judge(long int n);
    long int x, y;
    scanf("%ld", &x);
    y = judge(x);
    if (y == 1)
    {
        printf("true");
    }
    else
    {
        printf("false");
    }
    return 0;
}
int judge(long int n)
{
    int a = 0;
    for (int i = 0; i < 20; i++)
    {
        if ((pow(3,i))==n)
        {
            a = 1;
            break;
        }
    }
    if (a == 1)
    {
        /* code */
        return 1;
    }
    else
    {
        return 0;
    }
=======
// 有一分数序列： 2 / 1 3 / 2 5 / 3 8 / 5 13 / 8 21 / 13...... 求出这个数列的前N项之和，保留两位小数。
#include<stdio.h>
int main()
{
    float sum=0;
    int fenmu,fenzi,n;
    scanf("%d",&n);
    int m[n]={1,2};
    int z[n]={2,3};
    float s[n];
    for(int i=2;i<n;i++)
    {
        m[i]=m[i-1]+m[i-2];
        z[i]=z[i-1]+z[i-2];
        s[i]=z[i]/m[i];
        sum+=s[i];
    }
    sum=sum+0.5+3.0/2;
    printf("%.2f",sum);
    return 0;
>>>>>>> db595bd355b1cec33c01208e0dac83cba1399e4d
}
