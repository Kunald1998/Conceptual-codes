#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h> 

int main()
{
    char Fname[30]; 

    char Data[11] = "Marvellous";

    int fd = 0,ret = 0;

    printf("enter the file name that you want to write\n");
    scanf("%s",&Fname);

    fd = open(Fname,O_RDWR); 
    if(fd == -1)
    {
        printf("Unable to open file\n");
        return -1;
    }
    else
    {
        printf("file is sucessfully opened with fd:%d\n",fd);
        //prinf("Hello") // internaly is consider as write(1,"Hello",5)
    }
    read(fd,Data,6); // here '6' is byte that we wantto read. i.e "Marvel"
    /*for(int iCnt = 0; iCnt<6; iCnt++)
    {
        printf("%d",Data[iCnt]);
    }
    printf("Data from file is: %6s\n",Data);*/
    write(1,Data,6); // 1 = stdout
    close(fd);

 return 0;
}