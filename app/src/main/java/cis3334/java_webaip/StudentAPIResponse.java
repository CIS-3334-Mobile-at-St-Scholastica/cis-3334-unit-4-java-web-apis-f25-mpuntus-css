package cis3334.java_webaip;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentAPIResponse {
    public List<StudentAPI.Network> networks;


    /**
     * Count the number of networks per country.
     * @return Map of country code -> count
     */
    public Map<String, Integer> countNetworksByCountry() {
        Map<String, Integer> map = new HashMap<>();
        if (networks != null) {
            for (StudentAPI.Network net : networks) {
                if (net.location != null && net.location.country != null) {
                    map.put(net.location.country,
                            map.getOrDefault(net.location.country, 0) + 1);
                }
            }
        }
        return map;
    }
}