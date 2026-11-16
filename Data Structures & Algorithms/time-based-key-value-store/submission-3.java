class TimeMap {
    public String key;
    public String value;
    public int timestamp;
    List<TimeMap> list= new ArrayList<>();
    
    public TimeMap() {
        
    }
      public TimeMap(String key, String value, int timestamp) {
         this.key=key;
        this.value=value;
        this.timestamp=timestamp;
    }
    
    public void set(String key, String value, int timestamp) {
        
        TimeMap temp = new TimeMap(key,value,timestamp);
        list.add(temp);
    }
    
    public String get(String key, int timestamp) {
        // System.out.println(list);
            StringBuilder ans=new StringBuilder();

        for(int i=0 ; i < list.size() ; i++){
            if(list.get(i).key.equals(key)) {
               if( list.get(i).timestamp==timestamp ) 
                    return list.get(i).value;
                else if(list.get(i).timestamp<timestamp) {
                    ans.setLength(0);
                    ans.append(list.get(i).value);
                    }
                   
                }

        }
        return ans.toString();
        
    }
}
