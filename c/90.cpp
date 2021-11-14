
/********** Begin *********/



/********** End **********/
#include<stdio.h>
int main()
{
	int n,t,c=0,l,j,z=0,f,max=0,i,o,p=0;
	int a[100],b[100];
	scanf("%d",&n);
	while(n--)
	{
		scanf("%d",&t);
		
		for(i=0;i<t;i++)
		scanf("%d",&a[i]);
	
		if(c==0)
		for(f=0;f<i;f++)
		b[f]=a[i];
		else
		for(f=0;f<)	
		c++;
		p=p+t;
		if(n==0)
		break;
	}
	for(j=0;j<p;j++)
	{
	for(f=0;f<=j;f++)
	{
	if(a[j]==a[f])
	z++;	
}
if(max<z)
{
	max=z;
	o=a[j];
}
}
printf("%d %d",max,o);
return 0;
}
