// ��Sn = a + aa + aaa +��+ aa��aaa����n��a��ֵ֮������a��һ�����֣�Ϊ2�� ���磬n = 5ʱ = 2 + 22 + 222 + 2222 + 22222��n�ɼ������롣
#include<stdio.h>
#include<math.h>
int main()
{
    int n,sum=0,a=2;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        sum+=a;
        a=2+a*10;
    }
    printf("%d",sum);
}