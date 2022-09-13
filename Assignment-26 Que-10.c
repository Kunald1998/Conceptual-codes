//predict the output question from assignment 26 question no 10.


#include<stdio.h>
#include<stdlib.h>

int main()
{
int size = 0;
int icnt = 0;
int *p = NULL;

	printf("Enter the numbers of elements \n");
	scanf("%d",&size);

	p = (int*)malloc(size * sizeof(int));

	printf("please enter elements");

	for(icnt = 0;icnt < size;icnt++)
	{
		scanf("%d",&p[icnt]);
	}

	printf("Entered numbers are");

	for(icnt = 0; icnt < size; icnt++)
	{
		printf("%d",p[icnt]);
	}

	free(p);

 return 0;
}


/*
Enter the numbers of elements
5
please enter elements10
20
30
40
50
Entered numbers are1020304050
*/