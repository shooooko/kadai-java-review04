package animal;

public class Animal {
    //フィールド
    private String name;
    private int age;

    //コンストラクタ
    public Animal() {
        name = "未設定";
        age = 0;
    }
    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //sayメソッド
    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }
}
