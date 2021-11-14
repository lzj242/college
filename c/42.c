#include <stdio.h>
#include <stdlib.h>
#include <string.h>
//定义一个学生结构体
typedef struct Stu
{
    int id;
    int score;
    struct Stu *pnext;
} Stu;
//创建一个链表
Stu *create_Stu(int n)
{
    //先定义一个头结点，不存放有效数据
    Stu *head = (Stu *)malloc(sizeof(Stu));
    if (head == NULL)
        return NULL;
    head->id = -1;
    head->score = -1;
    head->pnext = NULL;

    //输入要加入的n个结点的信息，新的结点加到链表最后
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
        //新节点加到链表最后
        tmp->pnext = new_node;

        tmp = new_node;
    }

    return head;
}

//将一个链表与另一个链表合并，返回第一个链表头部
Stu *merge_Stu(Stu *students1, Stu *students2)
{
    if (students1 == NULL || students2 == NULL)
        return NULL;

    //先找到第一个链表的尾结点
    Stu *tmp1 = students1;
    while (tmp1->pnext != NULL)
    {
        tmp1 = tmp1->pnext;
    }
    //出来之后tmp1就为第一个链表的尾结点

    Stu *tmp2 = students2;
    //第一个链表的尾结点连接第二个链表的首结点
    tmp1->pnext = tmp2->pnext;

    //不要忘记释放第二个链表的头结点
    free(tmp2);

    //返回合并之后的头结点
    return students1;
}

//链表结点排序重组
void sort_Stu(Stu *students)
{
    if (students == NULL)
        return;

    Stu *pre = NULL;
    Stu *cur = NULL;
    Stu tmp;

    //选择法对结点进行排序
    for (pre = students->pnext; pre->pnext != NULL; pre = pre->pnext)
    {
        for (cur = pre->pnext; cur != NULL; cur = cur->pnext)
        {
            if (pre->id > cur->id)
            {
                //数据域和指针域都要进行交换
                //数据域交换
                tmp = *pre;
                *pre = *cur;
                *cur = tmp;
                //指针域交换
                tmp.pnext = pre->pnext;
                pre->pnext = cur->pnext;
                cur->pnext = tmp.pnext;
            }
        }
    }
}

//打印链表信息
void print_Stu(Stu *students)
{
    if (students == NULL || students->pnext == NULL)
    {
        printf("invalid list!\n");
        return;
    }

    Stu *cur = students->pnext; //指向首结点
    while (cur != NULL)
    {
        printf("%d %d\n", cur->id, cur->score);
        cur = cur->pnext;
    }
}

//释放整个链表
void destory_Stu(Stu *students)
{
    if (students == NULL)
        return;

    Stu *s = students;
    Stu *tmp = NULL; //用来保存当前所释放的结点的下一个结点

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

    //创建两个链表
    Stu *students1 = create_Stu(N);
    Stu *students2 = create_Stu(M);

    //合并两个链表
    Stu *students = merge_Stu(students1, students2);

    //对新链表中的内容按学号升序排列并打印
    sort_Stu(students);
    print_Stu(students);

    destory_Stu(students);
    return 0;
}