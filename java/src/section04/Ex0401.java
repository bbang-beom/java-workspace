package section04;

public class Ex0401 {
    public static void main(String[] args) {
        System.out.println("주문하신 커피 나왔습니다.");
        System.out.println("시럽을 넣어 드릴까요?");

        boolean responseBoolean = false;
        if (responseBoolean) {
            System.out.println("시럽을 넣었습니다.");
        }
        System.out.println("만족도 조사에 참여하시겠어요?");
        System.out.println();
        System.out.println("질문 1: 다음에도 저희 매장에 방문하시겠어요?(O, X)");

        char responseChar = 'O';
        if (responseChar == 'O') {
            System.out.println("O를 체크하셨습니다");
        } else if (responseChar == 'X') {
            System.out.println("X를 체크하셨습니다.");
        }
        System.out.println();
        System.out.println("질문2: 오늘 커피 맛에 만족하시나요? (만족, 보통, 불만족)");

        int responseInt = 1;
        if (responseInt == 1) {
            System.out.println("1. 만족");
        } else if (responseInt == 2) {
            System.out.println("2. 보통");
        } else if (responseInt == 3) {
            System.out.println("3. 불만족");
        }
        System.out.println();
        
        System.out.println("질문3: 오늘 커피 맛에 만족하시나요? (매우 만족, 만족, 보통, 불만족, 매우 불만족)");
        if (responseInt == 1) {
            System.out.println("1. 매우 만족");
        } else if (responseInt == 2) {
            System.out.println("2. 만족");
        } else if (responseInt == 3) {
            System.out.println("3. 보통");
        } else if (responseInt == 4) {
            System.out.println("4: 불만족");
        } else if (responseInt == 5) {
            System.out.println("5: 매우 불만족");
        }
        System.out.println();

        switch (responseInt) {
            case 1:
            System.out.println("1. 매우 만족");
                break;
            case 2:
            System.out.println("2. 만족");
            break;
            case 3:
            System.out.println("3. 보통");
            break;
            case 4:
            System.out.println("4: 불만족");
            break;
            case 5:
            System.out.println("5: 매우 불만족");
            break;
            default:
                break;
        }
    }
}
