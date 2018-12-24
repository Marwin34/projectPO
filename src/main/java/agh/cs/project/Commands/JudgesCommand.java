package agh.cs.project.Commands;

import agh.cs.project.Model.Statistics;

import java.util.List;

public class JudgesCommand implements ICommand {

    private final Statistics statistics;

    public JudgesCommand(Statistics statistics) {
        this.statistics = statistics;
    }

    public String execute() {
        return getTop10Judges();
    }

    public String execute(List<String> args) {
        return execute();
    }

    public String getTop10Judges() {
        StringBuilder bob = new StringBuilder();

        statistics.getJudgesByJudgments().stream().limit(10).map(judge -> judge.getName() + ": " + judge.getNumberOfCases()
                + System.lineSeparator()).forEach(bob::append);

        return bob.toString();
    }

    @Override
    public String description() {
        return "Wyswietla top 10 sedziow ze wzgledu na liczbe wydanych orzeczen";
    }
}
