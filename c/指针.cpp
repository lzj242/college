#include<stdio.h>
int main()
{
	void max(int *p1,int *p2);
	int m,n;
	int *p1,*p2;
	scanf("%d,%d",&m,&n);
     p1=&m;
     p2=&n;
     max(p1,p2);
     printf("%d,%d",*p1,*p2);
     return 0;
}
 void max(int *p1,int *p2)
 {
 	int t;
 	if(*p1>*p2)
 	{
 		t=*p1;
 		*p1=*p2;
 		*p2=t;
 	}
 }
