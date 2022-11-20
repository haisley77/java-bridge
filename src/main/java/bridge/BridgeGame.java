package bridge;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {

    public static int try_count = 1;

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void move(String moving) {
        // 사용자가 이동할 칸 moving, 다리 index
        if (moving.equals(BridgeMaker.bridge_info.get(BridgeMaker.bridge_index)) && moving.equals("U")){
            System.out.print(" O ");
        }
        if (moving.equals(BridgeMaker.bridge_info.get(BridgeMaker.bridge_index)) && moving.equals("D")){
            System.out.print(" X ");
        }

    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
        BridgeMaker.bridge_index = 0;
        try_count++;
    }
}
