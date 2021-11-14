#include <stdio.h>
#include <stdlib.h>
#include <string.h>
//����һ��ѧ���ṹ��
typedef struct Stu
{
    int id;
    int score;
    struct Stu *pnext;
} Stu;
//����һ������
Stu *create_Stu(int n)
{
    //�ȶ���һ��ͷ��㣬�������Ч����
    Stu *head = (Stu *)malloc(sizeof(Stu));
    if (head == NULL)
        return NULL;
    head->id = -1;
    head->score = -1;
    head->pnext = NULL;

    //����Ҫ�����n��������Ϣ���µĽ��ӵ��������
    Stu *tmp = head;
    int i;
    for (i = 0; i < n; i++)
    {
        Stu *new_node = (Stu *)malloc(sizeof(Stu));
        if (new_node == NULL)
            return NULL;
        scanf("%d", &new_node->id);
        scanf("%d", &new_node->score);
        new_node->pnext = NULL;
        //�½ڵ�ӵ��������
        tmp->pnext = new_node;

        tmp = new_node;
    }

    return head;
}

//��һ����������һ������ϲ������ص�һ������ͷ��
Stu *merge_Stu(Stu *students1, Stu *students2)
{
    if (students1 == NULL || students2 == NULL)
        return NULL;

    //���ҵ���һ�������β���
    Stu *tmp1 = students1;
    while (tmp1->pnext != NULL)
    {
        tmp1 = tmp1->pnext;
    }
    //����֮��tmp1��Ϊ��һ�������β���

    Stu *tmp2 = students2;
    //��һ�������β������ӵڶ���������׽��
    tmp1->pnext = tmp2->pnext;

    //��Ҫ�����ͷŵڶ��������ͷ���
    free(tmp2);

    //���غϲ�֮���ͷ���
    return students1;
}

//��������������
void sort_Stu(Stu *students)
{
    if (students == NULL)
        return;

    Stu *pre = NULL;
    Stu *cur = NULL;
    Stu tmp;

    //ѡ�񷨶Խ���������
    for (pre = students->pnext; pre->pnext != NULL; pre = pre->pnext)
    {
        for (cur = pre->pnext; cur != NULL; cur = cur->pnext)
        {
            if (pre->id > cur->id)
            {
                //�������ָ����Ҫ���н���
                //�����򽻻�
                tmp = *pre;
                *pre = *cur;
                *cur = tmp;
                //ָ���򽻻�
                tmp.pnext = pre->pnext;
                pre->pnext = cur->pnext;
                cur->pnext = tmp.pnext;
            }
        }
    }
}

//��ӡ������Ϣ
void print_Stu(Stu *students)
{
    if (students == NULL || students->pnext == NULL)
    {
        printf("invalid list!\n");
        return;
    }

    Stu *cur = students->pnext; //ָ���׽��
    while (cur != NULL)
    {
        printf("%d %d\n", cur->id, cur->score);
        cur = cur->pnext;
    }
}

//�ͷ���������
void destory_Stu(Stu *students)
{
    if (students == NULL)
        return;

    Stu *s = students;
    Stu *tmp = NULL; //�������浱ǰ���ͷŵĽ�����һ�����

    while (s != NULL)
    {
        tmp = s->pnext;
        free(s);
        s = tmp;
    }
}

int main()
{
    int N, M;
    scanf("%d %d", &N, &M);

    //������������
    Stu *students1 = create_Stu(N);
    Stu *students2 = create_Stu(M);

    //�ϲ���������
    Stu *students = merge_Stu(students1, students2);

    //���������е����ݰ�ѧ���������в���ӡ
    sort_Stu(students);
    print_Stu(students);

    destory_Stu(students);
    return 0;
}