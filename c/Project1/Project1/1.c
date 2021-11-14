#include<stdio.h>
int main()
{
    int n, a[10];
    scanf("%d", &n);
    for (int i = 0; i < 10; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("%d", n);
    for (int i = 0; i < n; i++)
    {
        printf("%d", a[i]);
    }
    return 0;
}