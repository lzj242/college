#include<stdio.h>
int main()
{
	int m,n,t,y,b;
	scanf("%d,%d",&m,&n);
	if(m>n)
	{
		t=m;
		m=n;
		n=t;
}
	b=m*n;
	while(n!=0)
	{
	y=n%m;
	n=m;
	m=y;	
	}
	printf("%d\n",y/n);
	printf("%d",b/n);
	return 0;
}
