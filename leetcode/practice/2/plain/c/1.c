#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>
int main()
{
    long int n;
    scanf("%ld", &n);

    if (n >= pow(2, 31) || n <= -1 * pow(2, 31))
    {
        printf("³ö´í");
    }
    else
    {
        int t = 1, i = 0, s;
        int a[32];
        int j = 1;
        s = abs(n);
        long int x = 0;
        long int b = 1;
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
            if (a[d] != 0)
            {
                x += a[d] * b;
            }
            if (x > pow(2, 31) || x < -1 * (pow(2, 31)))
            {
                printf("³ö´í");
                break;
            }
            if ((b * 10) > pow(2, 31))
            {
                break;
            }
            else
            {
                b *= 10;
            }
        }
        x = x * j;
        printf("%d", x);
    }
}