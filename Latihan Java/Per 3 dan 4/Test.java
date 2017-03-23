public class Test {
	public static void main(String[] args){
		/*GamePlayer Hero1 = new GamePlayer(120,120);
		Hero1.setPosition(12,3);
		System.out.println("Sebelum lari "+Hero1.getX());
		Hero1.Run(12);
		System.out.println("Setelahnya lari "+Hero1.getX());
		
		GamePlayer Hero2 = new GamePlayer();
		Hero2.setDimension(120,120);
		System.out.println("panjang hero 2 ="+Hero2.getWidth());*/
		
		GamePlayer hero = new GamePlayer();
		hero.setDimension(12,12);
		hero.setPosition(10,220);
		System.out.println("Posisi Player: "+hero.getX()+","+hero.getY());
		hero.Run(12);
		System.out.println("Posisi Player: "+hero.getX()+","+hero.getY());
		
		GamePlayer hero2 = new GamePlayer();
		hero2.setDimension(12,32);
		hero2.setPosition(10,10);
		
		GameEnemy monster = new GameEnemy();
		monster.setDimension(12,32);
		monster.setPosition(10,10);
		
		GameEnvironment scene = new GameEnvironment();
		scene.addPlayer(hero);
		scene.addPlayer(hero);
		scene.addPlayer(hero2);
		scene.getAllPlayers();
		scene.removePlayer(hero);
		scene.getAllPlayers();
		scene.addEnemy(monster);
		scene.Interaction();
	}
}
