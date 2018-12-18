package NovJavaProgramming.dataStructure.bestCountriesToLiveIn;

public class HappinessRecord {
    private String Country;
    private Integer rank;
    private Double score;

    public HappinessRecord(String country, Integer rank, Double score) {
        Country = country;
        this.rank = rank;
        this.score = score;
    }

    public String getCountry() {
        return Country;
    }

    public Integer getRank() {
        return rank;
    }

    public Double getScore() {
        return score;
    }
}
