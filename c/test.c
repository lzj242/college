#include <stdio.h>
#include <math.h>
int main()
{
    double n, d, x;
    int j;
    n = pow(10, 100);
    d = (int)n % 10;
    x = n / 10;
    j = x - (d * 5);
    if (j % 17 == 0)
    {
        printf("1\n");
    }
    else
    {
        printf("0\n");
    }
}