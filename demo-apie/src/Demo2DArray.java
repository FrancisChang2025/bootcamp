public class Demo2DArray {
  public static void main(String[] args) {
    int[] arr = new int[] {1,2,3};
    int[] arr2 = new int[3];
    String s = "hello";
    arr[0] = s.length();

    // 2D array
    // level 1,2,3
    // MAX_HP, MAX_MP, PA, PD, MA, MD

    // new int[row][column]
    // 3 roles
    // 10 levels
    // 6 attributes
    int[][] warrior_values = new int[10][6];
    int[][] mage_values = new int[10][6];
    int[][] archer_values = new int[10][6];



    // write
    warrior_values[0] = new int[] {200, 80, 10, 8, 5, 3};
    warrior_values[9] = new int[] {500, 200, 80, 50, 40, 20};

    int[][] arr2d = new int[][] {{10,20,30}, {100,90,-100}};
        
    // read
    System.out.println(arr2d[0][0]);  // 10
    System.out.println(arr2d[1][2]);  // -100
    System.out.println(arr2d[0][1]);  // 20
    System.out.println(arr2d[1][0]);  // 100

    System.out.println(arr2d.length);  // 2, number of rows
    System.out.println(arr2d[0].length);  // 3, number of columns for each row

    for (int row = 0; row < arr2d.length; row++) {
      for (int col = 0; col < arr2d[row].length; col++) {
        System.out.println("row="+row+"col="+col+", value=" + arr2d[row][col]);
      }
    }


  }
}
