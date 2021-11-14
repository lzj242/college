#include<stdio.h> 
int main()
{
    int a[1000],i,j,k=0,n;
   printf("请输入所有参加竞选的猴子的总数：\n");
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
         printf("第%d只猴子就是猴王！",a[i]);
      return 0;
}
