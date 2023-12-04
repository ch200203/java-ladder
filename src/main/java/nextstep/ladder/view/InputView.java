package nextstep.ladder.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import nextstep.ladder.util.SplitUserName;

public class InputView {

    private static final String INPUT_NAMES_MESSAGE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String  INPUT_LADDER_HEIGHT_MESSAGE = "최대 사다리 높이는 몇 개인가요?";
    private static final Scanner scan = new Scanner(System.in);

    public List<String> inputNames() {
        System.out.println(INPUT_NAMES_MESSAGE);
        return SplitUserName.userNameSplitter(scan.nextLine());
    }

    public int inputHeight() {
        System.out.println(INPUT_LADDER_HEIGHT_MESSAGE);
        return scan.nextInt();
    }
}
