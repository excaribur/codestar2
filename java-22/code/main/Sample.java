/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author james
 */
@RestController
public class Sample {
    @RequestMapping("/check")
    String show() {
        return "Welcome to Spring Boot";
    }
    @RequestMapping("/area")
    double showArea(double width, double height) {
        return width * height;
    }
}
