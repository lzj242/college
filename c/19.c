#include <stdio.h>
int main()
{
    void transform(int x[3][3]);
    int a[3][3];
    for(int i=0;i<3;i++)
    {
        for(int t=0;t<3;t++)
        {
            scanf("%d",&a[i][t]);
        }
    }
    transform(a);
    return 0;
}
void transform(int a[3][3])
{
    int j,k;
    for(j=0;j<3;j++)
    {
        for(k=0;k<3;k++)
        {
            printf("%d ",a[k][j]);
            if(k==2)
            {
                printf("\n");
            }
        }
    }
}