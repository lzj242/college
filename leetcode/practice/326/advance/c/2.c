#include <stdio.h>
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
    double c;
    c=log10(n)/log10(3);
    return fmod(c,1)==0;
}