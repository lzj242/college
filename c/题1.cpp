#include<stdio.h>
int main()
{
	int a[100],t,n,i;
	for(i=0;(a[i]!=0);i++){
	scanf("%d",&a[i]);
	if(a[i]<a[i+1])
	{ 
	t=a[i];
	a[i]=a[i+1];
	a[i+1]=t;
    }
}
	scanf("%d",&n);
	for(i=0;(a[i]!=0);i++)
	{
		if(n>a[i]&&n<a[i+1])
		a[i+1]=n;
	}
	for(i=0;i<100;i++)
	printf("%d",a[i]);
	return 0;
}
