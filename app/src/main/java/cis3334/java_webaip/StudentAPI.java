package cis3334.java_webaip;

import java.util.ArrayList;
import java.util.List;

public class StudentAPI {
        public static class Location {
            public double latitude;
            public double longitude;
            public String city;
            public String country;
        }

        public static class Network {
            public String id;
            public String name;
            public Location location;
            public String href;
            public List<String> company;
            public String gbfs_href;
        }
    }

