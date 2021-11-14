#include<stdio.h>
int main()
{ 
	int n;
	scanf("%d",&n);
	int a[n+1];
	for(int i=1;i<=n;i++)
	a[i]=0;
    int x=1,z,l=0,j=0,t;
while(l<=(n-1))
{
		for(x=1;x<=n;x++)
{
		{
    		if(a[x]==3)
    		a[x]=12;
		}
    	{	
    	if(a[x]==12)
    	l++;
		}
	x++;
		a[x]=3;
	}
}
for(x=1;x<=n;x++)
{
	if(a[x]==12)
printf("%d",x);
}
return 0;	
}
