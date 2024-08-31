#include <stdio.h>
#include <conio.h>
#include <graphics.h>
#include <stdlib.h>


void LineClipping()
{
    
}


int main() {
	int x1,y1,x2,y2;
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "c:\\turboc3\\bgi");

    printf("Enter the first point:-");
    scanf("%d%d",&x1,&y1);
    printf("Enter the last point:-");
    scanf("%d%d",&x2,&y2);

    LineClipping();

    getch();
    return 0;
}