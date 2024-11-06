public class Main {
    public static void main(String[] args) {
        int[] numbers=arrayGenerator(6,1,6);
        for (int n :numbers){
            System.out.print(n+" ");
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("\nsto confrontando numbers["+i+"]="+numbers[i]);
            for(int j=i+1;j<numbers.length;j++){
                System.out.println("----- con numbers["+j+"]="+numbers[j]);
                if (numbers[i]==numbers[j]){
                    System.out.println("!!!!!!!!!!!!!!!!! trovato !!!!!!!!!!!!!!!!!! numbers["+i+"]="+numbers[j]);
                }
            }
        }


    }
    public static int[] arrayGenerator(int length, int min, int max) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random()*(max-min+1)+min);
        }
        return array;
    }
}