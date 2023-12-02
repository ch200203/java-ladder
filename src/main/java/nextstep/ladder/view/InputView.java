package nextstep.ladder.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import nextstep.ladder.util.SplitUserName;

public class InputView {

    private static final String INPUT_NAMES_MESSAGE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";

    private static final Scanner scan = new Scanner(System.in);

    public List<String> inputNames() {
        System.out.println(INPUT_NAMES_MESSAGE);
        return SplitUserName.userNameSplitter(scan.nextLine());
    }
}
