package Theory_Practice.Code_With_Imtiaz;

public class Array {
    int[] array;
    int count=0;

    public Array(int length) {
        array = new int[length];
    }

    public void insert(int item){

        if (array.length==count){
            int[] newArray = new int[count*2];
            for (int i = 0; i < count ; i++) {
                newArray[i] = array[i];
            }
            array=newArray;
        }

       array[count] =item;
       count++;
   }

   public void delete(){
        if (count==0){
            print();
        }else {
            count--;
        }
   }

   public void print(){

        if (count==0){
            System.out.println("\nNo item");
        }else {
            System.out.println();
            System.out.print("[ ");
            for (int i = 0; i <  count ; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.print("]");

        }

   }
}
