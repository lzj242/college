#include<stdio.h>
int main()
{
    int a[10];
    for(int i=0;i<10;i++){
        scanf("%d",&a[i]);
    }
    for(int j=0;j<10;j++){
        for(int k=0;k<10-j-1;k++)
        {
            int t;
            if(a[k]>a[k+1])
            {
                t=a[k];
                a[k]=a[k+1];
                a[k+1]=t;
            }
        }
    }
    for (int i = 0; i < 10; i++)
    {
        printf("%d\t", a[i]);
    }
    return 0;
}