#include <stdio.h>
#include <string.h>
struct Package
{
    char name[20];
    char index[10];
    int age;
    char iphonenumbers[30];
    char emailadress[30];
};
int main()
{
    struct Package stu[200];
    char key = ' ';
    int number;
    int loop=0;
    void getstu(struct Package * stu)
    {
        printf("%d\t%s\t%c\t%d\t%s", (*stu).id, (*stu).name, (*stu)gender, (*stu).age, (*stu).phone, (*stu).email);
    }
    do
    {
        /* code */
        printf("-----------------�ͻ���Ϣ�������-----------------\n");
        printf("                 1 �� �� �� ��                    \n");
        printf("                 2 �� �� �� ��                    \n");
        printf("                 3 ɾ �� �� ��                    \n");
        printf("                 4 �� �� �� ��                    \n");
        printf("                 5 ��       ��                \n");
        printf("��ѡ��(1-5):                     \n");
        scanf("%c", &key);
        getchar();
        int i=0;
        switch (key)
        {
        case '1':
            printf("---------------------��ӿͻ�---------------------\n");
            printf("������");
            gets(stu[i].name);
            printf("�Ա�");
            gets(stu[i].index);
            printf("����:");
            scanf("%d", &stu[i].age);
            getchar();
            printf("�绰��");
            gets(stu[i].iphonenumbers);
            printf("����:");
            gets(stu[i].emailadress);
            i++;
            loop=1;
            printf("---------------------������---------------------\n");
            break;
        case '2':
            printf("---------------------�޸Ŀͻ�---------------------\n");
            printf("��ѡ����޸Ŀͻ����(-1�˳�)��");
            scanf("%d",&number);
            getchar();
            puts(details);
            printf("---------------------�޸����---------------------\n");
            break;
        case '3':
            printf("quite");
            break;
        case '4':
            printf("found");
            break;
        case '5':
            printf("out");
        default:
            break;
        }
    } while (1);
    return 0;
}