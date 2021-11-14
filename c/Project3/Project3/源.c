#include<stdio.h>
int main()
{
    int n, a[10];
    scanf_s("%d", &n,1);
    for (int i = 0; i < 10; i++)
    {
        scanf_s("%d", &a[i],4);
    }
    printf("%d", n);
    for (int i = 0; i < n; i++)
    {
        printf("%d\t", a[i]);
    }
    return 0;
}