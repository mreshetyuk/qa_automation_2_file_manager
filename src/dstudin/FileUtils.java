package dstudin;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {


    /**
     * Методы могут быть
     * 1) public - доступны как внутри класса, так и за его пределами
     * 2) private - доступны только в пределах данного класса
     * Более подробно читайте тут:
     * 1) http://kulibaba.net/programming/java/lesson4
     * 2) http://cybern.ru/java-package.html
     * 3) http://www.quizful.net/interview/java/access-modifiers
     */
    public void createFile(String fullPathToFile) {
        File f = new File(fullPathToFile);

        // начало блока обработки возможной ислючительной ситуации
        try {
            f.createNewFile();  // код, который потенциально может вызвать исключение (исключительную ситуацию), если
            // у программы не будет прав на работу с файлом или директорией, которые вы указали.
        } catch (IOException e) {
            e.printStackTrace(); // код, который выполниться, если возникнет исклбчительная ситуация
        }
        // конец блока обработки возможной исключительной ситуации

    }

    /**
     * Каждый метод имеет право возвращать что-либо либо не возвращать.
     * если метод ничего не собирается возвращать,
     * используйте ключевое слово void, как в примере ниже
     */
    public void deleteFile(String fullPathToFile) {
        //TODO - это тудушка, вставляйте ее в те части кода,
        // TODO - в которых не уверены, но хотите показать общий ход решения.
    }

    public void renameFile(String fullPathToFile) {
        //TODO - это тудушка, вставляйте ее в те части кода,
        // TODO - в которых не уверены, но хотите показать общий ход решения.
    }

    public int findWordOccurrenceInFile(String fullPathToFile, String word) {
        int count = 0;
        //TODO - цикл что бы пройтись по всему файлу
        // TODO - так же нужен будет if что бы увеличивать count
        // System.out.println("Word: " + word + " is present " + count + " in file " + fullPathToFile);
        return count;
    }

    public void replaceWordInFile(String fullPathToFile, String word) {
        //TODO
    }

    /**
     * Этот метод помечен, как private - это означает, что авто не желает что бы логика работы с файлами
     * была размазаны по другим классам.
     * Автор следует принципу
     * 'Single Responsibility' - каждый объект должен иметь одну обязанность и эта обязанность должна быть
     * полностью инкапсулирована в класс. Все его сервисы должны быть направлены исключительно
     * на обеспечение этой обязанности.
     * <p/>
     * Если метод должен выполнить некоторое действие и передать результат
     * в то место откуда он был вызван, то неоходимо указать,
     * какого типа будет возвращаемое значение. Например, мы хотим создавать
     * новый файл, но не уверены что случайно не затрем старый. Для этого будет полезен
     * следуюзий метод в связке с createFile();
     * <p/>
     * Параметры - это локальное хранилище для передаваемых на вход методу значений,
     * которое он использует в своем теле согласно призначенному имени. Значения и имена переменных
     * присваиваются слева на право внутри () скобок после имени метода.
     * <p/>
     * String fullPathToFile - говорит о том, что когда в классе Main или другом, этот метод
     * будет вызван ему обязаны передать строку - полный путь к файлу на вашем диске.
     *
     * @return will return true if file exist and false if file doesn't exist
     */
    private boolean fileExist(String fullPathToFile) {
        // 'Path' used to locate a file in a file system. It will
        // typically represent a system dependent file path.
        Path path = Paths.get(fullPathToFile);

        //  'Files' class consists exclusively of static methods that operate on files,
        // directories, or other types of files.
        if (Files.exists(path)) {
            return true;
        }
        return true;

    }
}
