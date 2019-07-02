  #include <iostream>
  #include <assert.h>
  #include <stdlib.h>
  #include <list>


	class Shape {
		public : virtual void draw ()=0;
	};
	
	class Circle : public Shape{
		virtual void draw(){
			std::cout <<"in Circle draw\n";
		}
	};

	class Square : public Shape{
		virtual void draw(){
			std::cout <<"in Square draw\n";
		}
	};

	void drawShapes ( const std :: list <Shape*> &fig ){
			std :: list < Shape * >:: const_iterator it ;
			for ( it = fig.begin (); it != fig.end (); ++ it ){
			(*it)->draw();
		}
}
/*
  struct Point{
    int x; int y;
  };
  struct Shape{
    enum EType {circle, square,rhomb};
    EType type_;
  };
  struct Circle{
     Shape::EType type_;
     double radius_;
     Point center_;
  };
  struct Square{
     Shape::EType type_;
     double side_;
     Point center_;
  };
  struct Rhomb{
	Shape::EType type_;
	double side_;
	Point center_;
	double angle;
  };
  void drawSquare(struct Square*){
    std::cerr <<"in drawSquare\n";
  }
  void drawCircle(struct Circle*){
    std::cerr <<"in drawCircle\n";
  }
  void drawRhomb(struct Rhomb*){
	std::cerr <<"in drawRhomb\n";
  }

  void drawShapes(Shape** shapes, int n){
    for (int i=0; i<n; ++i){
      struct Shape* s = shapes[i];
      switch (s->type_){
      case Shape::square:
        drawSquare((struct Square*)s);
        break;
      case Shape::circle:
        drawCircle((struct Circle*)s);
        break;
	  case Shape::rhomb:
		  drawRhomb((struct Rhomb*)s);
		  break;
      default:
        assert(0); 
        exit(0);
      }
    }
  }



  void moveShapes (Shape** shapes, int n, int shift){
	  Shape *cur;

	  for (int i = 0; i< n; i++)
	  {
		cur = shapes[i];
		std :: cout<< " u foru i = " << i << "\n";
		switch (cur->type_)
		{
			case Shape::square:
			{
				struct Square* square = (struct Square*)cur;
				(square->center_).x = (square->center_).x + shift;
				(square->center_).y = (square->center_).y + shift;
				std::cout << "shifted square for " << shift << "\n";
				break;
			}
			case Shape::circle:
			{
				struct Circle* circle = (struct Circle*)cur;
				(circle->center_).x = (circle->center_).x + shift;
				(circle->center_).y = (circle->center_).y + shift;
				std::cout << "shifted circle for " << shift << "\n";
				break;
			}
			default:
			{
				assert(0); 
				exit(0);
			}
			
	  }


  }
  }
  */
 

  int main(){
   /* Shape* shapes[5];
    shapes[0]=(Shape*)new Circle;
    shapes[0]->type_=Shape::circle;
    shapes[1]=(Shape*)new Square;
    shapes[1]->type_=Shape::square;
    shapes[2]=(Shape*)new Square;
    shapes[2]->type_=Shape::square;
    shapes[3]=(Shape*)new Circle;
    shapes[3]->type_=Shape::circle;
	shapes[4] = (Shape*) new Rhomb;
	shapes[4]->type_=Shape::rhomb;


    drawShapes(shapes, 5);
	moveShapes(shapes, 5, 10);*/
	Shape *circle = new Circle();
	Shape *square = new Square();
	std :: list<Shape*> lista;
	lista.push_back(circle);
	lista.push_back(square);
	drawShapes(lista);
	system("PAUSE");
  }