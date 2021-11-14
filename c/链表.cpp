#include<stdio.h>
struct student 
{
	int num;
	float score;
	struct student*next;
} ;
int main()
{
struct student a,b,c,*head,*p;
a.num=01;
a.score=89;
b.num=01;
b.score=89;
c.num=01;
c.score=89;
head=&a;
a.next=&b;
b.next=&c;
c.next=NULL;
p=head;
do
{
	printf("%d,%f\n",(*p).num,(*p).score);
	p=(*p).next;
}	while(p!=NULL);
return 0;
} 
