#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    int j=0,k=0;
    for ( j = 2; j < n; j++)
    {
        /* code */
        for ( k = 2; k < j; k++)
        {
            /* code */
            if (j % k == 0)
            {
                break;
            }
        }
        if(k>=j)
        {
            printf("%d\n",j);
        }
    }
}