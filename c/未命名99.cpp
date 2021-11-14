#include<stdio.h>
	int swap(int a,int b)
	{
		int t;
		t=a;
		a=b;
		b=t;
		return a;
	
	}
	int main()
	{
		int a,b;
		scanf("%d,%d",&a,&b);
		if(a<b)
		swap(a,b);
		printf("max=%d,min=%d",a,b);
		return 0;
	}

