#include<stdio.h> 
int main()
{
    int a[1000],i,j,k=0,n;
   printf("���������вμӾ�ѡ�ĺ��ӵ�������\n");
   scanf("%d",&n);
   for(i=1;i<=n;i++)
      a[i]=i;
    j=n;
   for(i=0;j>1;i++)
    {
      if(a[i%n+1]!=-1)
         k++;
      if((k==3)&&(a[i%n+1]!=-1))
      {
         a[i%n+1]=-1;
         j--;
         k=0;
      }
    }
   for(i=1;i<=n;i++)
      if(a[i]!=-1)
         printf("��%dֻ���Ӿ��Ǻ�����",a[i]);
      return 0;
}
