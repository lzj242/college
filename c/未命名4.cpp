#include<stdio.h>
int main()
{
	int *p,a=9;
	p=&a;
	printf("%d\t",*p);
	printf("%d\t",p);
	printf("%d",&p); 
	return 0;
}
