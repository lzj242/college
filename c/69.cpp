#include<stdio.h>
int main()
{
	int f(int );
	int i,a=1;
	for(i=1;i<=5;i++)
	printf("%d!=%d\t",i,f(i));
	return 0;
}
int f(int a)
{
	 static int f=1;
	f=f*a;
	return f;
}
