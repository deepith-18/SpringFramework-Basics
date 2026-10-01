//package com.rc.dto.springframework;
//
//import com.rc.ex2.Human;
//import com.rc.ex3.ClassRoom;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class SpringFrameworkApplication {
//
//    public static void main(String[] args) {
//
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("class.xml");
//
//        // Application context
////        Employee employee   = (Employee) context.getBean("employee");
//
////        Employee employee =  context.getBean(Employee.class);
////        Employee employee =  context.getBean("employee", Employee.class);
////        employee.work();
//
////
////        Human h =  context.getBean("human", Human.class);
////        h.getHeart().pumping();
//
//
//        ClassRoom classRoom = (ClassRoom) context.getBean("classRoom", ClassRoom.class);
//            classRoom.getSpeaker().sound();
//    }
//}



package com.rc.dto.springframework;

import com.rc.ex3.ClassRoom;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFrameworkApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("class.xml");

        ClassRoom classRoom =
                context.getBean("classroom", ClassRoom.class);

        classRoom.getSpeaker().sound();
    }
}