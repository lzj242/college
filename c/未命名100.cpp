#include<stdio.h>
int swap(int *x,int *y)
 {
 	int t;
 	t=*x;
 	*x=*y;
    *y=t; 
 }
 int main()
 {
 	int a,b;
 	int *pointer_1,*pointer_2;
 	scanf("%d,%d",&a,&b);
 	pointer_1=&a;
 	pointer_2=&b;
 	if(a<b)
 	swap(pointer_1,pointer_2);
 printf("max=%d,min=%d",a,b);
 return 0;
 }
