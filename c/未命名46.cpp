#include<stdio.h>
#include<math.h>
int main()
{
	int a,b;
	double t;
	scanf("%d",&a);
	t=sqrt(a);
	b=(int)t;
	if(a>=1000)
	printf("ÇëÖØĞÂÊäÈë");
	else
	printf("%d\n",b);
	return 0;
} 
