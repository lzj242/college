#include<stdio.h>
int main() 
{
	char str[99];
	int i,num=0,word=0;
	gets(str);
	char c;
	for(i=0;(c=str[i])!='\0';i++)
	if(c==' ')word=0;
	else if(word==0)
	{
		num++;
		word=1;//ֻҪ����0���������ֶ����ԡ����word=0��num++ÿ�ζ���ִ�С� 
	}
	printf("There are %d words in this line .\n",num);
	return 0;
}
