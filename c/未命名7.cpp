#include<stdio.h>
int main()
{
	int a[10]={2,5,8,9,19,4,98,93,8,0},i,n;
	printf("������һ��С��100�����ֵ���������,�м��ÿո����\n");

	 printf("������������Ҫɾ������\n");
	 scanf("%d",&n);
     for(i=0;i<100;i++){
     if(a[i]==n)
a[i]=a[i+1];
}
	for(i=0;i<10;i++)
	printf("%d",a[i]); 
    return 0;	
}
