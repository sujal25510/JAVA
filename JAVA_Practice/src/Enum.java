enum Levels{
    EASY,
    MEDIUM,
    HARD
}

class SetDifficulty{
    Levels level;
    public SetDifficulty(Levels level){
        this.level=level;
    }
    public void SetDiff(){
        switch(level){
            case EASY:
                System.out.println("Easy mode");
                break;
            case MEDIUM:
                System.out.println("Medium mode");
                break;
            case HARD:
                System.out.println("Hard mode");
                break;
            default:
                System.out.println("No Difficulty");
                break;
        }
    }
}
public class Enum {
    public static void main(String args[]){
//        for(Days i : Days.values()){
//            System.out.println(i);
//        }
        SetDifficulty sd1 = new SetDifficulty(Levels.MEDIUM);
        sd1.SetDiff();

    }
}
