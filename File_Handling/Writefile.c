
#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h> // f=file, cntl = control.
//#include<unistd.h>  //this is use for macos or linux OS.

int main()
{
    char Fname[30]; //use to store the file name.

    char Data[11] = "Marvellous";//This array is use to write data in file.

    int fd = 0,ret = 0;

    printf("enter the file name that you want to write\n");
    scanf("%s",&Fname);

    fd = open(Fname,O_RDWR); //first you need to open the file.
    if(fd == -1)
    {
        printf("Unable to open file\n");
        return -1;
    }
    else
    {
        printf("file is sucessfully opened with fd:%d\n",fd);
    }

    ret = write(fd,Data,10);//when you open the file now you can write data in it.
    if(ret == 0)
    {
        printf("unable to write in file");
    }

 return 0;
}