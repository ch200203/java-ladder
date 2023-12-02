package nextstep.ladder.domain;


import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    @DisplayName("게임의 참가하는 유저의 이름은 5글자를 넘을 수 없다.")
    void userNameLengthFailTest() {
        String userName = "크리스티아누호날두";
        assertThatIllegalArgumentException().isThrownBy(() -> new User(userName));
    }

}