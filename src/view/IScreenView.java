package view;

/**
 * Интерфейс для отображения модели экрана.
 * @author Maxim Rozhkov
 */
public interface IScreenView {

    /**
     * Метод для установки во View-компонент видеопамяти цвета пикселей модели экрана.
     * @param data видеопамять (двумерный массив) цвета пикселей экрана.
     */
    void setColorData(int[][] data);

    /**
     * Метод для установки во View-компонент видеопамяти кодов символа модели экрана.
     * @param data
     */
    void setCharData(int[][] data);

    /**
     * Метод для уведомления View-компонента об изменении данных модели.
     */
    void update();
}