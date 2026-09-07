import java.util.*;

class UndergroundSystem {

    // Customer ID -> Check-in information
    HashMap<Integer, CheckIn> checkIns;

    // Route -> [total time, number of trips]
    HashMap<String, int[]> travelData;

    public UndergroundSystem() {
        checkIns = new HashMap<>();
        travelData = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {

        CheckIn checkIn = checkIns.get(id);

        String route = checkIn.station + "->" + stationName;
        int travelTime = t - checkIn.time;

        if (!travelData.containsKey(route)) {
            travelData.put(route, new int[]{0, 0});
        }

        int[] data = travelData.get(route);
        data[0] += travelTime;  // total time
        data[1]++;              // number of trips

        checkIns.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {

        String route = startStation + "->" + endStation;

        int[] data = travelData.get(route);

        return (double) data[0] / data[1];
    }

    // Stores check-in station and time
    class CheckIn {
        String station;
        int time;

        CheckIn(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }
}
output
  ["UndergroundSystem", "checkIn", "checkIn", "checkOut", "checkOut", "getAverageTime", "checkIn", "checkOut", "getAverageTime"]

[[], [45, "Leyton", 3], [32, "Paradise", 8], [45, "Waterloo", 15], [32, "Cambridge", 22], ["Paradise", "Cambridge"], [10, "Leyton", 24], [10, "Waterloo", 38], ["Leyton", "Waterloo"]]
  
