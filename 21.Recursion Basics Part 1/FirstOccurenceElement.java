public class FirstOccurenceElement{
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(occurCheck(arr, 5, 0));
    }
    public static int occurCheck(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return occurCheck(arr, key, i+1);
    }
}