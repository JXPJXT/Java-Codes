import java.util.*;
import java.util.concurrent.SubmissionPublisher;

public class sumretzeroImp{
    public List<List<Integer>> threeSum(int nums[]){
        List<List<Integer>> result = new ArrayList <List<Integer>> ();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> triplet = new ArrayList < Integer > ();
                        tripled.add(nums[i]);
                        triplet.add(nums[k]);
                        triplet.add(nums[j]);
                        Collections.sorrt(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>> (result));
        return result;
    }
    public static void main(String args[]){
        sumretzeroImp Szero = new sumretzeroImp();
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(Szero.threeSum(nums));
    }
}