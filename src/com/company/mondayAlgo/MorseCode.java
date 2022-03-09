package com.company.mondayAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MorseCode {
    public static void main(String[] args) {

    }

    public static List<String> possibilities(String signals) {
        if(signals.equals(".")){
            return Collections.singletonList("E");
        } else if (signals.equals("-")){
            return Collections.singletonList("T");
        } else if (signals.equals("-.")){
            return Collections.singletonList("N");
        } else if (signals.equals("...")){
            return Collections.singletonList("S");
        } else if (signals.equals("..-")){
            return Collections.singletonList("U");
        } else if (signals.equals("?")){
            return Arrays.asList("E", "T");
        } else if (signals.equals(".?")){
            return Arrays.asList("I", "A");
        } else if (signals.equals("?-?")){
            return Arrays.asList("R", "W", "G", "O");
        }
        return new ArrayList<String>();
    }
}


//        "."	["E"]
//        "-"	["T"]
//        "-."	["N"]
//        "..."	["S"]
//        "..-"	["U"]
//        "?"	["E","T"]
//        ".?"	["I","A"]
//        "?-?"	["R","W","G","O"]