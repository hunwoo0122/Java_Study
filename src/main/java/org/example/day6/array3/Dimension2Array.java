package org.example.day6.array3;

public class Dimension2Array {
    public static void main(String[] args) {
        //가로(행, row), 세로(열, column)
        // 가로의 개수: 2
        // {
        // 0   1   2
        // 0: {0, 0, 0}, //한 행의 세로의 개수: 3
        // 1: {0, 0, 0} //3
        // }
        // 개수(length, 길이, 사이즈) ==> 인덱스는 0부터 시작
        int[][] seat = new int[2][3]; // 행, 열의 개수
        seat[0][0] = 100;
        seat[0][1] = 200;
        seat[0][2] = 300;
        seat[1][0] = 400;
        seat[1][1] = 500;
        System.out.println(seat[1][0]);
        System.out.println(seat.length);
        //2차원배열에서 배열명.length ==> 행의 개수
        System.out.println(seat[0].length); // 0행의 열 개수
        System.out.println(seat[1].length); // 1행의 열 개수
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) { // 범위를 정할때 고정된 상수는
                //잘 안쓰인다. 추후 유지보수를 위해
                System.out.print(seat[i][j] + " ");
                //i=0, j=0,1,2
                //[0][0]
                //[0][1]
                //[0][2]
                //i=1, j=0,1,2
                //[1][0]
                //[1][1]
                //[1][2]
            } //한 행의 끝
            System.out.println();
        }
    }
}
