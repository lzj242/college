#include<stdio.h>
int main()
{
	int m,n,y,b,t;
	scanf("%d,%d",&m,&n);
	if(m<n)
    { 
	t=m;
	m=n;
    n=t;
}
y=m*n;
b=m%n; 
while(b!=0)
{
	m=n;
	n=y;
	b=m%n;
}
printf("%d\n",y/n);
printf("%d",n);
return 0;
}
