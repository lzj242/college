#include <stdio.h>
int main()
{
    int resolve(int n, int *a);
    int n;
    scanf("%d", &n);
    int nums[n];
    for (int i = 0; i < n; i++)
    {
        /* code */
        scanf("%d", &nums[i]);
    }
    int d = resolve(n, nums);
    printf("%d", d);
}
int resolve(int n, int *a)
{
    int sum1 = 0, sum2 = 0;
    int t;
    for (int i = 0; i <= n; i++)
    {
        /* code */
        sum1 += i;
    }
    for (int i = 0; i < n; i++)
    {
        /* code */
        sum2 += a[i];
    }
    t = sum1 - sum2;
    return t;
}