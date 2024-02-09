public class IndexOutOfBoundsException {
    public static void main(String[] args) {
        try{
            int[] arr = new int[10];
            for(int i=0;i<=20;i++){
                arr[i] = i;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
