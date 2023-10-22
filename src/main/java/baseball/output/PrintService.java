package baseball.output;

public class PrintService {
    public static void start() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }
    public static void input() {
        System.out.print("숫자를 입력해주세요 : ");
    }
    public static void inputValue(String value) {
        System.out.println(value);
    }
    public static void end() {
        System.out.print("""
            3개의 숫자를 모두 맞히셨습니다! 게임 종료
            게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.
            """);
    }
}