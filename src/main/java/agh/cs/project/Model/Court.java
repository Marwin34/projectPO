package agh.cs.project.Model;

public class Court {

    private CourtType courtType;
    private int numberOfJudgments;

    public Court(CourtType courtType) {
        this.courtType = courtType;
        numberOfJudgments = 0;
    }

    public void incrementNumberOfJudgments() {
        numberOfJudgments++;
    }

    public int getNumberOfJudgments(){
        return numberOfJudgments;
    }

    @Override
    public String toString(){
        return courtType.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Court court = (Court) o;

        return courtType != null ? courtType.equals(court.courtType) : court.courtType == null;
    }

    public boolean isDumb(){
        return courtType == CourtType.DUMB;
    }
}
