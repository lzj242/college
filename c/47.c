#include <stdio.h>
int main()
{
    int x;
    double y;
    scanf("%d", &x);
    if (x < 1)
    {
        y = x;
    }
    else if (x >= 1 || x < 10)
    {
        /* code */
        y = 2 * x - 1;
    }
    else
    {
        y = 3 * x - 11;
    }
    printf("%.2lf", y);
}