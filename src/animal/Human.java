package animal;

public class Human extends Animal implements Thinkable{
    //フィールド
    private String hobby;

    //コンストラクタ
    public Human() {
    }
    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    //thinkメソッド
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }

}
