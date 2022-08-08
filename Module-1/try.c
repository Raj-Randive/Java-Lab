#include <stdio.h>
#include <string.h>

struct student
{
    char name[30];
    char roll_no[30];
    char branch[20];
    int marks[3];
    float spi;
    float cpi;
};

struct student studList[3];

// Function to get data of all students.
void getData(struct student studList[3])
{

    printf("Enter your details (Name, Roll_no, Branch): \n\n");
    for (int i = 0; i < 3; i++)
    {

        printf("Enter your Name: ");
        scanf("%s", studList[i].name);
        printf("Enter your Roll Number: ");
        scanf("%s", studList[i].roll_no);
        printf("Enter your Branch: ");
        scanf("%s", studList[i].branch);

        printf("Enter marks (of Maths, DCEO, DSA): \n");
        for (int j = 0; j < 3; j++)
        {
            scanf("%d", &studList[i].marks[j]);
        }
        printf("\n");
    }
}

int printData()
{
    for (int i = 0; i < 3; i++)
    {
        printf("\nName is : %s", studList[i].name);
        printf("\nRoll Number is : %s", studList[i].roll_no);
        printf("\nBranch is : %s", studList[i].branch);

        printf("\nMarks of Maths, Computer and DSA resp is :");
        for (int j = 0; j < 3; j++)
        {
            printf(" %d ", studList[i].marks[j]);
        }
        printf("\n");
    }
    printf("\n");
    return 0;
}

int main()
{

    getData(studList);
    printData();

    return 0;
}