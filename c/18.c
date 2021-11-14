#include<stdio.h>
int main()
{
    int judge(int a);
    int n,x;
    scanf("%d",&n);
    x=judge(n);
    if(x==1)
    {
        printf("prime");
    }
    else
    {
        printf("not prime");
    }
    return 0;
}
int judge(int a)
{
    int y,i;
    for (i = 2; i < a; i++)
    {
        /* code */
        if(a%i==0)
        {
            y=0;
            break;
        }
    }
    if(i>=a)
    {
        y=1;
    }
    return y;
}