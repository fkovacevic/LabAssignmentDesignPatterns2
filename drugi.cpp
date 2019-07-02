
#include <iostream>
#include <vector>
#include <set>
using namespace std;

 int gt_int (int *broj1, int *broj2)
  {
	  if (*broj1 > *broj2)
		  return 1;
	  return 0;
  }

 int gt_str(char **polje1, char **polje2)
  {
	  cout << "u gt_str i prvo polje iznosi " << **polje1 << "\n";
	  if (strcmp(*polje1,*polje2) > 0)
		  return 1;
	  return 0;
  }


template < typename Iterator, typename Predicate >
  Iterator mymax (Iterator cur, Iterator last, Predicate pred)
{
    Iterator max = cur;

    do{
        if (pred(cur,max))
            max = cur;
		cur++;
    }
	while (cur != last);
    
    return max;
    
}


  
int arr_int[] = { 1, 3, 5, 7, 4, 6, 9, 2, 13 };
char* arr_str[] = 
		{
			"Gle", "vocku", "valu", "poslije", "kise",
			"Puna", "je", "kapi", "pa", "ih", "njise"
		};
int main ()
{
   
   int *maxint = mymax (&arr_int[0],
			     &arr_int[sizeof (arr_int) / sizeof (*arr_int) ],
			     gt_int);
   cout << sizeof (arr_int) << " " << sizeof (*arr_int) << "\n";

   char **maxstr;
   maxstr =  mymax (&arr_str[0],
			     &arr_str[sizeof (arr_str) / sizeof (*arr_str)],
			     gt_str);

   
   int *maxvector;
   std::vector<int> myvector;
   myvector.push_back(10);
   myvector.push_back(30);
   myvector.push_back(11);
   myvector.push_back(55);
   myvector.push_back(105);
   maxvector = mymax (&myvector[0],
	   &myvector[sizeof(myvector)/sizeof(myvector[0]) - 1],
			     gt_int);

   int *maxset;
  std :: set<int> myset;
  myset.insert(10);
  myset.insert(20);
  myset.insert(5);
  myset.insert(60);
 
  //maxset = mymax(myset.begin(),
	//			  myset.end(),
		//	   	  gt_int);

  std::cout << *maxint << "\n";
  std::cout << *maxstr << "\n";
  std::cout << *maxvector <<"\n";


  system("PAUSE");
}