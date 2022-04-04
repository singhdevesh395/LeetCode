class Node{
    int val;
    String str;
    Node(int c,String s){
        val=c;
        str=s;
    }
}

class Solution {
    public String intToRoman(int num) {
        String res = "";
        if(num==0) return res;
        Node[] arr = new Node[13];
        createMap(arr);
        int index=12;
        while(num>0 && index>=0){
            if(num>=arr[index].val){
                res += arr[index].str;
                num -= arr[index].val;
            }else{
                index--;
            }
        }
        return res;
    }
    
    private void createMap(Node[] map){
        map[0] = new Node(1,"I");
        map[1] = new Node(4,"IV");
        map[2] = new Node(5,"V");
        map[3] = new Node(9,"IX");
        map[4] = new Node(10,"X");
        map[5] = new Node(40,"XL");
        map[6] = new Node(50,"L");
        map[7] = new Node(90,"XC");
        map[8] = new Node(100,"C");
        map[9] = new Node(400,"CD");
        map[10] = new Node(500,"D");
        map[11] = new Node(900,"CM");
        map[12] = new Node(1000,"M");
    }
}