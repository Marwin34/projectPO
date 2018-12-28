package agh.cs.project.Commands;

import agh.cs.project.Model.ReferencedRegulation;
import agh.cs.project.Model.Statistics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RegulationsCommand implements ICommand {

    private Statistics statistics;

    public RegulationsCommand(Statistics statistics) {
        this.statistics = statistics;
    }

    public String execute() {
        return getTop10Regulations();
    }

    public String execute(List<String> args) {
        return "Too many argument! For more information use help." + System.lineSeparator();
    }

    public String getTop10Regulations() {
        StringBuilder bob = new StringBuilder();

        List<ReferencedRegulation> regulationsByReferentions = new ArrayList<>(statistics.getRegulations().values());

        for(ReferencedRegulation reg : regulationsByReferentions){
            if(reg.getJournalTitle().contains("Ord"))
                System.out.println(reg.getNumberOfReferentions());
        }

        Collections.sort(regulationsByReferentions, (o1, o2) -> {
            return o2.getNumberOfReferentions() - o1.getNumberOfReferentions(); // Descending.
        });

        for (int i = 0; i < 10; i++) {
            ReferencedRegulation referencedRegulation = regulationsByReferentions.get(i);
            bob.append(String.format("%s. %s%n", i + 1, referencedRegulation));
        }
        return bob.toString();
    }

    @Override
    public String description() {
        return "Display most quoted regulations. Used without arguments.";
    }
}
