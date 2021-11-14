#include <stdio.h>
int main()
{
    int n, t = 0;
    scanf("%d", &n);
    int a[n];
    for (int i = 0; i < n; i++)
    {
        /* code */
        scanf("%d", &a[i]);
    }
    for (int j = 0; j <= n; j++)
    {
        for (int k = 0; k < n; k++)
        {
            /* code */
            if (j != a[k])
            {
                t = 0;
            }
            else if(j==a[k])
            {
                t = 1;
                break;
            }
        }
        if(t==0)
        {
            printf("%d",j);
            break;
        }
    }
}