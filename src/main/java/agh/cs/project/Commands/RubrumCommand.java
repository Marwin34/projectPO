package agh.cs.project.Commands;

import agh.cs.project.Model.DataLoader;

import java.util.List;

public class RubrumCommand implements ICommand {

    private final DataLoader loader;

    public RubrumCommand(DataLoader loader) {
        this.loader = loader;
    }

    @Override
    public String execute() {
        System.out.println("a");
        return null;
    }

    @Override
    public String execute(List<String> args) {
        StringBuilder bob = new StringBuilder();
        for(String signature : args){
            bob.append(loader.getJudgments().get(signature).showRubrum());
        }
        return bob.toString();
    }

    @Override
    public String description() {
        return "Wyswietla metryke danej sprawy.";
    }
}
