class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        UF uf = new UF();
        int i = 0;
        for (List<String> ed : equations) {
            uf.union(ed.get(0), ed.get(1), values[i]);
            i++;
        }
        
        double[] result = new double[queries.size()];
        i = 0;
        for (List<String> q : queries) {
            result[i ++] = uf.get(q.get(0), q.get(1));
        }
        
        return result;
    }
    
    private class UF {
        Map<String, String> father = new HashMap<>();
        Map<String, Integer> rank = new HashMap<>();
        
        // value of father[x]/x
        public Map<String, Double> value = new HashMap<>();

        public double get(String x, String y) {
            if (!father.containsKey(x) || !father.containsKey(y)) {
                return -1.0;
            } 
            
            if (!find(x).equals(find(y))) {
                return -1.0;
            }
            
            // rx = find(x)
            // ry = find(y)
            // x/y = 1/(rx/x) * (ry/y) = (ry/y) / (rx/x) = value[y] / value[x]
            // System.out.println("value " + x + ": " + get(x));
            // System.out.println("value " + y + ": " + get(y));
            return get(y) / get(x);
        }
        
        private double get(String x) {
            double res = 1.0;
            while (!x.equals(father.get(x))) {
                res *= value.getOrDefault(x, 1.0);
                x = father.get(x);
            }
            return res;
        }
        
        public String find(String x) {
            father.computeIfAbsent(x, ingored -> x);
            if (father.get(x).equals(x)) {
                return x;
            }
            
            return find(father.get(x));
        }
        
        public void union(String x, String y, double xy) {
            String rx = find(x);
            String ry = find(y);
            
            if (rx != ry) {
                int rankX = rank.getOrDefault(rx, 1);
                int rankY = rank.getOrDefault(ry, 1);
                double valueX = get(x);
                double valueY = get(y);
                if (rankX >= rankY) {
                    rank.put(rx, rankX + rankY);    
                    // rx / ry = (rx/x) * (x/y) * (y/ry)  = (rx/x) * (x/y) / (ry/x)
                    double ryValue = valueX * xy / valueY ;
                    father.put(ry, rx);
                    value.put(ry, ryValue);
                } else {
                    rank.put(ry, rankX + rankY);    
                    // ry / rx = (ry/y) * (y/x) *  (x/rx) = (ry/y) / (x/y) /  (rx/x)
                    double rxValue =  valueY / xy / valueX;
                    father.put(rx, ry);
                    value.put(rx, rxValue);
                }
            }
        }
        
    }
}