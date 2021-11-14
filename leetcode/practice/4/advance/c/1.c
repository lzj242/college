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
    int result = n;
    for (int i = 0; i < n; i++)
    {
        /* code */
        result ^= a[i];
        result ^= i;
    }
    return result;
}