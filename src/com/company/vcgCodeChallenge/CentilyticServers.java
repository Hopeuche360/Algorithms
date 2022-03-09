package com.company.vcgCodeChallenge;

public class CentilyticServers {
    public static void main(String[] args) {
        int[][] myArray = {{1, 0, 0}, {0, 0, 0}, {0, 0, 1}};

    }
    public static int updateServer(int[][] array) {
        int sizeOfRows = array[0].length;
        int sizeOfColumns = array.length;
        int numberOfDays = 0;

        for (int i = 0; i < sizeOfColumns; i++) {
            for (int j = 0; j < sizeOfRows; j++) {
                if (array[i][j] == 1){
                    array[i][j+1] = 1;
                }
            }
        }
        return 0;
    }
}
