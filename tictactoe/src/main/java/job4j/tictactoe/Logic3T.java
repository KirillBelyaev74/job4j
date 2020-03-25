package job4j.tictactoe;

import java.util.Arrays;
import java.util.function.Predicate;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY) {
        boolean result = true;
        for (int index = 0; index != this.table.length; index++) {
            Figure3T cell = this.table[startX][startY];
            startX += deltaX;
            startY += deltaY;
            if (!predicate.test(cell)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public boolean isWinnerX() {
        return Arrays.stream(this.matrix())
                .anyMatch(arr -> this.fillBy(Figure3T::hasMarkX, arr[0], arr[1], arr[2], arr[3]));
    }

    public boolean isWinnerO() {
        return Arrays.stream(this.matrix())
                .anyMatch(arr -> this.fillBy(Figure3T::hasMarkO, arr[0], arr[1], arr[2], arr[3]));
    }

    public boolean hasGap() {
        return  Arrays.stream(this.table)
                .flatMap(Arrays::stream)
                .anyMatch(x -> !x.hasMarkO() && !x.hasMarkX());
    }

    public int[][] matrix() {
        return new int[][] {
                {0, 0, 1, 0},
                {0, 0, 0, 1},
                {0, 0, 1, 1},
                {0, 1, 1, 0},
                {0, 2, 1, -1},
                {0, 2, 0, -1},
                {0, 2, 1, 0},
                {1, 2, 0, -1},
                {2, 2, 0, -1},
                {2, 2, -1, 0},
                {2, 1, -1, 0},
                {2, 0, -1, 0},
                {2, 0, 0, 1},
                {2, 0, -1, 1},
                {1, 0, 0, 1},
                {2, 2, -1, -1}
        };
    }
}
