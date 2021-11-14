#include<stdio.h>
#include<math.h>
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
    for (int i = 0; i < n; i++)
    {
        int d=pow(3,i);
        if (d==n)
        {
            a = 1;
            break;
        }
        else if((pow(3,i)>n))
        {
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
}