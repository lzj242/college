// ��N��ѧ����ÿ��ѧ�������ݰ���ѧ�š�������3�ſεĳɼ����Ӽ�������N��ѧ�������ݣ�Ҫ���ӡ��3�ſε���ƽ���ɼ���
// �Լ���߷ֵ�ѧ�������ݣ�����ѧ�š�������3�ſγɼ���
#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    struct score
    {
        /* data */
        char xuehao[20];
        char type[20];
        int d[3];
    } graden[n];
    int sum[n], sum1 = 0, sum2 = 0, sum3 = 0, arage = 0;
    for (int i = 0; i < n; i++)
    {
        /* code */
        scanf("%s %s %d %d %d", &graden[i].xuehao, &graden[i].type, &graden[i].d[0], &graden[i].d[1], &graden[i].d[2]);
    }
    for (int i = 0; i < n; i++)
    {
        /* code */
        sum1 += graden[i].d[0];
        sum2 += graden[i].d[1];
        sum3 += graden[i].d[2];
    }
    printf("%d %d %d\n", sum1 / n, sum2 / n, sum3 / n);
    for (int i = 0; i < n; i++)
    {
        /* code */
        sum[i] = graden[i].d[0] + graden[i].d[1] + graden[i].d[2];
    }
    int max = sum[0];
    int t=0;
    for (int i = 1; i < n; i++)
    {
        /* code */
        if (max < sum[i])
        {
            max = sum[i];
            t = i;
        }
    }
    printf("%s %s %d %d %d", graden[t].xuehao, graden[t].type, graden[t].d[0], graden[t].d[1], graden[t].d[2]);
}