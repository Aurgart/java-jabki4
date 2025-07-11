public class Main {
    public static void main(String[] args) {
        /*
        * Одномерные массивы
- Создайте метод, который выводит массив в консоль.
- Напишите метод, который принимает массив целых чисел и возвращает сумму всех его элементов.
- Реализуйте метод для поиска минимального элемента в одномерном массиве
- Создайте массив строк, инициализируйте его названиями месяцев года. Выведите все строки, начинающиеся на букву "М"
- Напишите метод, который инвертирует порядок элементов в одномерном массиве
- Напишите метод, который проверяет, есть ли в массиве повторяющиеся элементы
- Напишите метод, который заменяет все отрицательные числа в массиве на их абсолютные значения.

Многомерные массивы
- Создайте двумерный массив 3x3, заполните его единицами на главной диагонали и нулями в остальных ячейках. Выведите массив
- Напишите метод, вычисляющий сумму всех элементов в двумерном массиве
- Реализуйте поиск максимального элемента в матрице и вывод его координат (строка, столбец)
- Реализуйте проверку, является ли двумерный массив квадратным (количество строк = количеству столбцов)
- Напишите метод, который находит сумму элементов каждой строки, минимальное и максимальное значение двумерного массива и выводит результаты
- Создайте двумерный массив, заполните его так, чтобы элементы на четных позициях были 0, на нечетных — 1.
* */
        System.out.println("Ну че, погнали!");
        System.out.println("Задание 1.1");
        int[] arr = {1, 2, 3, 5, 6, 111, 2};
        printArray(arr);

        System.out.println("Задание 1.2");
        System.out.println("Сумма: " + sumArray(arr));

        System.out.println("Задание 1.3");
        System.out.println("Мин элемент: " + findMin(arr));

        System.out.println("Задание 1.4");
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        printMStrings(months);

        System.out.println("Задание 1.5");
        printArray(arr);
        System.out.println("После инвертирования:");
        printArray(invertArray(arr));

        System.out.println("Задание 1.6");
        System.out.println("Есть ли повторения: " + checkSameElems(arr));

        System.out.println("Задание 1.7");
        int[] arr2 = {134, -2, 3, -5, -6, 111};
        printArray(arr2);
        System.out.println("После модуля:");
        printArray(absArr(arr2));

        System.out.println("Погнали двухмерку! \n Задание 2.1.");
        int[][] arrDiag = get2SidedArr(4, 3);

        System.out.println("Задание 2.2");
        int[][] arrSided = {{1, 2, 3, 4, 5}, {-10, 20, 3, 6}};
        System.out.println("Сумма: " + sumArray(arrSided));

        System.out.println("Задание 2.3");
        System.out.println(getMaxElem(arrSided, 0));

        System.out.println("Задание 2.4");
        System.out.println("Квадратный ли массив: " + isSquareArray(arrDiag));

        System.out.println("Задание 2.5");
        getDimArrInfo(arrSided);

        System.out.println("Задание 2.6");
        int[][] arrOnesZero = getArr(3, 5);
        printArray(arrOnesZero);

    }

    /**
     * Функция печати одномерного массива
     * Задание 1.1
     *
     * @param arr
     */
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print('\n');
    }

    /**
     * Возвращаем сумму элементов целочисленного массива
     * Задание 1.2
     *
     * @param arr
     * @return
     */
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    /**
     * Примитивный поиск максимума
     * Задание 1.3
     *
     * @param numbers - массив чисел
     * @return - максимальное
     */
    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    /**
     * Печатает все строки начинающиеся с M
     * Задание 1.4
     *
     * @param monthList
     */
    public static void printMStrings(String[] monthList) {
        for (String i : monthList) {
            if (i.charAt(0) == 'M') {
                System.out.println(i);
            }
        }
    }

    /**
     * Инвертирует Массив
     * Задание 1.5
     *
     * @param arr
     * @return
     */
    public static int[] invertArray(int[] arr) {
        int i = 0;
        while (i < arr.length - i) {
            int tmpswap = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmpswap;
            i++;
        }
        return arr;
    }

    /**
     * Проверяет есть ли повторящиеся элементы в массиве
     * Задание 1.6
     *
     * @param arr
     * @return
     */
    public static boolean checkSameElems(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Переводит отрицательные элементы в положительные
     * Задание 1.7
     *
     * @param arr
     * @return
     */
    public static int[] absArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                // можно заменить на Math.abs но зачем)
                arr[i] = arr[i] * -1;
            }
        }
        return arr;
    }

    /**
     * Печать двумерного массива.
     *
     * @param arr
     */
    public static void printArray(int[][] arr) {
        for (int[] i : arr) {
            printArray(i);
        }
    }

    /**
     * Создает 2 мерный массив, и заполняет его 1 по диагонали.
     * Выводит массив и возвращает его
     * Задание 2.1
     *
     * @param width
     * @param height
     * @return
     */
    public static int[][] get2SidedArr(int height, int width) {
        int[][] newArr = new int[height][width];
        for (int i = 0; i < width; i++) {
            if (i >= height) {
                break;
            } else {
                newArr[i][i] = 1;
            }
        }
        for (int i = 0; i < height; i++) {
            printArray(newArr[i]);
        }
        return newArr;
    }

    /**
     * Возвращает сумму двухмерного массива
     * Задание 2.2
     *
     * @param arr
     * @return
     */
    public static int sumArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += sumArray(arr[i]);
        }
        return sum;
    }

    /**
     * Примитивный поиск максимума
     *
     * @param numbers - массив чисел
     * @return - максимальное
     */
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    /**
     * Функция находит максимальный элемент в двумерном массиве
     * и печатает его координаты
     * Задание 2.3
     *
     * @param arr
     * @param onlyReturn - возвращать только максимальный элемент без вывода.
     */
    public static int getMaxElem(int[][] arr, int onlyReturn) {
        int x = 0;
        int y = 0;

        int max_element = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max_element < arr[i][j]) {
                    max_element = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        if (onlyReturn == 0) {
            System.out.println("Максимальный элемент: " + max_element + " координаты: " + x + " , " + y);
        }
        return max_element;
    }

    /**
     * Возвращает минимальный элемент двумерного массива.
     *
     * @param arr
     * @return
     */
    public static int getMinElem(int[][] arr) {
        int min_element = findMin(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int tmp = findMin(arr[i]);
            if (min_element > tmp) {
                min_element = tmp;
            }
        }
        return min_element;
    }

    /**
     * Возвращает квадратный ли массив или нет
     * Задание 2.4
     *
     * @param arr
     * @return
     */
    public static boolean isSquareArray(int[][] arr) {
        return arr.length == arr[0].length;
    }

    /**
     * Выводит сумму каждой строки массива
     * И максимальный и минимальный элемент
     * Задание 2.5
     *
     * @param arr
     */
    public static void getDimArrInfo(int[][] arr) {
        System.out.println("Информация по массиву:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Строка " + i + " Сумма строки: " + sumArray(arr[i]));
        }
        int max_elem = arr[0][0];
        int min_elem = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max_elem < arr[i][j]) {
                    max_elem = arr[i][j];
                }
                if (min_elem > arr[i][j]) {
                    min_elem = arr[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент: " + max_elem);
        System.out.println("Минимальный элемент: " + min_elem);
    }

    /**
     * Создает и возвращает двумерный массив
     * где на четных позициях нули, а на нечетных 1
     * Задание 2.6
     *
     * @return
     */
    public static int[][] getArr(int height, int width) {
        int[][] arr = new int[height][width];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j % 2 == 0 && j != 0) {
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }
}