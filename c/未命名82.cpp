#include<stdio.h>
int main()
{
	 int a[30],i,n;
	 for(i=0;i<30;i++)
	 scanf("%d",&a[i]);
	 for(i=0;i<30;i++)
	 {
	 n=a[i+1]-a[i];
	 printf("%d\t",n);
}
return 0;
}
