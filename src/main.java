public class main {
    public static void main(String[] args) {
        int[] a = new int[7];
        for (int i=0;i<a.length;i++){
            a[i] = (int)Math.floor(Math.random()*100);
        }
        System.out.println("Original array:");
        for (int i:a) {
            System.out.print(i+ "\t");
        }

        System.out.println("\n\nStart sorting:");


        insertionSort(a);

    }

    public static void insertionSort(int[] a) {
        boolean check = false;
        for (int i=1;i<a.length;i++){
            System.out.println("\n Phase "+i+":");
            int temp = a[i];
            int j;
            for (j=i-1;j>=0 && a[j] > temp;j--){
                check = true;
                System.out.println("\nInsert "+a[j]+" to number "+a[j+1]+", now array is:\n");
                a[j+1] = a[j];
                display(a);
            }
            if (check) {
                System.out.println("Insert " + temp + " to " + a[j + 1]);
            }
            a[j+1] = temp;
            display(a);
        }
    }

    public static void display(int[] a) {
        System.out.println();
        for (int i:a) {
            System.out.print(i+"\t");
        }
        System.out.println("\n");
    }
}
