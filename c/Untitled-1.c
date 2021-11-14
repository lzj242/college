#include<stdio.h>
#include<math.h>
int main()
{
	int a,b,c;
	float empty=0.0;
	scanf("%d %d %d ",&a,&b,&c);
	empty=(sqrt(-1*(b*b-4*a*c)))/2*a;
	printf("%.3f",empty);
	return 0;
}