package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion() {
	}
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}

	public int getArmor() {
		return armor;
	}
	
	public void champion(String name, int life, int damage, int armor) {
		
	}
	
	public void takeDamage(Champion other) {
		int difference  = armor - other.attack;
		if(difference < 1) {
			difference = 1;
		}
		life -= difference;
		if(life < 0) {
			life = 0;
		}
	}
	
	public String status() {
		String text;
		if(life == 0) {
			text = name + ": " + life + " de vida (morreu)";
		}
		else {
			text = name + ": " + life + " de vida";
		}
		return text;
	}
	
}
