/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarrays1hugogomez;

/**
 *
 * @author Hugo Gomez Amador
 */
public class EjerciciosArrays1HugoGomez {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public boolean firstLast6(int[] nums) {
  
    //comparamos el 1 y ultimo valor del array con 6
            if(nums[0]==6 || nums[nums.length-1]==6){
              return true;
            }else{
                return false;
            }
    }
    
    public boolean sameFirstLast(int[] nums) {
        //comparamos el 1 y ultimo numero si el array tiene 1 o mas valores
        if(nums.length>=1 && nums[0]==nums[nums.length-1]){
          return true;
        }
          return false;
  
    }
    public int[] makePi() {
        //inicio un array y guardo los 3 primeros numeros del numero PI
        int a[]={3,1,4};

        return a;
    }
    public boolean commonEnd(int[] a, int[] b) {

        //sellecciono y comparo el primer y ultimo valor
        if(a[0]==b[0] || a[a.length-1]==b[b.length-1]){
          return true;
        }


        return false;
    }
    public int sum3(int[] nums) {
  
  //sumo los valores de todo el array
  return nums[0]+nums[1]+nums[2];
    }
    public int[] rotateLeft3(int[] nums) {
  
        //creo un nuevo array guardando los mismos valores desplazados 1 posicion a la izquierda.
        return new int[]{nums[1],nums[2],nums[0]};
    }
    public int[] reverse3(int[] nums) {
  
        //guardo los mismos valores en el nuevo orden en un array nuevo.
      return new int[]{nums[2],nums[1],nums[0]};
    }
    public int[] maxEnd3(int[] nums) {
  
        //selecciono el valor maximo del array 
        int max=Math.max(nums[0], nums[2]);

        //igualo todas las posiciones al numero maximo
          nums[0]=max;
          nums[1]=max;
          nums[2]=max;

          return nums;
    }
    public int sum2(int[] nums) {
  
        int suma=0;
  
        //si la longitud es 0 no hay nada que sumar
         if(nums.length==0){
           return suma;
         }else{
           if(nums.length==1){//si la longitud es 1 solo puede sumar 1 valor
             suma=nums[0];
           }else{
             if(nums.length>1){//para el resto de longitudes ya puede hacerse la suma.
               suma=nums[0]+nums[1];
             }
           }
         }
 
    return suma;
}
    public int[] middleWay(int[] a, int[] b) {
    
    return new int[]{a[1],b[1]};
}
    public int[] makeEnds(int[] nums) {

    return new int[]{nums[0],nums[nums.length-1]};
}
    public boolean has23(int[] nums) {
        //comparo los valores del array con el 2 y el 3
        if(nums[0]==2 || nums[1]==2 || nums[0]==3 || nums[1]==3){
          return true;
        }
        return false;
}
    public boolean no23(int[] nums) {
        if(nums[0]==2 || nums[1]==2 || nums[0]==3 || nums[1]==3){
          return false;
        }
        return true;
}
    public int[] makeLast(int[] nums) {
  
        int last=nums[nums.length-1];//selecciono ultimo valor del array nums

        int[] newArray= new int[nums.length*2];//creo array del doble de longitud que nums


          newArray[newArray.length-1]=last;//doy el valor de last al ultimo valor del array nuevo


  return newArray;
}
    public boolean double23(int[] nums) {

        if(nums.length==0 || nums.length==1){//si el array solo tiene 1 o menos valores = false;
          return false;
        }
        //comparo la primera posicion con el 2 y 3, si existe un 2 o un 3 y el valor de
        //la primera posicion es igual al valor de la 2 posicion tenemos dos 2(2,2) o dos 3(3,3)
        if((nums[0]==2 && nums[0]==nums[1]) || (nums[1]==3 && nums[1]==nums[0])){
          return true;

        }
  
  return false;
}
    public int[] fix23(int[] nums) {
  
        //comparo el primer y el segundo valor con el 2, ya que si va seguido de un 3
        // el 2 no puede estar en la ultima posicion.

        if(nums[0]==2 && nums[1]==3){
              nums[1]=0;
        }
        //comparo el segundo y tercer valor con el 3, ya que si esta en el primer lugar
        // no puede ir detras de un 2.
        if(nums[1]==2 && nums[2]==3){
              nums[2]=0;
        }
  
  return nums;
}
    public int start1(int[] a, int[] b) {

    int cont=0;

        //los arrays deben tener almenos 1 valor y si su primer valor es 1 el contador aumenta 1
        if(a.length>=1 && a[0]==1){
          cont++;
        }

        if(b.length>=1 && b[0]==1){
          cont++;
        }
    return cont;
    }
    public int[] biggerTwo(int[] a, int[] b) {
  
    //creo las variables de las sumas entre los valores de los arrays
    int sumA=a[0]+a[1];
    int sumB=b[0]+b[1];

        //si la suma de a es mayor que b devuelve a, y sino fuera de la condicion devuelve b
        if(sumA>=sumB){
          return a;
        }

    return b;
  
}
    public int[] makeMiddle(int[] nums) {
        //selecciono el valor de en medio con nums.length/2
        return new int[]{nums[nums.length/2 -1], nums[nums.length/2]};
    }
    public int[] plusTwo(int[] a, int[] b) {
    //creo array de 4 valores ({0,0,0,0})
    int[] myArray= new int[4];

            //reparto los valores para esas 4 posiciones.
            myArray[0]=a[0];
            myArray[1]=a[1];
            myArray[2]=b[0];
            myArray[3]=b[1];

    return myArray;
    }
    public int[] swapEnds(int[] nums) {
  
    int first=nums[0];//seleccionamos el 1 valor
        int last=nums[nums.length-1];//seleccionamos el ultimo valor

        //cambiamos el primero y el ultimo
        nums[0]=last;
        nums[nums.length-1]=first;

    return nums;
    }
    public int[] midThree(int[] nums) {

        return new int[]{nums[nums.length/2-1],nums[nums.length/2],nums[nums.length/2+1]};
}
    public int maxTriple(int[] nums) {
    //guardo el 1 valor, el valor del medio y el ultimo valor del array en sendas variables.
    int a=nums[0];
    int b=nums[nums.length/2];
    int c=nums[nums.length-1];
        //al ser c mayor que las demas variables es el maximo
        if(c>a && c>b){
          return c;
        }
        //si c no es el maximo selecciono el maximo de las demas variables
        //y el resultado sera el maximo de las 3 posiciones del array
    return Math.max(a,b);

    }
    public int[] frontPiece(int[] nums) {
        //si la longitud es menor a 2 hay que devolver el array sin cambiar
        if(nums.length<2){
          return nums;
        }

        //selecciono solo los 2 primeros valores del array
        int[] newArray={nums[0],nums[1]};


    return newArray;
    }
    public boolean unlucky1(int[] nums) {
            //quedan descartados los arrays de longitud <2
            if(nums.length<2){
              return false;
            }
            //voy comprobando posicion por posicion si hay algun 1
            //si lo encuentra y existe un 3 seguido del uno
            //retornara true
            if(nums[0]==1 ){
              if(nums[1]==3 ){
                return true;
              }
            }
             if(nums[1]==1){
               if(nums[2]==3){
               return true;
               }
             }

            if(nums[nums.length-2]==1){
              if(nums[nums.length-1]==3){
                return true;
              }
            }
    return false;
 
    }
    public int[] make2(int[] a, int[] b) {
            //creo un nuevo array de longitud 2
            int [] c = new int[2];

            //segun la longitud del array a asigno unos valores al nuevo array c
            if(a.length==0){
              c[0]=b[0];
              c[1]=b[1];
            }
           if(a.length==1){
            c[0]=a[0];
            c[1]=b[0];
           }
           if(a.length>1){
             c[0]=a[0];
             c[1]=a[1];
           }
            return c;
    }
    public int[] front11(int[] a, int[] b) {
            //si ambas longitudes son 0 devuelve array vacio.
            if(a.length==0 && b.length==0){
              return new int[]{};
            }
            //si la longitud de alguno de los arrays es 0 devuelve el 1 valor del otro array
            if(a.length!=0 && b.length==0){
              return new int[]{a[0]};
            }
            if(a.length==0 && b.length!=0){
              return new int[]{b[0]};
            }
          //al ser ambos arrays de longitud >=2 devuelve la primera posicion de ambos arrays
            return new int[]{a[0],b[0]};
    }
    
}
