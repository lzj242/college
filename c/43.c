// ����10�������������ǵ�ƽ��ֵ�����������ƽ��ֵ�����ݵĸ�����
#include<stdio.h>
int main()
{
    int nums[10],sum=0;
    for (int i = 0; i < 10; i++)
    {
        /* code */
        scanf("%d",&nums[i]);
        sum+=nums[i];
    }
    double average=sum/10.0;
    int t=0;
    for (int i = 0; i < 10; i++)
    {
        /* code */
        if(nums[i]>average)
        {
            t++;
        }
    }
    printf("%d",t);
}