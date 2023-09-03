package hzn.javalearn.oop.taxi;

public enum Levels {
    BASIC(1,"Машина тесная и неудобная","Воняет сигаретами!","Музыка ужасная","Водитель - хам, зато дешево...")
    ,COMFORT(2,"Внутри довольно уютно!","Воздух без замечаний.", "Музыка не напрягает!", "Водитель довольно приятный.")
    ,VIP(3,"Просторно и тихо!", "Воздух свежий, приятно пахнет кожей!", "Приятная музыка, хорошая акустика",
            "Водитель вежливый и отзывчивый");
    private final String property;
    private final int value;
    private String air;
    private String music;
    private String politeDriver;
    Levels(int value,String prop,String air, String music, String politeDriver) {
        this.value = value;
        this.property = prop;
        this.air = air;
        this.music = music;
        this.politeDriver = politeDriver;
    }

    public int getValue() {
        return value;
    }
    public String getProperty() {
        return property;
    }
    public String getAir() {
        return air;
    }
    public String getMusic() {
        return music;
    }
    public String getPoliteDriver() {
        return politeDriver;
    }
    public String toString(){
        return property + '\n'
                + air + '\n'
                + music + '\n'
                + politeDriver;
    }

}