#include<stdio.h>
#include<math.h>
int main()
{
	int i,t;
	for(i=101;i<=200;i++)
	{
	for(t=2;t<sqrt(i);t++)
    {
	if(i%t==0)
	break;
    }}
    if(t>=sqrt(i))
    printf("%d\t",i);
	return 0;
} 