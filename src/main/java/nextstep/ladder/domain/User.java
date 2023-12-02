package nextstep.ladder.domain;

public class User {

    private static final int DEFAULT_NAME_LENGTH = 5;

    private final String userName;

    public User(final String userName) {
        validateUserName(userName);
        this.userName = userName;
    }

    private void validateUserName(final String userName) {
        if (userName.length() > DEFAULT_NAME_LENGTH) {
            throw new IllegalArgumentException("유저명은 5글자를 넘길 수 없습니다.");
        }
    }

}
