// ��������ʵ���ĸ�ʽ����������һ�����һ��ʵ������һ�����������ʵ������һ�����������ʵ����ʵ���� "6.2f"��ʽ�����
#include<stdio.h>
int main()
{
    void judge(float f);
    float x;
    scanf("%f",&x);
    judge(x);
    return 0;
}
void judge(float f)
{
    for (int i = 1; i < 4; i++)
    {
        /* code */
        for(int t=1;t<=i;t++)
        {
        printf("%6.2f ",f);
        }
        printf("\n");
    }
}