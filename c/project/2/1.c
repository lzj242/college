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
        printf("-----------------客户信息管理软件-----------------\n");
        printf("                 1 添 加 客 户                    \n");
        printf("                 2 修 改 客 户                    \n");
        printf("                 3 删 除 客 户                    \n");
        printf("                 4 客 户 列 表                    \n");
        printf("                 5 退       出                \n");
        printf("请选择(1-5):                     \n");
        scanf("%c", &key);
        getchar();
        int i=0;
        switch (key)
        {
        case '1':
            printf("---------------------添加客户---------------------\n");
            printf("姓名：");
            gets(stu[i].name);
            printf("性别：");
            gets(stu[i].index);
            printf("年龄:");
            scanf("%d", &stu[i].age);
            getchar();
            printf("电话：");
            gets(stu[i].iphonenumbers);
            printf("邮箱:");
            gets(stu[i].emailadress);
            i++;
            loop=1;
            printf("---------------------添加完成---------------------\n");
            break;
        case '2':
            printf("---------------------修改客户---------------------\n");
            printf("请选择待修改客户编号(-1退出)：");
            scanf("%d",&number);
            getchar();
            puts(details);
            printf("---------------------修改完成---------------------\n");
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