/*
31.��ͷ�������ڵ���ĸ,�ж����ܼ�

��Ŀ�����������ڼ��ĵ�һ����ĸ���ж�һ�������ڼ��������һ����ĸһ����������жϵڶ�����ĸ��

�����������������ȽϺã������һ����ĸһ�������ж����������if����жϵڶ�����ĸ��
*/
#include<stdio.h>
int main()
{
   char c,j;
   scanf("%c",&c);
   getchar();
   switch(c)
   {
   	case'm':printf("����һ");break;
   	case't':
   		scanf("%c",&j);
	   if(j=='u')
	   printf("���ڶ�");
	   else
	   printf("������");
	   break;
	   case'w':printf("������");break;
	   case'f':printf("������");break;
	   case's':
	   	scanf("%c",&j);
	   if(j=='u')
	   printf("������");
	   else
	   printf("������");
	   break;
	   default :printf("����");
}
	 return 0;	
}
