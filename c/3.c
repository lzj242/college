// ��Sn=1!+2!+3!+4!+5!+��+n!ֵ֮������n��һ������(n������20)��
#include<stdio.h>
int main()
{
   long int n,sn=0,c=1;
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        for(int t=i;t>0;t--)
        {
            c=c*t;
        }
        sn=sn+c;
        c=1;
    }
    printf("%ld",sn);
}