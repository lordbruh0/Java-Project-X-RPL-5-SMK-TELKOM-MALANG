
package latihan1;
//player
class Player{
    String name;
    double health;
    int level;
    //object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void attack(Player apponent){
        
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name = "attacking " + apponent.name + " with power " + attackPower);
        apponent.defence(attackPower);
    }

    void defence(double attackPower){
        System.out.println(this.name + " gets damage " + attackPower);
    
        //damage
        double damage;
        if (this.armor.defencesPower < attackPower) {
            
        }
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor =armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

//semjata
class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("weapon : " + this.name + " , attack: " + this.attackPower);
    }
}


//armor
class Armor{
    double defencesPower;
    String name;
    Armor(String name, double defencesPower){
        this.defencesPower = defencesPower;
        this.name = name;
    }

     void display(){
        System.out.println("Armor : " + this.name + " , defence: " + this.defencesPower);
    }
}







public class Latihan {

    public static void main(String[] args) {
        //membuat object player
        Player  player1= new Player("ucup", 100);
        Player  player2= new Player("otong", 50);


        //membuat object weapon 
        Weapon pedang = new Weapon("Pedang", 15);
        Weapon ketapel = new Weapon("ketape;", 1);

        //membuat object armor
        Armor bajubesi = new Armor("baju besi", 10);
        Armor kaos = new Armor("kaos", 0);

        //player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajubesi);
        player1.display();
       
        //player 2
        player2.equipWeapon(ketapel);
        player2.equipArmor(kaos);
        player2.display();
    
        System.out.println("\n PERTEMPURAN");
        player1.attack(player2);
    
    
    
    
    }



}
