#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    getchar();
    struct Score
    {
        char xuehao[20];
        char name[20];
        int graden[3];
        /* data */
    } score[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%s %s %d %d %d",&score[i].xuehao,&score[i].name, &score[i].graden[0], &score[i].graden[1], &score[i].graden[2]);
        getchar();
    }
    for (int i = 0; i < n; i++)
    {
        printf("%s,%s,%d,%d,%d\n",score[i].xuehao,score[i].name, score[i].graden[0], score[i].graden[1], score[i].graden[2]);
    }
    return 0;
}
//�ַ���������벻����ֻ��gets������%s��
//gets��Ҫ�������룬%s����Ҫ
//ͬ�������Ȼ