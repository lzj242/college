/*
31.从头输入星期的字母,判断是周几

题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。

程序分析：用情况语句比较好，如果第一个字母一样，则判断用情况语句或if语句判断第二个字母。
*/
#include<stdio.h>
int main()
{
   char c,j;
   scanf("%c",&c);
   getchar();
   switch(c)
   {
   	case'm':printf("星期一");break;
   	case't':
   		scanf("%c",&j);
	   if(j=='u')
	   printf("星期二");
	   else
	   printf("星期四");
	   break;
	   case'w':printf("星期三");break;
	   case'f':printf("星期五");break;
	   case's':
	   	scanf("%c",&j);
	   if(j=='u')
	   printf("星期六");
	   else
	   printf("星期日");
	   break;
	   default :printf("错误");
}
	 return 0;	
}
