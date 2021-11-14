#include<stdio.h>
int main()
{
	int max(int x,int y);
	int a,b,c;
	scanf("%d %d",&a,&b);
	c=max(a,b);
	printf("%d",c);
	return 0;
}
int max(int x,int y)
{
	int c;
	if(x>y)
c=x;
else
c=y;
return c;
}
