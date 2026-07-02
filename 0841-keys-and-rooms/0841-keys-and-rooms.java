class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        int noOfRooms = rooms.size();
        int roomsVisited = dfs(0,vis,rooms);
        return roomsVisited==noOfRooms;
    }
    static int dfs(int room,boolean[] vis,List<List<Integer>> rooms){
        vis[room] =true;
        int count =1;;
        for(int key:rooms.get(room)){
            if(!vis[key]){
                count+=dfs(key,vis,rooms);
            }
        }
        return count;
    }

}