#include <stdio.h>
#include <math.h>
int main()
{
    int judge(long int n);
    int x, y;
    scanf("%d", &x);
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
    int a=0;
    for(int i=0;i<n;i++)
    {   long int d=pow(3,i);
        if(d==n)
        {
            a=1;
            break;
        }
    }
    if (a==1)
    {
        /* code */
        return 1;
    }
    else
    {
        return 0;
    }
}