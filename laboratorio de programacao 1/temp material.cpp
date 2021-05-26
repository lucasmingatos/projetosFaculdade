#include <stdio.h>
#include <stdlib.h>

int i;
float m=1000;

main()
{
	for (i=1; i<=180; i++)
	{
		m = m - m*0.1;
	}
	printf("A massa do material apos 3 minutos de esperimento sera %2f", m);
	system("pause");
}
