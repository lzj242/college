#include<stdio.h>
int main()
{
	char ch;
ch=getchar();
while(ch!='\n')
{
	if('A'<=ch&&ch<='z')
	if('A'<=ch&&ch<'W'||'a'<=ch&&ch<'w')
	ch=ch+4;
	else
	ch=ch-22;
	printf("%c",ch);
	ch=getchar();
}
printf("\n");
	return 0;
}
