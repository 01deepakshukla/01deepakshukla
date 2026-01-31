public class LinerSearch {
    public static int linerSearch(int number[], int keys){
        for(int i =0; i<number.length; i++){
            if(number[i]==keys){
                return i;
            }
        }
            return -1;
        }
    
        public static void main(String args[]){
            int number[] = {11, 21,44, 65, 72};
            int keys = 85;
             int index = linerSearch(number, keys);
             if(index== -1){
                System.out.println("not found");
             } else{
                System.out.println("at index");
             }
            }
        }
    
              