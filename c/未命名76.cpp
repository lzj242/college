#include<stdio.h>
int main()
{
int n,i,m=0;
printf("100~200之间的素数为\n");
for(n=101;n<=200;n+=2)
{
for(i=2;i<n;i++)
	if(n%i==0)
	break;
	if(i<n)
	continue;
	else
	printf("%d ",n);
	m++;
	if(m%10==0)
	printf("\n");
	}
	return 0;
}
