package baseball.constants;

import java.util.Arrays;

public enum SelectOption {

    RESTART("1"),
    END("2");

    private final String option;

    SelectOption(String option) {
        this.option = option;
    }

    public static SelectOption isRestart(String option) {
        return Arrays.stream(SelectOption.values())
                .filter(selectOption -> selectOption.hasOption(option))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    private boolean hasOption(String option) {
        return this.option.equals(option);
    }

}
