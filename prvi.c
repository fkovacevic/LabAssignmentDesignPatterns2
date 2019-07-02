#include <stdio.h>
#include <string.h>

typedef  int (*compar)(const void*, const void *);

const void* my_max(const void *base, size_t nmemb, size_t size,
				  int (*compar)(const void *, const void *))
  {
	  int i;
	  void* max_element = (void*) base;
	  void *array_element;
	  
	  for (i = 0;i<nmemb;i++)
	  {
		  array_element = (void*) base+(i*size);
		  if (compar(array_element,max_element))
			  max_element = array_element;
	  }
	  return max_element;
  }
  
  
  
  
  int gt_int (int *broj1, int *broj2)
  {
	  if (*broj1 > *broj2)
		  return 1;
	  return 0;
  }
  
 
  char gt_char(char *char1, char *char2)
  {
	  if (*char1 > *char2)
		  return 1;
	  return 0;
  }
  
  int gt_str(char **polje1, char **polje2)
  {
	  if (strcmp(*polje1,*polje2) > 0)
		  return 1;
	  return 0;
  }
  
  
  
  
  int size_of_array(int total_size, int byte_per_element)
  {
	  return total_size/byte_per_element;
  }
  
  
 
  int main(void)
	{
		int arr_int[] = { 1, 3, 5, 7, 4, 6, 9, 2, 14 };
		const int *max_int;
		char arr_char[]="Suncana strana ulice";
		const char *max_char;
		const char* arr_str[] = 
		{
			"Gle", "malu", "vocku", "poslije", "kise",
			"Puna", "je", "kapi", "pa", "ih", "njise"
		};
		const char **max_str;
		
		max_int = (const int*)my_max(&arr_int[0], size_of_array(sizeof(arr_int),sizeof(arr_int[0])),
						  sizeof(arr_int[0]), &gt_int);
		printf("najveci integer je %d\n", *(max_int));
		
		max_char = (const char*)my_max(&arr_char[0], size_of_array(sizeof(arr_char),sizeof(arr_char[0])),
						  sizeof(arr_char[0]), &gt_char);
		
		printf("najveci char je %c\n", *(max_char));
		/*printf("%d, velicina prvog polja je %d", sizeof(arr_str), sizeof(arr_str[0]));*/
		max_str = (const char*)my_max(&arr_str[0], size_of_array(sizeof(arr_str),sizeof(arr_str[0])),
						  sizeof(arr_str[0]), &gt_str);
		printf("najveci string je %s", *(max_str));
		return 0;
	  
  }
  
  
  