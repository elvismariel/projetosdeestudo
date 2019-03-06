
import org.junit.Test;

/**
 *
 * @author elvis
 */
public class ForTest {

    @Test
    public void Case_1() {
        for (;;) {
            System.out.println("Compila");
        }
    }

    @Test
    public void Case_2() {
        int x = 0;
        long y = 10;
        for (y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(x + " ");
        }
    }

    @Test
    public void Case_3_Break() {
        int[][] list = {{1, 13, 5}, {1, 2, 5}, {2, 7, 2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;

        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    //break PARENT_LOOP;
                    break;
                }
            }
        }

        if (positionX == -1 || positionY == -1) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println("Value " + searchValue + " found at: (" + positionX + "," + positionY + ")");
        }
    }

    @Test
    public void Case_4_Continue() {
        FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b') {
                    //continue FIRST_CHAR_LOOP;
                    continue;
                }
                System.out.print(" " + a + x);
            }
        }
    }

    @Test
    public void Case_5_Test() {
        final char a = 'A', d = 'D';
        char grade = 'B';

        switch (grade) {
            case a:
            case 'B':
                System.out.print("great");
            case 'C':
                System.out.print("good");
                break;
            case d:
            case 'F':
                System.out.print("not good");
        }
    }

    @Test
    public void Case_6() {
        
    }
}