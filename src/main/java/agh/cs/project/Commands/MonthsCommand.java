package agh.cs.project.Commands;

import agh.cs.project.Model.Statistics;

import java.util.List;

public class MonthsCommand implements ICommand {

    private final Statistics statistics;

    public MonthsCommand(Statistics statistics) {
        this.statistics = statistics;
    }

    @Override
    public String execute() {
        String months[] = {
                "Styczeń",
                "Luty",
                "Marzec",
                "Kwiecień",
                "Maj",
                "Czerwiec",
                "Lipiec",
                "Sierpień",
                "Wrzesień",
                "Październik",
                "Listopad",
                "Grudzień"
        };

        StringBuilder bob = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            if (statistics.getJudgmentsOverMonths().containsKey(i)) {
                bob.append(months[i])
                        .append(": ")
                        .append(statistics.getJudgmentsOverMonths().get(i))
                        .append(" judgments.")
                        .append(System.lineSeparator());
            } else
                bob.append(months[i])
                        .append(": 0 judgments.")
                        .append(System.lineSeparator());
        }
        return bob.toString();
    }

    @Override
    public String execute(List<String> args) {
        return "This command don't need arguments.";
    }

    @Override
    public String description() {
        return "Display number of judgments over months.";
    }
}