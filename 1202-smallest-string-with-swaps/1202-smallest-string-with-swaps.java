class Solution {
    
    int[] group;
    
    void union(int a, int b) {
        group[find(a)] = group[find(b)]; //0(N)
    }
    
    int find(int a) {
        if(group[a] !=a) {
            group[a] = find(group[a]);   //0(1)
        }
        return group[a];
    }
    
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        group = new int[s.length()];
        for(int i = 0; i< group.length; i++) {
            group[i] = i;
        }
        for(List<Integer> pair : pairs) {
            union(pair.get(0), pair.get(1));  //Merging group
        }
        Map<Integer, Queue<Character>> groupChar = new HashMap<>(); // Make a priority queue
        for(int i = 0; i< s.length(); i++) {
            groupChar.putIfAbsent(find(i), new PriorityQueue<>());
            groupChar.get(find(i)).add(s.charAt(i));
        }
        StringBuilder output = new StringBuilder();  // getting a lexigraphical orer
        for(int i= 0; i< s.length(); i++) {
            output.append(groupChar.get(find(i)).poll());  // finding smallest character
        }
        return output.toString();
    }
}