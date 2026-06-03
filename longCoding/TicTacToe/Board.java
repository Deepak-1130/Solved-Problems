public  class Board{
 char[][]  board= new char[3][3];
Player p1;
Player p2;


public Board(){
 for(int i =0;i<3;i++){
    for(int j =0;j<3;j++){
        board[i][j]='-';
    }
 }
}
}