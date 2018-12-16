package agh.cs.project.Model;

import agh.cs.project.HTMLCLasses.HTMLRegulation;
import agh.cs.project.JSONClasses.JSONRegulation;

public class ReferencedRegulation {

    private String journalTitle;
    private int journalNo;
    private int journalYear;
    private int journalEntry;

    private int numberOfReferentions;

    public ReferencedRegulation(AbstractRegulation regulation){
        journalTitle = regulation.getJournalTitle();
        journalNo = regulation.getJournalNo();
        journalYear = regulation.getJournalYear();
        journalEntry = regulation.getJournalEntry();

        numberOfReferentions = 0;
    }

    public ReferencedRegulation(HTMLRegulation regulation){
        journalTitle = regulation.getJournalTitle();
        journalNo = regulation.getJournalNo();
        journalYear = regulation.getJournalYear();
        journalEntry = regulation.getJournalEntry();

        numberOfReferentions = 0;
    }

    public void incremenetNumberOfReferentions(){
        numberOfReferentions++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReferencedRegulation that = (ReferencedRegulation) o;

        if (journalNo != that.journalNo) return false;
        if (journalYear != that.journalYear) return false;
        return journalEntry == that.journalEntry;
    }

    @Override
    public int hashCode() {
        int result = journalNo;
        result = 31 * result + journalYear;
        result = 31 * result + journalEntry;
        return result;
    }

    @Override
    public String toString(){
        return journalTitle + ": " + numberOfReferentions;
    }

    public int getNumberOfReferentions() {
        return numberOfReferentions;
    }
}
