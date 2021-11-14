#include <stdio.h>
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
    if (n < 3)
    {
        if (n ==1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    else
    {
        if(n%3==0)
        {
            return judge(n/3);
        }
        else
        {
            return 0;
        }
    }
}