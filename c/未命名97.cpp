//如果一个分数的分子和分母的最大公约数是1，
//这个分数称为既约分数。例如，3/4 , 5/2 , 1/8 , 7/1都是既约分数。
//请问，有多少个既约分数，分子和分母都是1 到2020 之间的整数（包括1和2020）？
#include<stdio.h>
int main()
{
	int i,j,n=0,a;
	for(i=1;i<=2020;i++){
	for(j=1;j<=2020;j++)
	if(i<j)
	{for(a=2;a<i;a++)
	if(i%a==0&&j%a==0)
	break;
	else
   ;
	}

    if(i>=j)
	{
		for(a=2;a<j;a++)
	if(i%a==0&&j%a==0)
	break;
	else
   ;
	}

}
printf("%d",n);
return 0;
}
