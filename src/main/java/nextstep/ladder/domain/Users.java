package nextstep.ladder.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Users {

    private List<User> users;

    private Users(final List<User> users) {
        this.users = users;
    }

    public static Users of(List<String> userNames) {
        return new Users(
            userNames.stream()
                .map(User::new)
                .collect(Collectors.toList())
        );
    }

}
