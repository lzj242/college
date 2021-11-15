#include <stdio.h>
int main()
{
    int a[10];
    int i, j;
    for (i = 0; i < 10; i++)
    {
        scanf("%d", &a[i]);
        if (a[i] == 0)
            break;
    }
    for (j = 0; j < i; j++)
    {
        printf("%d\n", a[j] / 2);
    }
    return 0;
}