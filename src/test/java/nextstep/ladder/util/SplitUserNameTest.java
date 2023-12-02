package nextstep.ladder.util;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SplitUserNameTest {

    @Test
    @DisplayName("',' 를 기준으로 유저명을 구분하여 List로 반환한다.")
    void splitUserNameTest() {
        String userNames = "호날두,메시,손흥민,음바페,홀란드";
        assertThat(SplitUserName.userNameSplitter(userNames)).hasSize(5);
    }

}