
import java.util.*;

public class MaxExpertiseTeam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of employees and number of conflicts
        int n = sc.nextInt(); // number of employees
        int c = sc.nextInt(); // number of conflicting pairs

        // Create the graph adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Read conflicts and populate the graph
        for (int i = 0; i < c; i++) {
            int u = sc.nextInt() - 1; // employee 1 in the conflict
            int v = sc.nextInt() - 1; // employee 2 in the conflict
            graph.get(u).add(v);      // add edge u -> v
            graph.get(v).add(u);      // add edge v -> u (because it's undirected)
        }

        // Read expertise levels of employees
        int[] expertise = new int[n];
        for (int i = 0; i < n; i++) {
            expertise[i] = sc.nextInt();
        }

        // To track visited nodes
        boolean[] visited = new boolean[n];

        // To store the maximum possible expertise
        int maxExpertise = 0;

        // Perform DFS on all unvisited nodes (finding all connected components)
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                // If the employee is not visited, find the total expertise of its component
                int totalExpertise = dfs(i, graph, visited, expertise);
                // Update the maxExpertise with the expertise of this connected component
                maxExpertise = Math.max(maxExpertise, totalExpertise);
            }
        }

        // Output the result
        System.out.println(maxExpertise);

        sc.close();
    }

    // DFS function to calculate the total expertise of the connected component
    public static int dfs(int node, List<List<Integer>> graph, boolean[] visited, int[] expertise) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);          // start DFS with the current node
        visited[node] = true;      // mark it as visited

        int totalExpertise = 0;    // to store the total expertise of the component

        // Perform DFS to visit all nodes in the connected component
        while (!stack.isEmpty()) {
            int current = stack.pop();
            totalExpertise += expertise[current];  // add expertise of the current employee

            // Visit all unvisited neighbors
            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;  // mark as visited
                    stack.push(neighbor);      // add neighbor to the stack
                }
            }
        }

        return totalExpertise;  // return total expertise of this component
    }
}
