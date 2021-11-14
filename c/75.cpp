#include<stdio.h>
int main()
{
	int n,i,k,t=0,sum=0,a;
	scanf("%d %d",&n,&k);
	for(i=n;i>=2;i--)
	{
		for(a=i-1;a>1;a--)
		{
			if(i%a==0)
			break;
		}
		if(a>1)
		;
		else
			{
			printf("%d ",i);
			t++;
			sum=sum+i;
			}
			if(t==k)
			break;
	}
	printf("%d",sum);
	return 0;
} 
