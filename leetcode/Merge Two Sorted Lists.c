#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *next
} *newnode,*temp,*head,*head2,*head3,*temp3;
void linklist(int key){

    newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=key;
    newnode->next=NULL;

    if(head==NULL){
        head=temp=newnode;
    }else{
        temp->next=newnode;
        temp=newnode;
    }
}
void linklist2(int key){

    newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=key;
    newnode->next=NULL;

    if(head2==NULL){
        head2=temp=newnode;
    }else{
        temp->next=newnode;
        temp=newnode;
    }

}
void display(struct node *p){
    if(p){
        printf("%d ",p->data);
        display(p->next);
    }
}
void display2(struct node *p){
    if(p){
        printf("%d ",p->data);
        display2(p->next);
    }
}

void third(struct node *p,struct node *q){

    while(p!=NULL && q!=NULL){

            printf("\n p->data: %d  Q->data: %d",p->data,q->data);


            if(p->data <=q->data){
                    temp=p;
                    p=p->next;

            }else if(p->data >=q->data ){
                    temp=q;
                    q=q->next;
            }

            if(head3==NULL){
                temp3=head3=temp;
            }else{
                temp3->next=temp;
                temp3=temp;
            }
    }
    if(p){
        temp3->next=p;
    }
    if(q){
        temp3->next=q;
    }



}
void display3(struct node *r){
    if(r){
        printf("%d ",r->data);
        display3(r->next);
    }
}


void main(){

        linklist(10);
        linklist(12);
        linklist(25);
        linklist(34);
        linklist(56);
        linklist(58);
        linklist(78);
        linklist(98);
        linklist(105);

        display(head);

        linklist2(12);
        linklist2(32);
        linklist2(32);
        linklist2(45);
        linklist2(47);
        linklist2(65);
        linklist2(78);
        linklist2(98);
        linklist2(115);
        linklist2(127);
        linklist2(172);
        linklist2(1198);



        printf("\n\n");
        display2(head2);

        third(head,head2);

        printf("\n\nMerged node: \n\n");
        display3(head3);
}
