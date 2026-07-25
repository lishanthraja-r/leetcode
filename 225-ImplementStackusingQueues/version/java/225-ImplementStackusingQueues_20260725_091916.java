// Last updated: 7/25/2026, 9:19:16 AM
1class MyStack {
2    Queue<Integer> primary = new LinkedList<>();
3    Queue<Integer> secondary = new LinkedList<>();
4
5    public MyStack() {
6        
7    }
8    
9    public void push(int x) {
10        primary.add(x);
11    }
12    
13    public int pop() {
14        if(!empty()){
15            while(primary.size() != 1){
16                secondary.add(primary.remove());
17            }
18            int removed = primary.remove();
19            while(secondary.size() != 0){
20                primary.add(secondary.remove());
21            }
22            return removed;
23        }
24        return 0;
25    }
26    
27    public int top() {
28        if(!empty()){
29            while(primary.size() != 1){
30                secondary.add(primary.remove());
31            }
32            int peek = primary.peek();
33            secondary.add(primary.remove());
34            while(secondary.size() != 0){
35                primary.add(secondary.remove());
36            }
37            return peek;
38        }
39        return 0;
40    }
41    
42    public boolean empty() {
43        return primary.isEmpty();
44    }
45}