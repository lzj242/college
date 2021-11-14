#include<stdio.h>
int main()
{
	int i,n;
	scanf("%d",&n);
	for(i=2;i<n;i++)
		if(n%i==0)
		break; 
		if(i<n)
		printf("%d isn't a prime",n);
		else
		printf("%d is a prime",n);
	return 0;
}
