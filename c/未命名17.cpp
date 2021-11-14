#include<stdio.h>
#include<math.h>
int main()
{
    int  w,h;
    float t;
	scanf("%d,%d",w,h);
	t=w/(pow( h,2)); 
	printf("%f\n",t);
	return 0;
}
