#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    int nums[n][n];
    int i;
    nums[0][0] = 1;
    for (int j = 0; j < n; j++)
    {
        for (int k = 0; k < n; k++)
        {
            if (j != 0 || k != 0)
            {
                if (k >= 1)
                {
                    i = j + 2;
                    nums[j][k] = nums[j][k - 1] + i;
                }
                else
                {
                    nums[j][k] = nums[j - 1][k] + j;
                }
            }
            i++;
        }
            }
    for (int j = 0; j < n; j++)
    {
        for (int k = 0; k < n; k++)
        {
            if (j + k < n)
            {
                printf("%d", nums[j][k]);
                if (k != n - 1)
                {
                    printf(" ");
                }
                else
                {
                    printf("\n");
                }
            }
        }
    }
}