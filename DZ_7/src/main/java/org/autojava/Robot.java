package org.autojava;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Getter
public class Robot {
    private static String develiper = "BostonDimans";
    private String model;
    private String serail_number;
    private int heigth;
    private int width;
    private int voltageBattary;
    private Operation_mode work;
    private String color;

    public Robot(String model, String serail_number, int heigth, int width, int voltageBattary,  Operation_mode work) {
        this.heigth = heigth;
        this.model = model;
        this.serail_number = serail_number;
        this.voltageBattary = voltageBattary;
        this.width = width;
        this.work = work;
        this.color = Color.getRobotColor(serail_number);

    }

    public static void doSendMassage(){
        System.out.println("Сообщение... ");
    }

    @Override
    public String toString() {
        return "Robot{" +
                "heigth=" + heigth +
                ", model='" + model + '\'' +
                ", serail_number='" + serail_number + '\'' +
                ", width=" + width +
                ", voltageBattary=" + voltageBattary +
                ", work=" + work +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return heigth == robot.heigth && width == robot.width && voltageBattary == robot.voltageBattary && Objects.equals(model, robot.model) && Objects.equals(serail_number, robot.serail_number) && work == robot.work;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, serail_number, heigth, width, voltageBattary, work);
    }
}

enum Operation_mode {
    hunting,
    guard,
    intelligence,
    escuer,
    cleanung,
    nanny
};

enum Color{
    q24P("RED"), f253("GREEN"), rew4("BLUE");

    private String cName;
    private String getCName(){
        return cName;
    }
    Color(String cName){
        this.cName = cName;
    }

    public static String getRobotColor(String b){
        Color cArray[] = Color.values();
        String name= "";
        for (Color g: cArray){
            if (StringUtils.startsWith(b, g.toString())) {
                name = g.getCName();
            }
        }
        return name;
    }
}