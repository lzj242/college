#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int a[n],c[n];
    for (int i = 0; i <n; i++)
    {
        /* code */
        scanf("%d",&a[i]);
    }
    int d;
    scanf("%d",&d);
    for (int i = 0; i < n; i++)
    {
        /* code */
        if(i+d>n-1)
        {
            c[i+d-n]=a[i];
        }
        else{
            c[i+d]=a[i];
        }
    }
    for (int i = 0; i < n; i++)
    {
        /* code */
        printf("%d ",c[i]);
    }
    return 0;
}