class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map1= new HashMap<>(); 
        HashMap<Character, Integer> map= new HashMap<>(); 

        for(char c:s1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        int size =s1.length();
        boolean ans = false;
        for( int i = 0 ; i < size-1; i++){
            char ch =s2.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);       
        }
        int y=0;
        for( int x = size-1 ; x < s2.length(); x++){
            map.put(s2.charAt(x),map.getOrDefault(s2.charAt(x),0)+1);
            if(map.size()== map1.size()){
                boolean same = true;
                for(Character key : map.keySet()){
                    if(map1.containsKey(key)){
                        if(map1.get(key)!=map.get(key)) {
                            same = false;
                            break;
                        } 
                       
                    }
                    else{
                        same = false;
                        break;
                    }
                }
                if(same) return true;
            }
            map.put(s2.charAt(y),map.get(s2.charAt(y))-1);
            if(map.get(s2.charAt(y))==0)map.remove(s2.charAt(y));
            y++;
             
        
        }
        return false;
    }
}
