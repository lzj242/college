#include<stdio.h>
int main()
{
	int n;
	while(1)
	{
		scanf("%d",&n);
		if(n==0)
		{
			break;
		}
		else
		{
			int j=n/10;
			if((j-((n%10)*5))%17==0)
			{
				printf("1\n");
			}else
			{
				printf("0\n");	
			}
		}
	} 
}