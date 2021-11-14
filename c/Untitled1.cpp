#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main()
{
    int n;
    scanf("%d", &n);
    int t = 1, i = 0, s;
    int a[32];
    int j = 1;
    s = abs(n);
    long int x = 0;
    long double b = 0.1;
    while (1)
    {
        t = s % 10;
        a[i] = t;
        i++;
        s = (s - t) / 10;
        if (s == 0)
        {
            break;
        }
    }
    if (n < 0)
    {
        j = -1;
    }
    for (int d = i - 1; d >= 0; d--)
    {
        /* code */
        b *= 10;
        if (a[d] != 0)
        {
            x += a[d] * b;
        }
    }
    x = x * j;
    printf("%ld", x);
    return 0;
}
