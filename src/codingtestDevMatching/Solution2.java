package codingtestDevMatching;

public class Solution2 {
    public static void main(String[] args) {
        int[][] office = {{5,-1,4},{6,3,-1},{2,-1,1}};
        int r = 1;
        int c = 0;
        String[] move = {"go","go","right","go","right","go","left","go"};

    }
    public int solution(int[][] office, int r, int c, String[] move) {
        int answer = 0;
        String[] direction = {"N", "E", "S", "W"};
        int directionIndex = 0;
        answer += office[r][c];
        office[r][c] = 0;
        for(int i=0; i < move.length; i++){
            String way = move[i];
            directionIndex = changeDirection(direction, directionIndex, way);
            if(!way.equals("go"))
                continue;
            int[] moves = ways(direction, directionIndex, r, c);

            if(moves[0] >= office.length || moves[0] < 0 || moves[1] >= office.length || moves[1] < 0){
                continue;
            }
            if(office[moves[0]][moves[1]] == -1)
                continue;
            r = moves[0];
            c = moves[1];
            answer += office[r][c];
            office[r][c] = 0;
        }

        return answer;
    }

    private int changeDirection(String[] direction, int directionIndex, String way){
        int index = 0;
        if("right".equals(way)){
            index = directionIndex + 1;
            if(index == direction.length)
                index = 0;
            return index;
        }else if("left".equals(way)){
            index = directionIndex - 1;
            if(index < 0)
                index = direction.length - 1;
            return index;
        }
        return directionIndex;
    }

    private int[] ways(String[] direction, int directionIndex, int r, int c){
        // index 0 : x좌표 , index 1 : y좌표
        String way = direction[directionIndex];
        int[] moves = new int[2];
        if("N".equals(way)){
            moves[0] = r - 1;
            moves[1] = c;
        }else if("E".equals(way)){
            moves[0] = r;
            moves[1] = c+1;
        }else if("S".equals(way)){
            moves[0] = r + 1;
            moves[1] = c;
        }else{ // W
            moves[0] = r;
            moves[1] = c - 1;
        }
        return moves;
    }
}

/*
office	r	c	move	result
[[5,-1,4],[6,3,-1],[2,-1,1]]	1	0	[go,go,right,go,right,go,left,go]	14
 */
