package BitManipulation;

public class BitManipulation {

    public String convertToBinary(int n){
        StringBuilder res = new StringBuilder();
        while(n!=0){
            if(n%2 == 1){
                res.append('1');
            }else {
                res.append('0');
            }
            n=n/2;
        }
        return res.reverse().toString();

    }

    public int convertToDecimal(String binary){
        int ans = 0;
        int power = 1;
        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '1'){
                ans += power;
            }
            power *= 2;
        }
        return ans;
    }
}
