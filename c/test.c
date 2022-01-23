#include <stdio.h>
int resolve(int n);
int main()
{

    int n;
    scanf("%d", &n);
    printf("%d", resolve(n));
    return 0;
}
int resolve(int n)
{
    if (n == 0)
    {
        return 0;
    }
    if (n == 1 || n == 2)
    {
        return 1;
    }
    return resolve(n - 1) + resolve(n - 2);
}
