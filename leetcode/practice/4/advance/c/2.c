#include <stdio.h>
#include<stdlib.h>
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
    int sum=0;
    for (int i = 0; i < n; i++)
    {
        /* code */
        sum+=a[i]-i;
    }
    sum-=n;
    return (abs(sum));
    }