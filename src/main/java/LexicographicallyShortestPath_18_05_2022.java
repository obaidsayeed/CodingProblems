////Given an unordered list of flights taken by someone, each represented as (origin, destination) pairs, and a starting airport, compute the person's itinerary. If no such itinerary exists, return null. If there are multiple possible itineraries, return the lexicographically smallest one. All flights must be used in the itinerary.
////
////For example, given the list of flights [('SFO', 'HKO'), ('YYZ', 'SFO'), ('YUL', 'YYZ'), ('HKO', 'ORD')] and starting airport 'YUL', you should return the list ['YUL', 'YYZ', 'SFO', 'HKO', 'ORD'].
////
////Given the list of flights [('SFO', 'COM'), ('COM', 'YYZ')] and starting airport 'COM', you should return null.
////
////Given the list of flights [('A', 'B'), ('A', 'C'), ('B', 'C'), ('C', 'A')] and starting airport 'A', you should return the list ['A', 'B', 'C', 'A', 'C'] even though ['A', 'C', 'A', 'B', 'C'] is also a valid itinerary. However, the first one is lexicographically smaller.
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class LexicographicallyShortestPath_18_05_2022 {
//    public static ArrayList<String> solution(String[][] arr,String start){
//        HashMap<String,String> hm = new HashMap<>();
//        ArrayList<String> al = new ArrayList<>();
//        for(int i = 0;i < arr.length;i++){
//            if(hm.containsKey(arr[i][0])){
//                if(hm.get(arr[i][0]).compareTo(arr[i][1]) > 0){
//                    hm.put(arr[i][0],arr[i][1]);
//                }
//            }
//            else{
//                hm.put(arr[i][0],arr[i][1]);
//            }
//
//        }
//
//        String to = hm.get(start);
//        while(to != null){
//            al.add(start);
//            start = to;
//            to = hm.get(to);
//        }
//        return al;
//    }
//}
