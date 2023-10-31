package racingcar.domain;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarsTest {
    private Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars();
    }

    @Test
    void 읽기전용_결과반환() {
        cars.add("a");
        List<Car> test = cars.giveResult();

        assertThatThrownBy(() -> test.set(0, new Car("new")))
                .isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    void 자동차추가_확인() {
        cars.add("a");
        cars.add("b");
        cars.add("new");
        List<Car> test = cars.getCars();

        assertThat(test.get(2).getName()).isEqualTo("new");
    }

    @Test
    void 우수성적_확인() {
        cars.add("a");
        cars.add("b");
        cars.add("c");
        List<Car> test = cars.getCars();
        test.get(0).race(4);

        assertThat(cars.maxMovement()).isEqualTo(1);
    }

    @Test
    void 우승자_확인() {
        cars.add("king");
        cars.add("boss");
        cars.add("slow");
        List<Car> test = cars.getCars();
        test.get(0).race(4);
        test.get(1).race(4);

        assertThat(cars.findWinner()).isEqualTo("king,boss");

    }
}