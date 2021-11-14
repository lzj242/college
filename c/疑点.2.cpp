#include<stdio.h>
#include<math.h>
int main()
{
    int  w,W,h;
    float t,H;
	scanf("%d,%d",&w,&h);
	t=w/pow(h,2); 
	W=w*2; 
	H=h*1e-2;
    printf("t=%f\nW=%d\nH=%f",t,W,H);
	return 0;
}
