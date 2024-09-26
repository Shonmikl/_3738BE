package aleksey_babaykin.hw_20230124;

public class Task2FindIsnland {
    private int [][]  arrayOcean;
    private long maxIsland;
    private static final long minPoints = Long.MIN_VALUE >> 3;

    public static void main(String[] args) {
        Task2FindIsnland task = new Task2FindIsnland();
        task.initOcean();
        task.findTheBiggestIslandInOcean();
        System.out.printf( (task.maxIsland <=0 ? "Island = 0 (%d)" : "Max island = %d") , task.maxIsland);
    }
    public void initOcean(){
        // there are 78 number of 1s
        arrayOcean = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
    }

    public void findTheBiggestIslandInOcean(){
        long tempMax;
        this.maxIsland = -1;
        for(int i = 1; i < arrayOcean.length - 1;i++) {
            for (int j = 1; j < arrayOcean[i].length - 1; j++) {
                tempMax = calculateItems(i,j);
                if (tempMax > 0 && (maxIsland == -1 || maxIsland > tempMax)){
                    maxIsland = tempMax;
                }
            }
        }
    }
    private long calculateItems(int x, int y){
        if( arrayOcean[x][y] == 1 && (x == 0 || y == 0 || x == (arrayOcean.length) -1 || y == (arrayOcean[x].length) - 1)){
            arrayOcean[x][y] = 0;
            return minPoints;
        }
        if( arrayOcean[x][y] == 1){
            arrayOcean[x][y] = 0;
            long tmpAmount;
            tmpAmount =  1 + calculateItems(x-1,y)
                    + calculateItems(x,y-1)
                    + calculateItems(x+1,y)
                    + calculateItems(x,y+1);
            if(tmpAmount < 0){
                return minPoints;
            }
            return tmpAmount;
        }
        return 0;
    }
}