package nextstep.ladder.util;

import java.util.Arrays;
import java.util.List;

public class SplitUserName {

    private static final String DEFAULT_DELIMITER = ",";

    public static List<String> userNameSplitter(final String userName) {
        return Arrays.asList(userName.split(DEFAULT_DELIMITER));
    }

}
