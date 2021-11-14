#include <stdio.h>
#include <string.h>
struct MyFamilyAccount
{
    /* data */
    int flags;      //判断是否有一笔收支
    char details[2000]; //明细
    double balance;     //余额
};
char key = ' ';      //表示用户输入了那个菜单
int loop = 1;        //控制是否退出循环
char note[20] = " "; //说明
char temp[100];
char judge;
double money = 0;
//完成收支细节函数
void detail(struct MyFamilyAccount *myFamilyAccount);
void income(struct MyFamilyAccount *myFamilyAccount);
void delete (struct MyFamilyAccount *myFamilyAccount);
void quit(struct MyFamilyAccount *myFamilyAccount);
void mainMenu(struct MyFamilyAccount *myFamilyAccount) //显示菜单
{
    do
    {
        /* code */
        printf("\n----------家庭收支记账软件----------\n");
        printf("\n");
        printf("            1 收支明细     \n");
        printf("            2 登记收入     \n");
        printf("            3 登记支出     \n");
        printf("            4 退    出     \n");
        printf("\n");
        printf("请选择(1-4)：\n");
        scanf("%c", &key);
        getchar();
        switch (key)
        {
        case /* constant-expression */ '1':
            detail(myFamilyAccount);
            /* code */
            break;
        case '2':
            income(myFamilyAccount);
            break;
        case '3':
            delete(myFamilyAccount);
            break;
        case '4':
            quit(myFamilyAccount);
            break;
        default:
            printf("您的输入有误，请重新输入\n");
            break;
        }
    } while (loop);
    printf("你已经成功退出了家庭记账软件");
    getchar();
}
void main()
{
    //创建一个结构体变量
    struct MyFamilyAccount myFamilyAccount;
    myFamilyAccount.flags = 0;
    myFamilyAccount.balance = 1000;
    //使用拷贝方法赋值
    memset(myFamilyAccount.details, 3000, 0); //清零
    strcpy(myFamilyAccount.details, "------------------当前收支明细记录-----------------\n收支\t收支金额\t账户金额\t说明\n");
    //调用mainMneu
    mainMenu(&myFamilyAccount);
}
void detail(struct MyFamilyAccount *myFamilyAccount)
{
    if (myFamilyAccount->flags == 0)
    {
        printf("当前没有一笔收支，来一笔吧\n");
    }
    else
    {
        puts(myFamilyAccount->details);
    }
}
void income(struct MyFamilyAccount *myFamilyAccount)
{
    printf("本次收入金额:");
    scanf("%lf", &money);
    getchar();
    myFamilyAccount->balance += money; //更新余额
    printf("本次收入说明:");
    gets(note);
    sprintf(temp, "\n收入\t%.2lf\t\t%.2lf\t\t%s", money, myFamilyAccount->balance, note);
    strcat(myFamilyAccount->details, temp);
    myFamilyAccount->flags = 1;
}
void delete (struct MyFamilyAccount *myFamilyAccount)
{
    printf("本次支出金额:");
    scanf("%lf", &money);
    getchar();
    //判断是否够支出
    if (myFamilyAccount->balance - money < 0)
    {
        printf("余额不足");
    }
    else
    {
        myFamilyAccount->balance -= money; //更新余额
        printf("本次支出说明:");
        gets(note);
        sprintf(temp, "\n支出\t%.2lf\t\t%.2lf\t\t%s", money, myFamilyAccount->balance, note);
        strcat(myFamilyAccount->details, temp);
        myFamilyAccount->flags = 1;
    }
}
void quit(struct MyFamilyAccount *myFamilyAccount)
{
    do
    {
        /* code */
        printf("你确定要退出吗？y/n\n");
        scanf("%c", &judge);
        getchar();
        if (judge == 'y' || judge == 'n')
        {
            break;
        }
        else
        {
            /* code */
            printf("你的输入有误，请重新输入");
        }
    } while (/* condition */ 1);
    if (judge == 'y')
    {
        loop = 0;
    }
}