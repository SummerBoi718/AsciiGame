package numgame;

public class Display {
    
    //method overloading to display maps
    //string method
    void display(String a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //int method
    void display(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //Map class method to display num map
    void display(Map map){
        String a[][]=map.toString(map.map2d);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
     //standard method to fill a 2d array with desired element
    static void fill(String a[][], String b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=b;
            }
        }
    }
    //method to replace or overwrite elements in the target array in the target starting pos
    static void replace(String a[][],String b[][],int x,int y){
        //x and y value validation
        //array a is the primary array so check if array b and x smaller than a
        if(x >=0 && y >=0 && x + b[0].length <= a[0].length && y + b.length <= a.length){
            for(int i=0;i<b.length;i++){
                for(int j=0;j<b[0].length;j++){
                    //x and y are unchanging in the loop but the i and j arent, so these two values
                    //are vital for the operation of replacing elements within the said indeces
                    a[x+i][y+j]=b[i][j];
                }
            }
        }else{
            System.out.println("Out of range");
        }
    }
}