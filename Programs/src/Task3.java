
public class Task3 {

	public static void main(String[] args) {
		//int[] b = {1, 1, 1, 1, 0, 0};//4
		//int[] b = {1 ,1 ,0 ,1 ,0 ,0 ,1 ,1}; //5
		int[] b = {0, 0, 1, 1, 0, 0};//3
		//int[] b = {1,1};//3
		
		System.out.println(new Task3().solution(b));
		
		System.out.println(new Task3().flipCoin((b)));
	}

	int solution(int[] A) {
        int n = A.length;
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] == A[i + 1])
                result = result + 1;
        }
        int r = -1; //Changed to -1
        for (int i = 0; i < n; i++) {
            int count = 0;
            if (i > 0) {
                if (A[i - 1] != A[i]) //Changed to Not equal
                    count = count + 1;
                else
                    count = count - 1;
            }
            if (i < n -1) {
                if (A[i + 1] != A[i]) //Changed to Not equal
                    count = count + 1;
                else
                    count = count - 1;
            }
            r = Math.max(r, count);
        }
        return result + r;
    }
	
	
	public int flipCoin(int[] coins) {
        if (coins.length == 0) {
            return 0;
        }
        
        for (int i = 1; i < coins.length - 1; i++) {
            if (coins[i - 1] != coins[i] && coins[i] != coins[i + 1]) { // 010 or 101
                coins[i] = coins[i] == 1 ? 0 : 1;
                return adjacency(coins);
            }
        }
        
        for (int i = 1; i < coins.length - 1; i++) {
            if (coins[i - 1] == coins[i] && coins[i] != coins[i + 1]) {
                coins[i + 1] = coins[i + 1] == 1 ? 0 : 1;
                return adjacency(coins);
            } else if (coins[i - 1] != coins[i] && coins[i] == coins[i + 1]) {
                coins[i - 1] = coins[i - 1] == 1 ? 0 : 1;
                return adjacency(coins);
            }
        }
        
        coins[0] = coins[0] == 1 ? 0 : 1;
        return adjacency(coins);
    }
    
    private static int adjacency(int[] A) {
        int adj = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] == A[i]) {
                adj++;
            }
        }
        return adj;
    }
}
