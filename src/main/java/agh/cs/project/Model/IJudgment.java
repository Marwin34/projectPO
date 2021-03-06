package agh.cs.project.Model;

import java.util.List;

public interface IJudgment {
    int numberOfJudges();

    String getSignature();

    CourtType getCourtType();

    String getJudgmentDate();

    String getJustification();

    List<AbstractRegulation> getReferencedRegulations();

    List<AbstractJudge> getJudges();
}
