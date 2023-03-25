package ex18_5;

import java.awt.*;


/*5)  Создать класс Конспект. Класс должен содержать следующие поля:
        название предмета;
        ФИО студента;
        количество страниц;
        год выпуска;
        цвет обложки.
        Название заведения, где учится студент;

        Создайте публичные методы для получения доступа к полям класса,
        а также методы для присваивания значений полям класса.*/
public class Conspekt {
public String name;
public int page;
public int data;
public Color cvet;
public String nameUniver;

public String getName(){
    return name;
}
public int getPage(){
    return page;
}
public int getData(){
    return data;
}
public Color getColor(){
    return cvet;
}
public String getNameUniver(){
    return nameUniver;
}
public void setName(String name){
    this.name=name;
}
public void setPage(int page){
    this.page=page;
}
public void setData(int i){
    this.data=data;
}
public void setCvet(Color cvet){
    this.cvet=cvet;
}
public void setNameUniver(String nameUniver){
    this.nameUniver=nameUniver;
}
}
