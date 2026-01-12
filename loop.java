public class loop {
    public static void main(String[] args) {

        // for loop
        System.out.println("For Loop:");
        for(int i = 1; i <= 3; i++){
            System.out.print(i + " ");
        }

        // while loop
        System.out.println("\nWhile Loop:");
        int j = 1;
        while(j <= 3){
            System.out.print(j + " ");
            j++;
        }

        // do-while loop
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do{
            System.out.print(k + " ");
            k++;
        }while(k <= 3);
    }
}
