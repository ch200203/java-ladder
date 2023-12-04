package nextstep.ladder.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    @DisplayName("우측 가로선이 존재하는 경우 True를 반환한다.")
    void hasRightLineTest() {
        assertThat(new Point(true).hasRight()).isTrue();
    }

    @Test
    @DisplayName("우측 가로선이 존재하는 경우 True를 반환한다.")
    void withoutRightLineTest() {
        assertThat(new Point(false).hasRight()).isFalse();
    }

}