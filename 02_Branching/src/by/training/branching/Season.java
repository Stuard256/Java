package by.training.branching;

public class Season {
    private enum Seasons{spring,summer,autumn,winter, undefined}
    private Seasons season;
    private byte month;
    public Season(byte month){
        switch(month){
            case 12:
            case 1:
            case 2:
                this.season = Seasons.winter;
                break;
            case 3:
            case 4:
            case 5:
                this.season = Seasons.spring;
                break;
            case 6:
            case 7:
            case 8:
                this.season = Seasons.summer;
                break;
            case 9:
            case 10:
            case 11:
                this.season = Seasons.autumn;
                break;
            default:
                this.season = Seasons.undefined;
                break;
        }
    }
    public void showSeason(){
        System.out.println(this.season.name());
    }
}

