#include <stdio.h>
void shuru(int a[10]);
void judge(int b[10]);
void shuchu(int c[10]);
int main()
{
    int d[10];
    shuru(d);
    return 0;
}
void shuru(int a[])
{
    int i;
    for (i = 0; i < 10; i++)
    {
        /* code */
        scanf("%d", &a[i]);
    }
    judge(a);
}
void judge(int b[])
{
    int max, min, n = 0, t = 0, x, y;
    min = b[0];
    max = b[9];
    for (int i = 0; i < 10; i++)
    {
        /* code */
        if (b[i] < min)
        {
            min = b[i];
            n = i;
        }
    }
    {
        x = b[n];
        b[n] = b[0];
        b[0] = x;
    }
    for (int i = 0; i < 10; i++)
    {
        /* code */
        if (b[i] >max)
        {
            max = b[i];
            t = i;
        }
    }
    {
        y = b[t];
        b[t] = b[9];
        b[9] = y;
    }
    shuchu(b);
}
void shuchu(int c[])
{
    for (int i = 0; i < 10; i++)
    {
        /* code */
        printf("%d ", c[i]);
    }
}