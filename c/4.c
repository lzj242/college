// �����������ĺ�, ����2λС�� 1 ~a֮�� 1 ~b��ƽ���� 1 ~c�ĵ�����
#include<stdio.h>
int main()
{
    int a,b,c;
    scanf("%d %d %d",&a,&b,&c);
    float sum=0;
    for(int i=1;i<=a;i++)
    {
        sum=sum+i;
    }
    for (int i = 1; i <=b; i++)
    {
        /* code */
        sum=sum+i*i;
    }
    for (int i = 1; i<=c; i++)
    {
        /* code */
        sum=sum+1.0/i;
    }
    printf("%.2f",sum);
    return 0;
}
