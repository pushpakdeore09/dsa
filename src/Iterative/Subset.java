package Iterative;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public List<List<Integer>> subset(List<Integer> list){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for(int i=0; i<list.size(); i++){
            int size = ans.size();
            for(int j=0; j< size; j++){
                List<Integer> newSubset = new ArrayList<>(ans.get((j)));
                newSubset.add(list.get(i));
                ans.add(newSubset);
            }
        }
        return ans;
    }
}
