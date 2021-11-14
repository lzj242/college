#include<stdio.h>
int main()
{
	char a='*',b=' ';
	int i,j;
	for(i=0;i<=7;i++){
	for(j=0;j<=7;j++)
	if((i+j)%2==0)
	printf("%c%c",a,a);
	else
	printf("%c",b);
    printf("\n");}
	return 0;
} 
