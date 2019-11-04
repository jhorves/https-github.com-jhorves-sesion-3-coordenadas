
import java.util.*;
import java.lang.Math;
import maps.Coordenada; //importar clase
class Main {

  public static void maps(){

    ArrayList<Coordenada> lista = new ArrayList<Coordenada>();
    //Lista es una coleccion;
    System.out.println("Tamanio de lista: "+ lista.size());
    Coordenada o = new Coordenada();
    o.lat = 1;
    o.loj = 3;
    lista.add(o);

    System.out.println("Tamanio de lista: "+ lista.size());


  }



  public static void main(String[] args) {
  System.out.println("Tengo hambre BREAK!!!!");
  double x;
  double y;
  
  Scanner input = new Scanner(System.in);
  x = input.nextDouble();
  y = input.nextDouble();

  System.out.println("Suma es :"+(x+y));
  System.out.println("Multiplicación es :"+(x*y));
  System.out.println("División es :"+ x/y);
  System.out.println("Raiz es :"+ Math.pow(x,-y));
  //System.out.println("Raiz es "+(x.Math));
  for (int i=1; i<=5; i++){
    System.out.println("Hola");
  }

  System.out.println("===========");
  
int a=1;
  while (a<=x) {
    System.out.println("Hola");
    a++;
    }

    System.out.println("===========");

int b = 1;
    do{
      System.out.println("Hola");
      b++;
    }while(b<=x);
    
    maps();


    }
}