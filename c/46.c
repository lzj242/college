// ����һ�������¶ȣ�Ҫ����������¶ȡ���ʽΪc=(5/9)(F-32)
//     ������λС��
#include<stdio.h>
int main()
{
    double F;
    scanf("%lf",&F);
    double c;
    c=(5.0/9)*(F-32);
    printf("%.2lf",c);
}