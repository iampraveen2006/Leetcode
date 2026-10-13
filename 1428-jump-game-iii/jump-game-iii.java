import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            if (arr[curr] == 0) {
                return true;
            }
            
            int next1 = curr + arr[curr];
            int next2 = curr - arr[curr];
            
            if (next1 < n && !visited[next1]) {
                visited[next1] = true;
                queue.offer(next1);
            }
            if (next2 >= 0 && !visited[next2]) {
                visited[next2] = true;
                queue.offer(next2);
            }
        }
        
        return false;
    }
}