public class Bar
{

  

  public static void barGraphify(int[] x){
    for (int i = 0; i < x.length; i++){
      for(int j = 0; j < x[i]; j++){
        System.out.print("=");
      }
      System.out.println();
    }
  }

  public static void main(String[] args){
    int[] arr = {1, 5, 7, 3};
    barGraphify(arr);
  }



}
}