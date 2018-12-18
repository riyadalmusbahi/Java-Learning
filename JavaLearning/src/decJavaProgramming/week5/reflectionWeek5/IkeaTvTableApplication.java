package decJavaProgramming.week5.reflectionWeek5;

public class IkeaTvTableApplication {

    public static void main(String[] args) {

        TvTableBuilder tvTableBuilder = new TvTableBuilder();
        TvTable tvTable = (TvTable) tvTableBuilder.build();
        System.out.println("TV table: " + tvTable);

    }
}
