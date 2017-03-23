import java.util.ArrayList;
import java.lang.Math.*;

public class GameEnvironment{
	private double width;
	private double height;
	private ArrayList<GamePlayer> arrPlayer;
	private ArrayList<GameEnemy> arrEnemy;
	
	GameEnvironment(){
		arrPlayer = new ArrayList<GamePlayer>();
		arrEnemy = new ArrayList<GameEnemy>();
	}
	GameEnvironment(double width, double height){
		this.width = width;
		this.height = height;
	}
	public void addPlayer(GamePlayer player){
		arrPlayer.add(player);
	}
	public void removePlayer(GamePlayer player){
		arrPlayer.remove(player);
	}
	public void getAllPlayers(){
		System.out.println("All of Player :"+arrPlayer);
	}
	public void addEnemy(GameEnemy enemy){
		arrEnemy.add(enemy);
	}
	public void removeEnemy(GameEnemy enemy){
		arrEnemy.remove(enemy);
	}
	public void getAllEnemies(){
		System.out.println("All of Enemy :"+arrEnemy);
	}
	public void Interaction(){
		if (arrPlayer==null||arrEnemy==null){
			System.out.println("Player or Enemy not set");
		}
		for(int i=0; i<arrPlayer.size(); i++){
			for(int j=0; j<arrEnemy.size();j++){
				if(arrPlayer.get(i).getY()!=arrEnemy.get(j).getY()){
					System.out.println("Player: "+arrPlayer.get(i)+" and Enemy: "+arrEnemy.get(j)+"not in same Y position");
				}
				if(EuclideanDistance(arrPlayer.get(i).getX(),arrPlayer.get(i).getY(),arrEnemy.get(j).getX(),arrEnemy.get(j).getY())<2){
					System.out.println("Player: "+arrPlayer.get(i)+" Attacked");
					System.out.println("Enemy: "+arrEnemy.get(j)+" loses");
					removeEnemy(arrEnemy.get(j));
				}
				else{
					System.out.println("==> Player "+arrPlayer.get(i));
					arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
					System.out.println("Current x position = 	"+arrPlayer.get(i).getX()+" <==");
				}
			}
		}
	}
	public static int EuclideanDistance(int x1, int y1, int x2, int y2){
		return (int)Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
	}
	
}