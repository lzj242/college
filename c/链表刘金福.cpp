#include<stdio.h>
#include<stdlib.h>
struct student
{
	int num;
	char name[20];
	float score;
	struct student *next;
};
int i,n; 
struct student *creat()
{ 
	struct student *head, *p1, *p2;
	p1=p2=(struct student*)malloc(sizeof(struct student));
	printf("��������Ҫ��ӵ�ѧ����Ŀ��");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		printf("Num %d: ", i+1);
		scanf("%d", &p1->num);
		printf("Name %d: ",i+1);
		scanf("%s",&p1->name);
		printf("Score %d: ", i+1);
		scanf("%f", &p1->score);	
		if(i==0)
		{
			head = p1;
		}
		if(i>0)
		{
			p2->next = p1;
		}
		p2 = p1;
		p1 = (struct student*)malloc(sizeof(struct student));
	}
	p2->next=NULL;
	return head;
}
void find(struct student *head)
{
	int s; 
	printf("\n��������Ҫ����ѧ����ѧ�� ��");
	scanf("%d",&s);
	while( (head->num!=s)&&head->next)
	{
		head = head->next;
	}
	if( head->num ==s )
	{
		printf("Num: %d\n", head->num);
		printf("Name:%s\n",head->name);
		printf("Score: %.2f\n", head->score);
	}
	else
		printf("\nû�з��ָ�ѧ����Ϣ\n\n");
}  
struct student *del(struct student *head) 
{  
	struct student *p, *p1; 
	int num;
	printf("\n\n����������Ҫɾ��ѧ����Ϣ��ѧ��: "); 
	scanf("%d",&num); 
	p=head; 
	while(num!=p->num&&p->next) 
	{ 
		p1=p,p=p->next; 
	} 
	if(num==p->num ) 
	{  
		if(p==head)
			head = p->next;
		else
			p1->next = p->next; 
	}
 	else
		printf("\n%d û�з��ָ�ѧ����Ϣ\n", num);
	return head;
} 
struct student *insert(struct student *head)
{
	int i;
	struct student  *p, *p1, *p2; 
	p= (struct student*)malloc(sizeof(struct student)); 
	printf("����������Ҫ�޸�ѧ����Ϣ��ѧ��:"); 
	scanf("%d",&i);
	printf("Num: "); 
	scanf("%d", &p->num); 
	printf("Name: ");
	scanf("%s",&p->name);
	printf("Score: "); 
	scanf("%f", &p->score); 
	p1=head;
 	if(head == NULL)
	{ 
		head = p;  
		p->next = NULL; 
	} 
	while(p->num > p1->num && p1->next) 
		p2 = p1, p1=p1->next;
	if( p->num <= p1->num ) 
	{ 
		if(head == p1)  
			head = p, p->next=p1;  
		else  
			p2->next = p, p->next=p1; 
	} 
	else 
		p1->next = p, p->next = NULL; 
	return head;
}  
void print(struct student *head)
{
	int i=0; 
	printf("\n\n�����ѧ����Ϣ:\n"); 
	while(head != NULL) 
	{	  
		printf("Num %d: %d\n",i+1,head->num); 
		printf("Name %d:%s\n",i+1,head->name);
		printf("Score %d: %.2f\n\n",i+1, head->score);  
		head = head->next;
		i++;
	} 
}
main()
{	struct student *head;
	head = creat(); 
	print(head); 
	find(head); 
	head = del(head); 
	printf("\nִ��ɾ������֮��ѧ������Ϣ��\n"); 
	print(head); 
	head = insert(head);
	printf("\nִ���޸Ĳ���֮��ѧ������Ϣ�� \n");
 	print(head);
}

