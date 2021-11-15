#include<stdio.h>
#include<limits.h>
int main()
{
    int n;
    scanf("%d",&n);
    int nums[n][n];
    int x,y,max=INT_MIN;
    for (int j = 0; j < n; j++)
    {
        /* code */
        for (int k = 0; k <n; k++)
        {
            /* code */
            scanf("%d",&nums[j][k]);
            if(nums[j][k]>max)
            {
                max=nums[j][k];
                x=j;
                y=k;
            }
        }
    }
    printf("%d %d %d",max,x+1,y+1);
}