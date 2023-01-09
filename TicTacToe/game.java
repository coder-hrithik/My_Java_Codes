// package TicTacToe;

// import java.util.Arrays;
// import java.util.List;
// import java.util.Random;
// import java.util.Scanner;
// import java.util.ArrayList;

// public class game {
//     static ArrayList<Integer> playerPosition = new ArrayList<Integer>();
//     static ArrayList<Integer> cpuPosition = new ArrayList<Integer>();

//     public static void main(String[] args) {
//         System.out.println("<<< Welcome to TicTacToe game! >>>");
//         char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' },
//                 { '-', '+', '-', '+', '-' },
//                 { ' ', '|', ' ', '|', ' ' },
//                 { '-', '+', '-', '+', '-' },
//                 { ' ', '|', ' ', '|', ' ' } };

//         printGameBoard(gameBoard);
//         while (true) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter you position (1-9)");
//             int playerPos = sc.nextInt();
//             while (playerPosition.contains(playerPos) || cpuPosition.contains(playerPosition)) {
//                 playerPos = sc.nextInt();
//             }

//             placePiece(gameBoard, playerPos, "player");
//             String result = checkWinner();
//             if (result.length() > 0) {
//                 System.out.println(result);
//             }

//             Random r = new Random(); // Generate random position
//             int cpuPos = r.nextInt(9) + 1;
//             while (playerPosition.contains(cpuPos) || cpuPosition.contains(cpuPos)) {
//                 cpuPos = r.nextInt(9) + 1;
//             }
//             placePiece(gameBoard, cpuPos, "cpu");

//             printGameBoard(gameBoard);
//             result = checkWinner();
//             if (result.length() > 0) {
//                 System.out.println(result);
//             }
//         }
//     }

//     public static void printGameBoard(char[][] gameBoard) {
//         for (char[] row : gameBoard) {
//             for (char c : row) {
//                 System.out.print(c);
//             }
//             System.out.println();
//         }
//     }

//     public static void placePiece(char[][] gameBoard, int pos, String user) {
//         char symbol = ' ';
//         if (user.equals("player")) {
//             symbol = 'X';
//             playerPosition.add(pos);
//         } else if (user.equals("cpu")) {
//             symbol = 'O';
//             cpuPosition.add(pos);
//         }

//         switch (pos) {
//             case 1:
//                 gameBoard[0][0] = symbol;
//                 break;
//             case 2:
//                 gameBoard[0][2] = symbol;
//                 break;
//             case 3:
//                 gameBoard[0][4] = symbol;
//                 break;
//             case 4:
//                 gameBoard[2][0] = symbol;
//                 break;
//             case 5:
//                 gameBoard[2][2] = symbol;
//                 break;
//             case 6:
//                 gameBoard[2][4] = symbol;
//                 break;
//             case 7:
//                 gameBoard[4][0] = symbol;
//                 break;
//             case 8:
//                 gameBoard[4][2] = symbol;
//                 break;
//             case 9:
//                 gameBoard[4][4] = symbol;
//                 break;

//             default:
//                 break;
//         }
//     }

//     public static String checkWinner() {
//         List topRow = Arrays.asList(1, 2, 3);
//         List midRow = Arrays.asList(4, 5, 6);
//         List botRow = Arrays.asList(7, 8, 9);
//         List leftcol = Arrays.asList(1, 4, 7);
//         List midcol = Arrays.asList(2, 5, 8);
//         List rightcol = Arrays.asList(3, 6, 9);
//         List cross1 = Arrays.asList(1, 5, 9);
//         List cross2 = Arrays.asList(3, 5, 7);

//         List<List> winning = new ArrayList<List>();
//         winning.add(topRow);
//         winning.add(midRow);
//         winning.add(botRow);
//         winning.add(leftcol);
//         winning.add(midcol);
//         winning.add(rightcol);
//         winning.add(cross1);
//         winning.add(cross2);

//         for (List l : winning) {
//             if (playerPosition.containsAll(l)) {
//                 return "Congratulaions you won !!";
//             } else if (cpuPosition.containsAll(l)) {
//                 return "You lost :(";
//             }
//         }
//         if (playerPosition.size() + cpuPosition.size() == 9) {
//             return "CAT!";
//         }
//         return " ";

//     }
// }
