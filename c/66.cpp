#include<stdio.h>
#include<math.h>
int whatDay(int y,int m)
{
	int d[12];
	int i,n,a,b,c,sum=0;
     if(y%4==0&&y%100!=0||y%400==0)
	{
	int 	d[12]={31,29,31,30,31,30,31,31,30,31,30,31};
		
		if(y==2000)
		 {
		 for(i=11;i>=0;i--)
		{
			
		    if(i==m-2)
			break;
			sum=sum+d[i];
		} 
		n=sum%7;
		if(n==6)
		;
		else
		n=7-n;	
	}
	else
	{
	for(i=0;i<12;i++)
		{if(m==1)
			
			break;
			sum=sum+d[i];
			if(i==m-2)
			break;
		}
		a=fabs(y-2001);
		b=a/4;
		sum=sum+(a-b)*365+b*366;
		n=sum%7;
}
	}
	else
		{
		 int d[12]={31,28,31,30,31,30,31,31,30,31,30,31};
		for(i=0;i<12;i++)
		{
			if(m==1)
			break;
			sum=sum+d[i];
		    if(i==m-2)
			break;
		} 
		a=fabs(y-2001);
		b=a/4;
		sum=sum+(a-b)*365+b*366;
		n=sum%7;
	}
return (n+1);	
}
int main()
{
	int y,m,c;
	scanf("%d%d",&y,&m);
	c=whatDay(y,m);
    printf("%d年%d月1日是星期%d",y,m,c); 
    return 0;
}
