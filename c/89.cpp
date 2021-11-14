// 请在此添加代码，通过统计朋友圈点赞，统计个人爱好功能
/********** Begin *********/



/********** End **********/
#include<stdio.h>
int main()
{
	int n,t,c=0,l,j,z=0,f,max=0,i,o,p=0,g=0;
	int a[100],b[100];
	scanf("%d",&n);
	while(n--)
	{
		scanf("%d",&t);
		for(i=0;i<t;i++)
		{
		scanf("%d",&a[i]);
		g=g+t;
		if(c==0)
		{
		for(f=0;f<i;f++)
		b[f]=a[i];
		}
		else
		{
		for(f=g;f<g+t;f++)
		b[f]=a[i];
		}
		c++;
		p=f;
}
	}
	for(i=0;i<=p;i++)
    {
        if(b[i]>=max)
        {
            max=b[i];
            g=i;
        }
    }
    printf("%d %d\n",g,b[g]);
return 0;	
}

