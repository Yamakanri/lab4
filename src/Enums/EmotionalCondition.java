package Enums;

public enum EmotionalCondition {
    INSOMNIA (" бессонница"),
    CALM (" спокойствие"),
    LAUGH (" смех"),
    DETERMINED (" решительно"),
    STUBBORN (" упертость"),
    IDEA (" появление идеи "),
    GROUCHINESS(" ворчливость"),
    FORGETFULNESS(" забывчивость"),
    FEARLESSNESS(" бесстрашие"),
    CARELESS(" безразличие"),
    MISUNDERSTANDING(" непонимание"),
    DISTRACTION("рассеянность"),
    DIZZINESS("головокружение"),
    HAPPY("счастье"),
    FEAR("страх"),
    SURPRISE("удивление"),
    REALIZATION("осознание"),
    THOUGHT("задумчивость");


    private String title;

    EmotionalCondition(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}