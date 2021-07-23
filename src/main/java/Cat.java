import javafx.scene.SceneAntialiasing;

import java.util.Scanner;

public class Cat {
    private String name;
    private int Age;
    private int year;

    public Cat(String name){
        this.name = name;
    }


    public Cat(){
        this.name = "cat";
    }

    public static void main(String[] args) {
        Cat myCat = new Cat("Barsik");
        System.out.println(myCat.name);

        myCat.setName("fedya");
        String name = myCat.getName();
        System.out.println(name);

        myCat.consoleAgeInput();
        myCat.consoleDataOutput();
        myCat.consoleYearInput();

    }


    public String getName(){
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void consoleNamePrint(){
        System.out.println(this.name);
    }

    public void consoleNameInput(){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        this.name = str;
        this.consoleNamePrint();
    }

    public void consoleAgeOutPut(){
        System.out.println(this.name);
    }

    public void consoleAgeInput(){
        Scanner in = new Scanner(System.in);
        Integer  age = in.nextInt();
        this.Age = age;
        this.consoleAgeOutPut();
    }

    public void consoleDataOutput(){
        System.out.println(this.Age + this.name);
    }
    public void consoleYearOutPut(){
        System.out.println(this.year);
    }
    public void consoleYearInput(){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        try {
            this.year = Integer.parse.Int(str);
        }catch (NumberFormatException e){
            System.out.println(("Ожидалось число, а введена строка."));
        }
        this.year = Integer.parseInt(str);
    }
    public  void consoleStatInput(){
        System.out.println(this.year);
    }
    public  void consoleStatOutput(){
        String state = "";
        switch(this.age){
            case 1: state = "ребенок"; break;
            case 2: state = "Молодой"; break;
            case 3: state = "пожилой"; break;
            case 4: state = "В самом рассвете сил"; break;
        }
        if(this.age < 1) {
            state = "Ребенок";
        }
        else if(this.age < 5){
            state = "Молодой";
        }
        else if(this.age <  13){
            state = "Пожилой";
        }
        else {
            state = "Живее всех живых";
        }
        System.out.println("Наш кот:"+ state);
        this.consoleStatInput();
    }
    public  void consoleIsKnowInput(){
        System.out.println(this.year);
    }
    public  void calculateOutPut(){
        String com = "";
        switch(str){
            case "сидеть": state = "ребенок"; break;
            case "тапки": state = "Молодой"; break;
            case "": state = "пожилой"; break;
            case 4: state = "В самом рассвете сил"; break;
        }
        if(this.age < 1) {
            state = "Ребенок";
        }
        else if(this.age < 5){
            state = "Молодой";
        }
        else if(this.age <  13){
            state = "Пожилой";
        }
        else {
            state = "Живее всех живых";
        }
        System.out.println("Наш кот:"+ state);
        this.consoleStatInput();
    }
}
