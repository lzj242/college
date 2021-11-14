// 已有一个已正序排好的9个元素的数组，今输入一个数要求按原来排序的规律将它插入数组中。//
#include<stdio.h>
int main()
{
    int a[9];
    for(int i=0;i<9;i++)
    {
        scanf("%d",&a[i]);
    }
    int n,t=0;
    scanf("%d",&n);
    int b[10];
    for(int i=0;i<9;i++){
        if(n>a[i])
        {
            b[i]=a[i];
        }
        else if(n<=a[i])
        {   if(t==0)
            {
                b[i]=n;
                t++;
                i--;
            }
            else
            {
                b[i+1]=a[i];
            }
        }
    }
    for (int i = 0; i < 10; i++)
    {
        printf("%d\n", b[i]);
    }
}