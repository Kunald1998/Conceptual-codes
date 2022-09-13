#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h> // f=file, cntl = control.

int main()
{
    char Fname[30];

    int fd = 0;
    printf("enter the file name that you want to craete\n");
    scanf("%s",&Fname);

    fd = creat(Fname,0777);
    if(fd == -1)
    {
        printf("Unable to create file\n");
    }
    else
    {
        printf("file is sucessfully created with fd:%d\n",fd);
    }

 return 0;
}