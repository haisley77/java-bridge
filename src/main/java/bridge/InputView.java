package bridge;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {
    public static int bridge_size;
    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        OutputView.printStart();
        System.out.println("\n다리의 길이를 입력해주세요.");
        bridge_size = Integer.parseInt(Console.readLine());
        return bridge_size;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        System.out.println("\n이동할 칸을 선택해주세요. (위: U, 아래: D)");
        String moving = Console.readLine();
        return moving;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        System.out.println("\n게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
        String game_command = Console.readLine();
        return game_command;
    }
}
