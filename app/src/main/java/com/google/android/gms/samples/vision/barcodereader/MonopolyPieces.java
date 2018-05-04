package com.google.android.gms.samples.vision.barcodereader;

import android.support.v4.util.Preconditions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonopolyPieces {

    static Map<Integer,String> rarePieces = new HashMap<>();
    static {
        rarePieces.put(108, "Million dollars");
        rarePieces.put(110, "Vacation 1/2");
        rarePieces.put(116, "Vacation 2/2");
        rarePieces.put(181, "$100k 1/2");
        rarePieces.put(182, "$100k 2/2");
        rarePieces.put(189, "40k car 1/2");
        rarePieces.put(190, "40k car 2/2");
        rarePieces.put(193, "25k kitchen 1/2");
        rarePieces.put(194, "25k kitchen 2/2");
        rarePieces.put(199, "20k college 1/2");
        rarePieces.put(200, "20k college 2/2");
        rarePieces.put(203, "$10k 1/2");
        rarePieces.put(206, "$10k 2/2");
        rarePieces.put(207, "$7500 1/2");
        rarePieces.put(209, "$7500 2/2");

        rarePieces.put(179, "$5000");
        rarePieces.put(173, "$5000 grocery");
        rarePieces.put(172, "$2600 movies");

        rarePieces.put(166, "$1500 gas/g/g");
        rarePieces.put(164, "$1000");
        rarePieces.put(159, "$1000 grocery");
        rarePieces.put(154, "$1000 weekend");

        rarePieces.put(149, "$1000 laptop");
        rarePieces.put(145, "$500 grocery");
        rarePieces.put(144, "$300 day spa");
        rarePieces.put(138, "$200 fam pic");
        rarePieces.put(135, "$200");
        rarePieces.put(132, "$100 grocery");
        rarePieces.put(126, "$100");
        rarePieces.put(121, "$50 grocery");
        rarePieces.put(119, "$25 grocery");
        rarePieces.put(213, "$25 gc");
        rarePieces.put(218, "$25");
        rarePieces.put(220, "$20");
        rarePieces.put(227, "$15 grocery");
        rarePieces.put(228, "$10 grocery");
        rarePieces.put(235, "$10");
        rarePieces.put(237, "$5 grocery");
        rarePieces.put(242, "$5");
    }

    /**
     * Given a string of length multiple of 3, parse integers and return the rare pieces
     * that exist.
     *
     * @param packedPieceString
     * @return
     */
    public static List<String> findRarePieces(String packedPieceString) {
        List<String> finds = new ArrayList<>(1);

        for (int i = 0; i < packedPieceString.length() / 3; i++) {
            String p = packedPieceString.substring(i * 3, (i*3)+3);

            if (rarePieces.containsKey(Integer.parseInt(p))) {
                finds.add(rarePieces.get(Integer.parseInt(p)));
            }
        }

        return finds;
    }
}
