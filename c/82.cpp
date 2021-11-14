#include<stdio.h>
int main()
{
int n,i,t=0,q=0;
scanf("%d",&n);
int a[n+1];
for(i=1;i<=n;i++)
a[i]=0;
if(n!=1)
{
for(i=1;i<=n;i++)
{
if(a[i]==0)
t++;
if(a[i]==0&&t%3==0)
{
a[i]=1;
q++;
if(q==n-1)
break;
}
if(i==n)
i=0;
}
}
for(i=1;i<=n;i++)
{
if(a[i]==0)
{
printf("%d\n",i);
break;
}
}
return 0;
} 
