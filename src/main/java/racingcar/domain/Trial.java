package racingcar.domain;

import racingcar.util.Validator;

public class Trial {
    String trial;

    public Trial(String trial) {
        String test = trial.trim();
        new Validator().trial(test);
        this.trial = test; //검증 받은 시도 횟수
    }

    public int toNum(String trial) {
        return Integer.valueOf(trial);
    }

}
