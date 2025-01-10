public class Main{

        private static void printMap(Tile[][] map){
            for(int i = 0; i < map.length;i++){
                System.out.print("[ ");
                for(int j = 0; j < map[i].length; j++){
                    System.out.print(" " + map[i][j].symbol + ",");
                }
                System.out.print("]\n");
            }
        }

        private static void fill(Tile[][] map){
            for(int i=0; i<map.length;i++){
                for(int j=0;j<map[i].length;j++){
                    map[i][j] = new Tile("Empty",'_');
                }
            }
        }

    public static void main(String[] args){

        Tile[][] map = new Tile[10][10];
        fill(map);

        Tile enemy = new Tile("Enemy",'x');
        Tile base = new Tile("Base",'B');
        Tile enemyBase = new Tile("EnemyBase",'X');
        Tile road = new Tile("Road",'→');

        map[5][0] = enemyBase;
        map[5][9] = base;
        map[5][1] = road;//road symbols (←↑→↓)

        printMap(map);

    }
}
